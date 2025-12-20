package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.TaxCategory;

/**
 * DAO interface for TaxCategory entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface TaxCategoryDao extends CrudDao<TaxCategory, Integer, SQLBuilder.PSC, TaxCategoryDao> {

    /**
     * Find a tax category by name
     */
    @Query("SELECT * FROM C_TaxCategory WHERE Name = :name AND IsActive = 'Y'")
    Optional<TaxCategory> findByName(String name);

    /**
     * Find all active tax categories
     */
    @Query("SELECT * FROM C_TaxCategory WHERE IsActive = 'Y' ORDER BY Name")
    List<TaxCategory> findAllActive();

    /**
     * Find the default tax category
     */
    @Query("SELECT * FROM C_TaxCategory WHERE IsDefault = 'Y' AND IsActive = 'Y' LIMIT 1")
    Optional<TaxCategory> findDefault();

    /**
     * Find tax categories by client
     */
    @Query("SELECT * FROM C_TaxCategory WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<TaxCategory> findByClient(Integer clientId);
}
