package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.PriceList;

/**
 * DAO interface for PriceList entity operations.
 */
public interface PriceListDao extends CrudDao<PriceList, Integer, SQLBuilder.PSC, PriceListDao> {

    @Query("SELECT * FROM M_PriceList WHERE IsActive = 'Y' ORDER BY Name")
    List<PriceList> findAllActive();

    @Query("SELECT * FROM M_PriceList WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<PriceList> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM M_PriceList WHERE IsDefault = 'Y' AND IsSOPriceList = :isSOPriceList AND AD_Client_ID = :clientId")
    Optional<PriceList> findDefault(String isSOPriceList, Integer clientId);

    @Query("SELECT * FROM M_PriceList WHERE IsSOPriceList = :isSOPriceList AND AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<PriceList> findBySOPriceList(String isSOPriceList, Integer clientId);

    @Query("SELECT * FROM M_PriceList WHERE C_Currency_ID = :currencyId AND IsActive = 'Y' ORDER BY Name")
    List<PriceList> findByCurrency(Integer currencyId);
}
