package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.HRContract;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO interface for HR Contract entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface HRContractDao extends CrudDao<HRContract, Integer, SQLBuilder.NSC, HRContractDao> {

    /**
     * Find a contract by its value (code)
     */
    @Query("SELECT * FROM HR_Contract WHERE Value = :value AND IsActive = 'Y'")
    Optional<HRContract> findByValue(String value);

    /**
     * Find a contract by name
     */
    @Query("SELECT * FROM HR_Contract WHERE Name = :name AND IsActive = 'Y'")
    Optional<HRContract> findByName(String name);

    /**
     * Find all active contracts
     */
    @Query("SELECT * FROM HR_Contract WHERE IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findAllActive();

    /**
     * Find contracts by employee
     */
    @Query("SELECT * FROM HR_Contract WHERE HR_Employee_ID = :employeeId AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findByEmployee(int employeeId);

    /**
     * Find contracts by business partner
     */
    @Query("SELECT * FROM HR_Contract WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findByBPartner(int bpartnerId);

    /**
     * Find contracts by payroll
     */
    @Query("SELECT * FROM HR_Contract WHERE HR_Payroll_ID = :payrollId AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findByPayroll(int payrollId);

    /**
     * Find contracts by department
     */
    @Query("SELECT * FROM HR_Contract WHERE HR_Department_ID = :departmentId AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findByDepartment(int departmentId);

    /**
     * Find contracts by job
     */
    @Query("SELECT * FROM HR_Contract WHERE C_Job_ID = :jobId AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findByJob(int jobId);

    /**
     * Find contracts by status
     */
    @Query("SELECT * FROM HR_Contract WHERE Status = :status AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findByStatus(String status);

    /**
     * Find contracts by document status
     */
    @Query("SELECT * FROM HR_Contract WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findByDocStatus(String docStatus);

    /**
     * Find default contracts
     */
    @Query("SELECT * FROM HR_Contract WHERE IsDefault = 'Y' AND IsActive = 'Y' ORDER BY StartDate DESC")
    List<HRContract> findDefaultContracts();

    /**
     * Find active contracts for an employee (between dates)
     */
    @Query("SELECT * FROM HR_Contract WHERE HR_Employee_ID = :employeeId AND IsActive = 'Y' AND (EndDate IS NULL OR EndDate >= CURRENT_DATE) AND StartDate <= CURRENT_DATE ORDER BY StartDate DESC")
    List<HRContract> findActiveContractsByEmployee(int employeeId);
}
