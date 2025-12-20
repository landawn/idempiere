package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.CashBook;

/**
 * DAO interface for CashBook entity operations.
 */
public interface CashBookDao extends CrudDao<CashBook, Integer, SQLBuilder.PSC, CashBookDao> {

    @Query("SELECT * FROM C_CashBook WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<CashBook> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM C_CashBook WHERE IsDefault = 'Y' AND AD_Org_ID = :orgId")
    Optional<CashBook> findDefaultByOrg(Integer orgId);

    @Query("SELECT * FROM C_CashBook WHERE AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY Name")
    List<CashBook> findByOrg(Integer orgId);

    @Query("SELECT * FROM C_CashBook WHERE C_Currency_ID = :currencyId AND IsActive = 'Y' ORDER BY Name")
    List<CashBook> findByCurrency(Integer currencyId);
}
