package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Form;

/**
 * DAO interface for Form entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface FormDao extends CrudDao<Form, Integer, SQLBuilder.NSC, FormDao> {

    /**
     * Find a form by name
     */
    @Query("SELECT * FROM AD_Form WHERE Name = :name AND IsActive = 'Y'")
    Optional<Form> findByName(String name);

    /**
     * Find all active forms
     */
    @Query("SELECT * FROM AD_Form WHERE IsActive = 'Y' ORDER BY Name")
    List<Form> findAllActive();

    /**
     * Find forms by classname
     */
    @Query("SELECT * FROM AD_Form WHERE Classname = :classname AND IsActive = 'Y' ORDER BY Name")
    List<Form> findByClassname(String classname);

    /**
     * Find forms by entity type
     */
    @Query("SELECT * FROM AD_Form WHERE EntityType = :entityType AND IsActive = 'Y' ORDER BY Name")
    List<Form> findByEntityType(String entityType);

    /**
     * Find all forms including inactive
     */
    @Query("SELECT * FROM AD_Form ORDER BY Name")
    List<Form> findAll();
}
