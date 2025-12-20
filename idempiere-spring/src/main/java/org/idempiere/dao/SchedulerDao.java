package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Scheduler;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Scheduler operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface SchedulerDao extends CrudDao<Scheduler, Integer, SQLBuilder.PSC, SchedulerDao> {

    @Query("SELECT * FROM AD_Scheduler WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Scheduler> findByName(String name, int clientId);

    @Query("SELECT * FROM AD_Scheduler WHERE AD_Process_ID = :processId AND IsActive = 'Y' ORDER BY Name")
    List<Scheduler> findByProcess(int processId);

    @Query("SELECT * FROM AD_Scheduler WHERE DateNextRun <= CURRENT_TIMESTAMP AND IsActive = 'Y' ORDER BY DateNextRun")
    List<Scheduler> findReadyToRun();

    @Query("SELECT * FROM AD_Scheduler WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Scheduler> findByClient(int clientId);

    @Query("SELECT * FROM AD_Scheduler WHERE IsActive = 'Y' ORDER BY Name")
    List<Scheduler> findAllActive();
}
