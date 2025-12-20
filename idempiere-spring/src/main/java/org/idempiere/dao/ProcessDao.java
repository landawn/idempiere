package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Process;

/**
 * DAO interface for Process entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface ProcessDao extends CrudDao<Process, Integer, SQLBuilder.PSC, ProcessDao> {

    /**
     * Find a process by value
     */
    @Query("SELECT * FROM AD_Process WHERE Value = :value AND IsActive = 'Y'")
    Optional<Process> findByValue(String value);

    /**
     * Find a process by name
     */
    @Query("SELECT * FROM AD_Process WHERE Name = :name AND IsActive = 'Y'")
    Optional<Process> findByName(String name);

    /**
     * Find all active processes
     */
    @Query("SELECT * FROM AD_Process WHERE IsActive = 'Y' ORDER BY Name")
    List<Process> findAllActive();

    /**
     * Find processes by classname
     */
    @Query("SELECT * FROM AD_Process WHERE Classname = :classname AND IsActive = 'Y' ORDER BY Name")
    List<Process> findByClassname(String classname);

    /**
     * Find report processes
     */
    @Query("SELECT * FROM AD_Process WHERE IsReport = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Process> findAllReports();

    /**
     * Find processes by entity type
     */
    @Query("SELECT * FROM AD_Process WHERE EntityType = :entityType AND IsActive = 'Y' ORDER BY Name")
    List<Process> findByEntityType(String entityType);

    /**
     * Find processes by procedure name
     */
    @Query("SELECT * FROM AD_Process WHERE ProcedureName = :procedureName AND IsActive = 'Y' ORDER BY Name")
    List<Process> findByProcedureName(String procedureName);

    /**
     * Find all processes including inactive
     */
    @Query("SELECT * FROM AD_Process ORDER BY Name")
    List<Process> findAll();
}
