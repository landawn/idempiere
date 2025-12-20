package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.TaxPostal;

/**
 * DAO interface for TaxPostal entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface TaxPostalDao extends CrudDao<TaxPostal, Integer, SQLBuilder.PSC, TaxPostalDao> {

    /**
     * Find tax postal codes by tax
     */
    @Query("SELECT * FROM C_TaxPostal WHERE C_Tax_ID = :taxId AND IsActive = 'Y' ORDER BY Postal")
    List<TaxPostal> findByTaxId(Integer taxId);

    /**
     * Find tax postal codes by postal code
     */
    @Query("SELECT * FROM C_TaxPostal WHERE Postal = :postal AND IsActive = 'Y'")
    List<TaxPostal> findByPostal(String postal);

    /**
     * Find tax postal codes within a postal range
     */
    @Query("SELECT * FROM C_TaxPostal WHERE :postal BETWEEN Postal AND COALESCE(Postal_To, Postal) AND IsActive = 'Y'")
    List<TaxPostal> findByPostalRange(String postal);
}
