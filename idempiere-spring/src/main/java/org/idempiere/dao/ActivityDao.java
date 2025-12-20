package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Activity;

/**
 * DAO interface for Activity entity operations.
 */
public interface ActivityDao extends CrudDao<Activity, Integer, SQLBuilder.PSC, ActivityDao> {

    @Query("SELECT * FROM C_Activity WHERE Value = :value AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Activity> findByValueAndClient(String value, Integer clientId);

    @Query("SELECT * FROM C_Activity WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Activity> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM C_Activity WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Value")
    List<Activity> findByClient(Integer clientId);

    @Query("SELECT * FROM C_Activity WHERE IsSummary = 'N' AND IsActive = 'Y' ORDER BY Value")
    List<Activity> findNonSummary();

    @Query("SELECT * FROM C_Activity WHERE IsActive = 'Y' ORDER BY Value")
    List<Activity> findAllActive();
}
