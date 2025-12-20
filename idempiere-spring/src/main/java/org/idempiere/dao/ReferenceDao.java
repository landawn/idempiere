package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Reference;

/**
 * DAO interface for Reference entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface ReferenceDao extends CrudDao<Reference, Integer, SQLBuilder.PSC, ReferenceDao> {

    /**
     * Find a reference by name
     */
    @Query("SELECT * FROM AD_Reference WHERE Name = :name AND IsActive = 'Y'")
    Optional<Reference> findByName(String name);

    /**
     * Find all active references
     */
    @Query("SELECT * FROM AD_Reference WHERE IsActive = 'Y' ORDER BY Name")
    List<Reference> findAllActive();

    /**
     * Find references by validation type
     */
    @Query("SELECT * FROM AD_Reference WHERE ValidationType = :validationType AND IsActive = 'Y' ORDER BY Name")
    List<Reference> findByValidationType(String validationType);

    /**
     * Find references by entity type
     */
    @Query("SELECT * FROM AD_Reference WHERE EntityType = :entityType AND IsActive = 'Y' ORDER BY Name")
    List<Reference> findByEntityType(String entityType);
}
