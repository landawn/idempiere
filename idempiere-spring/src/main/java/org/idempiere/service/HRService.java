package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.HRConceptDao;
import org.idempiere.dao.HRContractDao;
import org.idempiere.dao.HRDepartmentDao;
import org.idempiere.dao.HREmployeeDao;
import org.idempiere.dao.HRJobDao;
import org.idempiere.dao.HRPayrollLineDao;
import org.idempiere.model.HRConcept;
import org.idempiere.model.HRContract;
import org.idempiere.model.HRDepartment;
import org.idempiere.model.HREmployee;
import org.idempiere.model.HRJob;
import org.idempiere.model.HRPayrollLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Human Resources and Payroll operations.
 * Combines all HR-related DAOs for comprehensive HR management.
 */
@Service
@Transactional
public class HRService {

    private final HREmployeeDao hrEmployeeDao;
    private final HRDepartmentDao hrDepartmentDao;
    private final HRJobDao hrJobDao;
    private final HRPayrollLineDao hrPayrollLineDao;
    private final HRConceptDao hrConceptDao;
    private final HRContractDao hrContractDao;

    public HRService(HREmployeeDao hrEmployeeDao,
                     HRDepartmentDao hrDepartmentDao,
                     HRJobDao hrJobDao,
                     HRPayrollLineDao hrPayrollLineDao,
                     HRConceptDao hrConceptDao,
                     HRContractDao hrContractDao) {
        this.hrEmployeeDao = hrEmployeeDao;
        this.hrDepartmentDao = hrDepartmentDao;
        this.hrJobDao = hrJobDao;
        this.hrPayrollLineDao = hrPayrollLineDao;
        this.hrConceptDao = hrConceptDao;
        this.hrContractDao = hrContractDao;
    }

    // ==================== Employee Operations ====================

