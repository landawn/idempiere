package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Charge;

/**
 * DAO interface for Charge entity operations.
 */
public interface ChargeDao extends CrudDao<Charge, Integer, SQLBuilder.PSC, ChargeDao> {

    @Query("SELECT * FROM C_Charge WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Charge> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM C_Charge WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Charge> findByClient(Integer clientId);

    @Query("SELECT * FROM C_Charge WHERE IsSameCurrency = 'Y' AND IsActive = 'Y'")
    List<Charge> findSameCurrencyCharges();

    @Query("SELECT * FROM C_Charge WHERE IsActive = 'Y' ORDER BY Name")
    List<Charge> findAllActive();

    @Query("SELECT * FROM C_Charge WHERE ChargeAmt > 0 AND AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Charge> findExpenseType(Integer clientId);
}
