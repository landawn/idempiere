package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.HRJob;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO interface for HR Job entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface HRJobDao extends CrudDao<HRJob, Integer, SQLBuilder.NSC, HRJobDao> {

    /**
     * Find a job by its value (code)
     */
    @Query("SELECT * FROM C_Job WHERE Value = :value AND IsActive = 'Y'")
    Optional<HRJob> findByValue(String value);

    /**
     * Find a job by name
     */
    @Query("SELECT * FROM C_Job WHERE Name = :name AND IsActive = 'Y'")
    Optional<HRJob> findByName(String name);

    /**
     * Find all active jobs
     */
    @Query("SELECT * FROM C_Job WHERE IsActive = 'Y' ORDER BY Name")
    List<HRJob> findAllActive();

    /**
     * Find jobs by department
     */
    @Query("SELECT * FROM C_Job WHERE HR_Department_ID = :departmentId AND IsActive = 'Y' ORDER BY Name")
    List<HRJob> findByDepartment(int departmentId);

    /**
     * Find jobs by supervisor
     */
    @Query("SELECT * FROM C_Job WHERE Supervisor_ID = :supervisorId AND IsActive = 'Y' ORDER BY Name")
    List<HRJob> findBySupervisor(int supervisorId);

    /**
     * Find jobs by category
     */
    @Query("SELECT * FROM C_Job WHERE C_JobCategory_ID = :categoryId AND IsActive = 'Y' ORDER BY Name")
    List<HRJob> findByCategory(int categoryId);

    /**
     * Find employee jobs
     */
    @Query("SELECT * FROM C_Job WHERE IsEmployee = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<HRJob> findEmployeeJobs();
}
