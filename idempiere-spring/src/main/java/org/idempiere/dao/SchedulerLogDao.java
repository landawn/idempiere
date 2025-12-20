package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.SchedulerLog;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface SchedulerLogDao extends CrudDao<SchedulerLog, Integer, SQLBuilder.PSC, SchedulerLogDao> {

    @Query("SELECT * FROM AD_SchedulerLog WHERE AD_Scheduler_ID = :schedulerId ORDER BY Created DESC")
    List<SchedulerLog> findByScheduler(Integer schedulerId);

    @Query("SELECT * FROM AD_SchedulerLog WHERE IsError = 'Y' ORDER BY Created DESC")
    List<SchedulerLog> findErrors();
}
