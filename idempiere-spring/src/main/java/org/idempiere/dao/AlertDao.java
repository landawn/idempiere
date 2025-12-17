package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Alert;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Alert operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface AlertDao extends CrudDao<Alert, Integer, SQLBuilder.NSC, AlertDao> {

    @Select("SELECT * FROM AD_Alert WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Alert> findByName(String name, int clientId);

    @Select("SELECT * FROM AD_Alert WHERE AD_AlertProcessor_ID = :alertProcessorId AND IsActive = 'Y' ORDER BY Name")
    List<Alert> findByAlertProcessor(int alertProcessorId);

    @Select("SELECT * FROM AD_Alert WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Alert> findByClient(int clientId);

    @Select("SELECT * FROM AD_Alert WHERE IsValid = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Alert> findValidAlerts();

    @Select("SELECT * FROM AD_Alert WHERE IsActive = 'Y' ORDER BY Name")
    List<Alert> findAllActive();
}
