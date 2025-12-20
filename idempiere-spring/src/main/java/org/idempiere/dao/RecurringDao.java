package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Recurring;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Recurring Document operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface RecurringDao extends CrudDao<Recurring, Integer, SQLBuilder.PSC, RecurringDao> {

    @Query("SELECT * FROM C_Recurring WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Recurring> findByName(String name, int clientId);

    @Query("SELECT * FROM C_Recurring WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Recurring> findByClient(int clientId);

    @Query("SELECT * FROM C_Recurring WHERE RecurringType = :recurringType AND IsActive = 'Y' ORDER BY Name")
    List<Recurring> findByRecurringType(String recurringType);

    @Query("SELECT * FROM C_Recurring WHERE RunsRemaining > 0 AND IsActive = 'Y' ORDER BY DateNextRun")
    List<Recurring> findActiveRecurring();

    @Query("SELECT * FROM C_Recurring WHERE DateNextRun <= CURRENT_TIMESTAMP AND RunsRemaining > 0 AND IsActive = 'Y' ORDER BY DateNextRun")
    List<Recurring> findDueRecurring();

    @Query("SELECT * FROM C_Recurring WHERE IsActive = 'Y' ORDER BY Name")
    List<Recurring> findAllActive();
}
