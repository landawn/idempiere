package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.HRDepartment;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO interface for HR Department entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface HRDepartmentDao extends CrudDao<HRDepartment, Integer, SQLBuilder.NSC, HRDepartmentDao> {

    /**
     * Find a department by its value (code)
     */
    @Query("SELECT * FROM HR_Department WHERE Value = :value AND IsActive = 'Y'")
    Optional<HRDepartment> findByValue(String value);

    /**
     * Find a department by name
     */
    @Query("SELECT * FROM HR_Department WHERE Name = :name AND IsActive = 'Y'")
    Optional<HRDepartment> findByName(String name);

    /**
     * Find all active departments
     */
    @Query("SELECT * FROM HR_Department WHERE IsActive = 'Y' ORDER BY Name")
    List<HRDepartment> findAllActive();

    /**
     * Find departments by manager
     */
    @Query("SELECT * FROM HR_Department WHERE Manager_ID = :managerId AND IsActive = 'Y' ORDER BY Name")
    List<HRDepartment> findByManager(int managerId);

    /**
     * Find child departments by parent
     */
    @Query("SELECT * FROM HR_Department WHERE Parent_ID = :parentId AND IsActive = 'Y' ORDER BY Name")
    List<HRDepartment> findByParent(int parentId);

    /**
     * Find departments by activity
     */
    @Query("SELECT * FROM HR_Department WHERE C_Activity_ID = :activityId AND IsActive = 'Y' ORDER BY Name")
    List<HRDepartment> findByActivity(int activityId);

    /**
     * Find all top-level departments (no parent)
     */
    @Query("SELECT * FROM HR_Department WHERE Parent_ID IS NULL AND IsActive = 'Y' ORDER BY Name")
    List<HRDepartment> findTopLevel();
}
