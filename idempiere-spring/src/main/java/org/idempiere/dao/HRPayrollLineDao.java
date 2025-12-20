package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.HRPayrollLine;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO interface for HR Payroll Line entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface HRPayrollLineDao extends CrudDao<HRPayrollLine, Integer, SQLBuilder.NSC, HRPayrollLineDao> {

    /**
     * Find payroll lines by process
     */
    @Query("SELECT * FROM HR_Movement WHERE HR_Process_ID = :processId AND IsActive = 'Y' ORDER BY SeqNo")
    List<HRPayrollLine> findByProcess(int processId);

    /**
     * Find payroll lines by employee
     */
    @Query("SELECT * FROM HR_Movement WHERE HR_Employee_ID = :employeeId AND IsActive = 'Y' ORDER BY Created DESC")
    List<HRPayrollLine> findByEmployee(int employeeId);

    /**
     * Find payroll lines by concept
     */
    @Query("SELECT * FROM HR_Movement WHERE HR_Concept_ID = :conceptId AND IsActive = 'Y' ORDER BY Created DESC")
    List<HRPayrollLine> findByConcept(int conceptId);

    /**
     * Find payroll lines by employee and process
     */
    @Query("SELECT * FROM HR_Movement WHERE HR_Employee_ID = :employeeId AND HR_Process_ID = :processId AND IsActive = 'Y' ORDER BY SeqNo")
    List<HRPayrollLine> findByEmployeeAndProcess(int employeeId, int processId);

    /**
     * Find payroll lines by business partner
     */
    @Query("SELECT * FROM HR_Movement WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<HRPayrollLine> findByBPartner(int bpartnerId);

    /**
     * Find registered payroll lines by process
     */
    @Query("SELECT * FROM HR_Movement WHERE HR_Process_ID = :processId AND IsRegistered = 'Y' AND IsActive = 'Y' ORDER BY SeqNo")
    List<HRPayrollLine> findRegisteredByProcess(int processId);

    /**
     * Find printed payroll lines by process
     */
    @Query("SELECT * FROM HR_Movement WHERE HR_Process_ID = :processId AND IsPrinted = 'Y' AND IsActive = 'Y' ORDER BY SeqNo")
    List<HRPayrollLine> findPrintedByProcess(int processId);

    /**
     * Find all active payroll lines
     */
    @Query("SELECT * FROM HR_Movement WHERE IsActive = 'Y' ORDER BY Created DESC")
    List<HRPayrollLine> findAllActive();
}