    public Optional<HREmployee> findEmployeeById(Integer id) { try { return Optional.ofNullable(hrEmployeeDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find employee", e); }
    }

    public List<HREmployee> findAllEmployees() {
        return hrEmployeeDao.findAllActive();
    }

    public List<HREmployee> findAllActiveEmployees() {
        return hrEmployeeDao.findAllActive();
    }

    public Optional<HREmployee> findEmployeeByBPartner(int bpartnerId) {
        return hrEmployeeDao.findByBPartner(bpartnerId);
    }

    public Optional<HREmployee> findEmployeeByCode(String code) {
        return hrEmployeeDao.findByCode(code);
    }

    public List<HREmployee> findEmployeesByDepartment(int departmentId) {
        return hrEmployeeDao.findByDepartment(departmentId);
    }

    public List<HREmployee> findEmployeesByPayroll(int payrollId) {
        return hrEmployeeDao.findByPayroll(payrollId);
    }

    public List<HREmployee> findEmployeesByJob(int jobId) {
        return hrEmployeeDao.findByJob(jobId);
    }

    public HREmployee saveEmployee(HREmployee employee) {
        try {
            if (employee.getHrEmployeeId() == null) {
                hrEmployeeDao.insert(employee);
            } else {
                hrEmployeeDao.update(employee);
            }
            return employee;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteEmployee(Integer id) {
        try { hrEmployeeDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean existsEmployee(Integer id) {
        try { return hrEmployeeDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }

    // ==================== Department Operations ====================

    public Optional<HRDepartment> findDepartmentById(Integer id) {
        try { return Optional.ofNullable(hrDepartmentDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<HRDepartment> findAllDepartments() {
        return hrDepartmentDao.findAllActive();
    }

    public List<HRDepartment> findAllActiveDepartments() {
        return hrDepartmentDao.findAllActive();
    }

    public Optional<HRDepartment> findDepartmentByValue(String value) {
        return hrDepartmentDao.findByValue(value);
    }

    public Optional<HRDepartment> findDepartmentByName(String name) {
        return hrDepartmentDao.findByName(name);
    }

    public List<HRDepartment> findDepartmentsByManager(int managerId) {
        return hrDepartmentDao.findByManager(managerId);
    }

    public List<HRDepartment> findDepartmentsByParent(int parentId) {
        return hrDepartmentDao.findByParent(parentId);
    }

    public List<HRDepartment> findDepartmentsByActivity(int activityId) {
        return hrDepartmentDao.findByActivity(activityId);
    }

    public List<HRDepartment> findTopLevelDepartments() {
        return hrDepartmentDao.findTopLevel();
    }

    public HRDepartment saveDepartment(HRDepartment department) {
        try {
            if (department.getHrDepartmentId() == null) {
                hrDepartmentDao.insert(department);
            } else {
                hrDepartmentDao.update(department);
            }
            return department;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteDepartment(Integer id) {
        try { hrDepartmentDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean existsDepartment(Integer id) {
        try { return hrDepartmentDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }

    // ==================== Job Operations ====================

    public Optional<HRJob> findJobById(Integer id) {
        try { return Optional.ofNullable(hrJobDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<HRJob> findAllJobs() {
        return hrJobDao.findAllActive();
    }

    public List<HRJob> findAllActiveJobs() {
        return hrJobDao.findAllActive();
    }

    public Optional<HRJob> findJobByValue(String value) {
        return hrJobDao.findByValue(value);
    }

    public Optional<HRJob> findJobByName(String name) {
        return hrJobDao.findByName(name);
    }

    public List<HRJob> findJobsByDepartment(int departmentId) {
        return hrJobDao.findByDepartment(departmentId);
    }

    public List<HRJob> findJobsBySupervisor(int supervisorId) {
        return hrJobDao.findBySupervisor(supervisorId);
    }

    public List<HRJob> findJobsByCategory(int categoryId) {
        return hrJobDao.findByCategory(categoryId);
    }

    public List<HRJob> findEmployeeJobs() {
        return hrJobDao.findEmployeeJobs();
    }

    public HRJob saveJob(HRJob job) {
        try {
            if (job.getCJobId() == null) {
                hrJobDao.insert(job);
            } else {
                hrJobDao.update(job);
            }
            return job;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteJob(Integer id) {
        try { hrJobDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean existsJob(Integer id) {
        try { return hrJobDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }

    // ==================== Payroll Line Operations ====================

    public Optional<HRPayrollLine> findPayrollLineById(Integer id) {
        try { return Optional.ofNullable(hrPayrollLineDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<HRPayrollLine> findAllPayrollLines() {
        return hrPayrollLineDao.findAllActive();
    }

    public List<HRPayrollLine> findAllActivePayrollLines() {
        return hrPayrollLineDao.findAllActive();
    }

    public List<HRPayrollLine> findPayrollLinesByProcess(int processId) {
        return hrPayrollLineDao.findByProcess(processId);
    }

    public List<HRPayrollLine> findPayrollLinesByEmployee(int employeeId) {
        return hrPayrollLineDao.findByEmployee(employeeId);
    }

    public List<HRPayrollLine> findPayrollLinesByConcept(int conceptId) {
        return hrPayrollLineDao.findByConcept(conceptId);
    }

    public List<HRPayrollLine> findPayrollLinesByEmployeeAndProcess(int employeeId, int processId) {
        return hrPayrollLineDao.findByEmployeeAndProcess(employeeId, processId);
    }

    public List<HRPayrollLine> findPayrollLinesByBPartner(int bpartnerId) {
        return hrPayrollLineDao.findByBPartner(bpartnerId);
    }

    public List<HRPayrollLine> findRegisteredPayrollLinesByProcess(int processId) {
        return hrPayrollLineDao.findRegisteredByProcess(processId);
    }

    public List<HRPayrollLine> findPrintedPayrollLinesByProcess(int processId) {
        return hrPayrollLineDao.findPrintedByProcess(processId);
    }

    public HRPayrollLine savePayrollLine(HRPayrollLine payrollLine) {
        try {
            if (payrollLine.getHrMovementId() == null) {
                hrPayrollLineDao.insert(payrollLine);
            } else {
                hrPayrollLineDao.update(payrollLine);
            }
            return payrollLine;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deletePayrollLine(Integer id) {
        try { hrPayrollLineDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean existsPayrollLine(Integer id) {
        try { return hrPayrollLineDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }

    // ==================== Concept Operations ====================

    public Optional<HRConcept> findConceptById(Integer id) {
        try { return Optional.ofNullable(hrConceptDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<HRConcept> findAllConcepts() {
        return hrConceptDao.findAllActive();
    }

    public List<HRConcept> findAllActiveConcepts() {
        return hrConceptDao.findAllActive();
    }

    public Optional<HRConcept> findConceptByValue(String value) {
        return hrConceptDao.findByValue(value);
    }

    public Optional<HRConcept> findConceptByName(String name) {
        return hrConceptDao.findByName(name);
    }

    public List<HRConcept> findConceptsByCategory(int categoryId) {
        return hrConceptDao.findByCategory(categoryId);
    }

    public List<HRConcept> findConceptsByType(String type) {
        return hrConceptDao.findByType(type);
    }

    public List<HRConcept> findManualConcepts() {
        return hrConceptDao.findManualConcepts();
    }

    public List<HRConcept> findDefaultConcepts() {
        return hrConceptDao.findDefaultConcepts();
    }

    public List<HRConcept> findPrintedConcepts() {
        return hrConceptDao.findPrintedConcepts();
    }

    public List<HRConcept> findRegisteredConcepts() {
        return hrConceptDao.findRegisteredConcepts();
    }

    public List<HRConcept> findEmployeeConcepts() {
        return hrConceptDao.findEmployeeConcepts();
    }

    public List<HRConcept> findPaidConcepts() {
        return hrConceptDao.findPaidConcepts();
    }

    public HRConcept saveConcept(HRConcept concept) {
        try {
            if (concept.getHrConceptId() == null) {
                hrConceptDao.insert(concept);
            } else {
                hrConceptDao.update(concept);
            }
            return concept;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteConcept(Integer id) {
        try { hrConceptDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean existsConcept(Integer id) {
        try { return hrConceptDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }

    // ==================== Contract Operations ====================

    public Optional<HRContract> findContractById(Integer id) {
        try { return Optional.ofNullable(hrContractDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<HRContract> findAllContracts() {
        return hrContractDao.findAllActive();
    }

    public List<HRContract> findAllActiveContracts() {
        return hrContractDao.findAllActive();
    }

    public Optional<HRContract> findContractByValue(String value) {
        return hrContractDao.findByValue(value);
    }

    public Optional<HRContract> findContractByName(String name) {
        return hrContractDao.findByName(name);
    }

    public List<HRContract> findContractsByEmployee(int employeeId) {
        return hrContractDao.findByEmployee(employeeId);
    }

    public List<HRContract> findContractsByBPartner(int bpartnerId) {
        return hrContractDao.findByBPartner(bpartnerId);
    }

    public List<HRContract> findContractsByPayroll(int payrollId) {
        return hrContractDao.findByPayroll(payrollId);
    }

    public List<HRContract> findContractsByDepartment(int departmentId) {
        return hrContractDao.findByDepartment(departmentId);
    }

    public List<HRContract> findContractsByJob(int jobId) {
        return hrContractDao.findByJob(jobId);
    }

    public List<HRContract> findContractsByStatus(String status) {
        return hrContractDao.findByStatus(status);
    }

    public List<HRContract> findContractsByDocStatus(String docStatus) {
        return hrContractDao.findByDocStatus(docStatus);
    }

    public List<HRContract> findDefaultContracts() {
        return hrContractDao.findDefaultContracts();
    }

    public List<HRContract> findActiveContractsByEmployee(int employeeId) {
        return hrContractDao.findActiveContractsByEmployee(employeeId);
    }

    public HRContract saveContract(HRContract contract) {
        try {
            if (contract.getHrContractId() == null) {
                hrContractDao.insert(contract);
            } else {
                hrContractDao.update(contract);
            }
            return contract;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteContract(Integer id) {
        try { hrContractDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean existsContract(Integer id) {
        try { return hrContractDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
