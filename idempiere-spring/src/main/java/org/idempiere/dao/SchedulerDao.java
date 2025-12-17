package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Scheduler;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Scheduler operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface SchedulerDao extends CrudDao<Scheduler, Integer, SQLBuilder.NSC, SchedulerDao> {

    @Select("SELECT * FROM AD_Scheduler WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Scheduler> findByName(String name, int clientId);

    @Select("SELECT * FROM AD_Scheduler WHERE AD_Process_ID = :processId AND IsActive = 'Y' ORDER BY Name")
    List<Scheduler> findByProcess(int processId);

    @Select("SELECT * FROM AD_Scheduler WHERE DateNextRun <= CURRENT_TIMESTAMP AND IsActive = 'Y' ORDER BY DateNextRun")
    List<Scheduler> findReadyToRun();

    @Select("SELECT * FROM AD_Scheduler WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Scheduler> findByClient(int clientId);

    @Select("SELECT * FROM AD_Scheduler WHERE IsActive = 'Y' ORDER BY Name")
    List<Scheduler> findAllActive();
}
