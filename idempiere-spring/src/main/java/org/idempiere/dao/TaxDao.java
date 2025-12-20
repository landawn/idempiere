package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Tax;

/**
 * DAO interface for Tax entity operations.
 */
public interface TaxDao extends CrudDao<Tax, Integer, SQLBuilder.PSC, TaxDao> {

    @Query("SELECT * FROM C_Tax WHERE Name = :name AND IsActive = 'Y'")
    Optional<Tax> findByName(String name);

    @Query("SELECT * FROM C_Tax WHERE C_TaxCategory_ID = :taxCategoryId AND IsActive = 'Y' ORDER BY Rate")
    List<Tax> findByTaxCategoryId(Integer taxCategoryId);

    @Query("SELECT * FROM C_Tax WHERE C_Country_ID = :countryId AND IsActive = 'Y' ORDER BY Rate")
    List<Tax> findByCountryId(Integer countryId);

    @Query("SELECT * FROM C_Tax WHERE IsDefault = 'Y' AND IsActive = 'Y'")
    Optional<Tax> findDefault();

    @Query("SELECT * FROM C_Tax WHERE IsSalesTax = 'Y' AND IsActive = 'Y' ORDER BY Rate")
    List<Tax> findAllSalesTax();

    @Query("SELECT * FROM C_Tax WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Tax> findAllSummary();

    @Query("SELECT * FROM C_Tax WHERE IsSummary = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<Tax> findAllDetail();

    @Query("SELECT * FROM C_Tax WHERE IsTaxExempt = 'Y' AND IsActive = 'Y'")
    List<Tax> findAllExempt();

    @Query("SELECT * FROM C_Tax WHERE IsActive = 'Y' ORDER BY Name")
    List<Tax> findAllActive();

    @Query("SELECT * FROM C_Tax WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Tax> findByClient(Integer clientId);

    @Query("SELECT * FROM C_Tax WHERE C_TaxCategory_ID = :taxCategoryId AND IsActive = 'Y' ORDER BY Name")
    List<Tax> findByTaxCategory(Integer taxCategoryId);

    @Query("SELECT * FROM C_Tax WHERE IsDefault = 'Y' AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Tax> findDefault(Integer clientId);

    @Query("SELECT * FROM C_Tax WHERE IsSOTax = :isSOTax AND AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Tax> findBySOPO(String isSOTax, Integer clientId);
}
