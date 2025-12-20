package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.AcctSchema;

/**
 * DAO interface for AcctSchema entity operations.
 */
public interface AcctSchemaDao extends CrudDao<AcctSchema, Integer, SQLBuilder.PSC, AcctSchemaDao> {

    @Query("SELECT * FROM C_AcctSchema WHERE Name = :name AND IsActive = 'Y'")
    Optional<AcctSchema> findByName(String name);

    @Query("SELECT * FROM C_AcctSchema WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<AcctSchema> findByClientId(Integer clientId);

    @Query("SELECT * FROM C_AcctSchema WHERE C_Currency_ID = :currencyId AND IsActive = 'Y'")
    List<AcctSchema> findByCurrencyId(Integer currencyId);

    @Query("SELECT * FROM C_AcctSchema WHERE GAAP = :gaap AND IsActive = 'Y'")
    List<AcctSchema> findByGaap(String gaap);

    @Query("SELECT * FROM C_AcctSchema WHERE IsActive = 'Y'")
    List<AcctSchema> findAllActive();

    @Query("SELECT * FROM C_AcctSchema WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY C_AcctSchema_ID LIMIT 1")
    Optional<AcctSchema> findDefault(Integer clientId);
}
