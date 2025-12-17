package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Tax;

/**
 * DAO interface for Tax entity operations.
 */
public interface TaxDao extends CrudDao<Tax, Integer, SQLBuilder.NSC, TaxDao> {

    @Select("SELECT * FROM C_Tax WHERE Name = :name AND IsActive = 'Y'")
    Optional<Tax> findByName(String name);

    @Select("SELECT * FROM C_Tax WHERE C_TaxCategory_ID = :taxCategoryId AND IsActive = 'Y' ORDER BY Rate")
    List<Tax> findByTaxCategoryId(Integer taxCategoryId);

    @Select("SELECT * FROM C_Tax WHERE C_Country_ID = :countryId AND IsActive = 'Y' ORDER BY Rate")
    List<Tax> findByCountryId(Integer countryId);

    @Select("SELECT * FROM C_Tax WHERE IsDefault = 'Y' AND IsActive = 'Y'")
    Optional<Tax> findDefault();

    @Select("SELECT * FROM C_Tax WHERE IsSalesTax = 'Y' AND IsActive = 'Y' ORDER BY Rate")
    List<Tax> findAllSalesTax();

    @Select("SELECT * FROM C_Tax WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Tax> findAllSummary();

    @Select("SELECT * FROM C_Tax WHERE IsSummary = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<Tax> findAllDetail();

    @Select("SELECT * FROM C_Tax WHERE IsTaxExempt = 'Y' AND IsActive = 'Y'")
    List<Tax> findAllExempt();

    @Select("SELECT * FROM C_Tax WHERE IsActive = 'Y' ORDER BY Name")
    List<Tax> findAllActive();
}
