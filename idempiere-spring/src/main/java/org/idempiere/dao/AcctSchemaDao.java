package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.AcctSchema;

/**
 * DAO interface for AcctSchema entity operations.
 */
public interface AcctSchemaDao extends CrudDao<AcctSchema, Integer, SQLBuilder.NSC, AcctSchemaDao> {

    @Select("SELECT * FROM C_AcctSchema WHERE Name = :name AND IsActive = 'Y'")
    Optional<AcctSchema> findByName(String name);

    @Select("SELECT * FROM C_AcctSchema WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<AcctSchema> findByClientId(Integer clientId);

    @Select("SELECT * FROM C_AcctSchema WHERE C_Currency_ID = :currencyId AND IsActive = 'Y'")
    List<AcctSchema> findByCurrencyId(Integer currencyId);

    @Select("SELECT * FROM C_AcctSchema WHERE GAAP = :gaap AND IsActive = 'Y'")
    List<AcctSchema> findByGaap(String gaap);

    @Select("SELECT * FROM C_AcctSchema WHERE IsActive = 'Y'")
    List<AcctSchema> findAllActive();
}
