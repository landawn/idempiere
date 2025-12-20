package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.ADTable;

/**
 * DAO interface for ADTable entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface TableDao extends CrudDao<ADTable, Integer, SQLBuilder.PSC, TableDao> {

    /**
     * Find a table by table name
     */
    @Query("SELECT * FROM AD_Table WHERE TableName = :tableName AND IsActive = 'Y'")
    Optional<ADTable> findByTableName(String tableName);

    /**
     * Find all active tables
     */
    @Query("SELECT * FROM AD_Table WHERE IsActive = 'Y' ORDER BY TableName")
    List<ADTable> findAllActive();

    /**
     * Find tables by entity type
     */
    @Query("SELECT * FROM AD_Table WHERE EntityType = :entityType AND IsActive = 'Y' ORDER BY TableName")
    List<ADTable> findByEntityType(String entityType);

    /**
     * Find view tables
     */
    @Query("SELECT * FROM AD_Table WHERE IsView = 'Y' AND IsActive = 'Y' ORDER BY TableName")
    List<ADTable> findAllViews();

    /**
     * Find document tables
     */
    @Query("SELECT * FROM AD_Table WHERE IsDocument = 'Y' AND IsActive = 'Y' ORDER BY TableName")
    List<ADTable> findAllDocuments();

    /**
     * Find tables with change log enabled
     */
    @Query("SELECT * FROM AD_Table WHERE IsChangeLog = 'Y' AND IsActive = 'Y' ORDER BY TableName")
    List<ADTable> findAllWithChangeLog();

    /**
     * Find all tables (including inactive)
     */
    @Query("SELECT * FROM AD_Table ORDER BY TableName")
    List<ADTable> findAll();

    /**
     * Count all tables
     */
    @Query("SELECT COUNT(*) FROM AD_Table")
    long countAll();
}
