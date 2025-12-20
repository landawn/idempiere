package org.idempiere.controller;

import java.util.List;

import org.idempiere.model.HRConcept;
import org.idempiere.model.HRContract;
import org.idempiere.model.HRDepartment;
import org.idempiere.model.HREmployee;
import org.idempiere.model.HRJob;
import org.idempiere.model.HRPayrollLine;
import org.idempiere.service.HRService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

/**
 * REST Controller for Human Resources and Payroll management.
 * Provides comprehensive HR operations including employees, departments, jobs,
 * payroll lines, concepts, and contracts.
 */
@RestController
@RequestMapping("/api/hr")
@Tag(name = "Human Resources", description = "HR and Payroll management APIs")
public class HRController {

    private final HRService hrService;

    public HRController(HRService hrService) {
        this.hrService = hrService;
    }

    // ==================== Employee Endpoints ====================

    @GetMapping("/employees")
    @Operation(summary = "Get all employees")
    public ResponseEntity<List<HREmployee>> findAllEmployees() {
        return ResponseEntity.ok(hrService.findAllEmployees());
    }

    @GetMapping("/employees/active")
    @Operation(summary = "Get all active employees")
    public ResponseEntity<List<HREmployee>> findAllActiveEmployees() {
        return ResponseEntity.ok(hrService.findAllActiveEmployees());
    }

    @GetMapping("/employees/{id}")
    @Operation(summary = "Get employee by ID")
    public ResponseEntity<HREmployee> findEmployeeById(@PathVariable Integer id) {
        return hrService.findEmployeeById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/employees/code/{code}")
    @Operation(summary = "Get employee by code")
    public ResponseEntity<HREmployee> findEmployeeByCode(@PathVariable String code) {
        return hrService.findEmployeeByCode(code)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/employees/bpartner/{bpartnerId}")
    @Operation(summary = "Get employee by business partner ID")
    public ResponseEntity<HREmployee> findEmployeeByBPartner(@PathVariable int bpartnerId) {
        return hrService.findEmployeeByBPartner(bpartnerId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/employees/department/{departmentId}")
    @Operation(summary = "Get employees by department")
    public ResponseEntity<List<HREmployee>> findEmployeesByDepartment(@PathVariable int departmentId) {
        return ResponseEntity.ok(hrService.findEmployeesByDepartment(departmentId));
    }

    @GetMapping("/employees/payroll/{payrollId}")
    @Operation(summary = "Get employees by payroll")
    public ResponseEntity<List<HREmployee>> findEmployeesByPayroll(@PathVariable int payrollId) {
        return ResponseEntity.ok(hrService.findEmployeesByPayroll(payrollId));
    }

    @GetMapping("/employees/job/{jobId}")
    @Operation(summary = "Get employees by job")
    public ResponseEntity<List<HREmployee>> findEmployeesByJob(@PathVariable int jobId) {
        return ResponseEntity.ok(hrService.findEmployeesByJob(jobId));
    }

    @PostMapping("/employees")
    @Operation(summary = "Create a new employee")
    public ResponseEntity<HREmployee> createEmployee(@RequestBody HREmployee employee) {
        HREmployee saved = hrService.saveEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/employees/{id}")
    @Operation(summary = "Update an existing employee")
    public ResponseEntity<HREmployee> updateEmployee(@PathVariable Integer id, @RequestBody HREmployee employee) {
        if (!hrService.existsEmployee(id)) {
            return ResponseEntity.notFound().build();
        }
        employee.setHrEmployeeId(id);
        HREmployee updated = hrService.saveEmployee(employee);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/employees/{id}")
    @Operation(summary = "Delete an employee")
    public ResponseEntity<Void> deleteEmployee(@PathVariable Integer id) {
        if (!hrService.existsEmployee(id)) {
            return ResponseEntity.notFound().build();
        }
        hrService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

    // ==================== Department Endpoints ====================

    @GetMapping("/departments")
    @Operation(summary = "Get all departments")
    public ResponseEntity<List<HRDepartment>> findAllDepartments() {
        return ResponseEntity.ok(hrService.findAllDepartments());
    }

    @GetMapping("/departments/active")
    @Operation(summary = "Get all active departments")
    public ResponseEntity<List<HRDepartment>> findAllActiveDepartments() {
        return ResponseEntity.ok(hrService.findAllActiveDepartments());
    }

    @GetMapping("/departments/{id}")
    @Operation(summary = "Get department by ID")
    public ResponseEntity<HRDepartment> findDepartmentById(@PathVariable Integer id) {
        return hrService.findDepartmentById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/departments/value/{value}")
    @Operation(summary = "Get department by value/code")
    public ResponseEntity<HRDepartment> findDepartmentByValue(@PathVariable String value) {
        return hrService.findDepartmentByValue(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/departments/name/{name}")
    @Operation(summary = "Get department by name")
    public ResponseEntity<HRDepartment> findDepartmentByName(@PathVariable String name) {
        return hrService.findDepartmentByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/departments/manager/{managerId}")
    @Operation(summary = "Get departments by manager")
    public ResponseEntity<List<HRDepartment>> findDepartmentsByManager(@PathVariable int managerId) {
        return ResponseEntity.ok(hrService.findDepartmentsByManager(managerId));
    }

    @GetMapping("/departments/parent/{parentId}")
    @Operation(summary = "Get child departments by parent")
    public ResponseEntity<List<HRDepartment>> findDepartmentsByParent(@PathVariable int parentId) {
        return ResponseEntity.ok(hrService.findDepartmentsByParent(parentId));
    }

    @GetMapping("/departments/activity/{activityId}")
    @Operation(summary = "Get departments by activity")
    public ResponseEntity<List<HRDepartment>> findDepartmentsByActivity(@PathVariable int activityId) {
        return ResponseEntity.ok(hrService.findDepartmentsByActivity(activityId));
    }

    @GetMapping("/departments/toplevel")
    @Operation(summary = "Get top-level departments")
    public ResponseEntity<List<HRDepartment>> findTopLevelDepartments() {
        return ResponseEntity.ok(hrService.findTopLevelDepartments());
    }

    @PostMapping("/departments")
    @Operation(summary = "Create a new department")
    public ResponseEntity<HRDepartment> createDepartment(@RequestBody HRDepartment department) {
        HRDepartment saved = hrService.saveDepartment(department);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/departments/{id}")
    @Operation(summary = "Update an existing department")
    public ResponseEntity<HRDepartment> updateDepartment(@PathVariable Integer id, @RequestBody HRDepartment department) {
        if (!hrService.existsDepartment(id)) {
            return ResponseEntity.notFound().build();
        }
        department.setHrDepartmentId(id);
        HRDepartment updated = hrService.saveDepartment(department);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/departments/{id}")
    @Operation(summary = "Delete a department")
    public ResponseEntity<Void> deleteDepartment(@PathVariable Integer id) {
        if (!hrService.existsDepartment(id)) {
            return ResponseEntity.notFound().build();
        }
        hrService.deleteDepartment(id);
        return ResponseEntity.noContent().build();
    }

    // ==================== Job Endpoints ====================

    @GetMapping("/jobs")
    @Operation(summary = "Get all jobs")
    public ResponseEntity<List<HRJob>> findAllJobs() {
        return ResponseEntity.ok(hrService.findAllJobs());
    }

    @GetMapping("/jobs/active")
    @Operation(summary = "Get all active jobs")
    public ResponseEntity<List<HRJob>> findAllActiveJobs() {
        return ResponseEntity.ok(hrService.findAllActiveJobs());
    }

    @GetMapping("/jobs/{id}")
    @Operation(summary = "Get job by ID")
    public ResponseEntity<HRJob> findJobById(@PathVariable Integer id) {
        return hrService.findJobById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/jobs/value/{value}")
    @Operation(summary = "Get job by value/code")
    public ResponseEntity<HRJob> findJobByValue(@PathVariable String value) {
        return hrService.findJobByValue(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/jobs/name/{name}")
    @Operation(summary = "Get job by name")
    public ResponseEntity<HRJob> findJobByName(@PathVariable String name) {
        return hrService.findJobByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/jobs/department/{departmentId}")
    @Operation(summary = "Get jobs by department")
    public ResponseEntity<List<HRJob>> findJobsByDepartment(@PathVariable int departmentId) {
        return ResponseEntity.ok(hrService.findJobsByDepartment(departmentId));
    }

    @GetMapping("/jobs/supervisor/{supervisorId}")
    @Operation(summary = "Get jobs by supervisor")
    public ResponseEntity<List<HRJob>> findJobsBySupervisor(@PathVariable int supervisorId) {
        return ResponseEntity.ok(hrService.findJobsBySupervisor(supervisorId));
    }

    @GetMapping("/jobs/category/{categoryId}")
    @Operation(summary = "Get jobs by category")
    public ResponseEntity<List<HRJob>> findJobsByCategory(@PathVariable int categoryId) {
        return ResponseEntity.ok(hrService.findJobsByCategory(categoryId));
    }

    @GetMapping("/jobs/employee")
    @Operation(summary = "Get employee jobs")
    public ResponseEntity<List<HRJob>> findEmployeeJobs() {
        return ResponseEntity.ok(hrService.findEmployeeJobs());
    }

    @PostMapping("/jobs")
    @Operation(summary = "Create a new job")
    public ResponseEntity<HRJob> createJob(@RequestBody HRJob job) {
        HRJob saved = hrService.saveJob(job);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/jobs/{id}")
    @Operation(summary = "Update an existing job")
    public ResponseEntity<HRJob> updateJob(@PathVariable Integer id, @RequestBody HRJob job) {
        if (!hrService.existsJob(id)) {
            return ResponseEntity.notFound().build();
        }
        job.setCJobId(id);
        HRJob updated = hrService.saveJob(job);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/jobs/{id}")
    @Operation(summary = "Delete a job")
    public ResponseEntity<Void> deleteJob(@PathVariable Integer id) {
        if (!hrService.existsJob(id)) {
            return ResponseEntity.notFound().build();
        }
        hrService.deleteJob(id);
        return ResponseEntity.noContent().build();
    }

    // ==================== Payroll Line Endpoints ====================

    @GetMapping("/payrolllines")
    @Operation(summary = "Get all payroll lines")
    public ResponseEntity<List<HRPayrollLine>> findAllPayrollLines() {
        return ResponseEntity.ok(hrService.findAllPayrollLines());
    }

    @GetMapping("/payrolllines/active")
    @Operation(summary = "Get all active payroll lines")
    public ResponseEntity<List<HRPayrollLine>> findAllActivePayrollLines() {
        return ResponseEntity.ok(hrService.findAllActivePayrollLines());
    }

    @GetMapping("/payrolllines/{id}")
    @Operation(summary = "Get payroll line by ID")
    public ResponseEntity<HRPayrollLine> findPayrollLineById(@PathVariable Integer id) {
        return hrService.findPayrollLineById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/payrolllines/process/{processId}")
    @Operation(summary = "Get payroll lines by process")
    public ResponseEntity<List<HRPayrollLine>> findPayrollLinesByProcess(@PathVariable int processId) {
        return ResponseEntity.ok(hrService.findPayrollLinesByProcess(processId));
    }

    @GetMapping("/payrolllines/employee/{employeeId}")
    @Operation(summary = "Get payroll lines by employee")
    public ResponseEntity<List<HRPayrollLine>> findPayrollLinesByEmployee(@PathVariable int employeeId) {
        return ResponseEntity.ok(hrService.findPayrollLinesByEmployee(employeeId));
    }

    @GetMapping("/payrolllines/concept/{conceptId}")
    @Operation(summary = "Get payroll lines by concept")
    public ResponseEntity<List<HRPayrollLine>> findPayrollLinesByConcept(@PathVariable int conceptId) {
        return ResponseEntity.ok(hrService.findPayrollLinesByConcept(conceptId));
    }

    @GetMapping("/payrolllines/employee/{employeeId}/process/{processId}")
    @Operation(summary = "Get payroll lines by employee and process")
    public ResponseEntity<List<HRPayrollLine>> findPayrollLinesByEmployeeAndProcess(
            @PathVariable int employeeId, @PathVariable int processId) {
        return ResponseEntity.ok(hrService.findPayrollLinesByEmployeeAndProcess(employeeId, processId));
    }

    @GetMapping("/payrolllines/bpartner/{bpartnerId}")
    @Operation(summary = "Get payroll lines by business partner")
    public ResponseEntity<List<HRPayrollLine>> findPayrollLinesByBPartner(@PathVariable int bpartnerId) {
        return ResponseEntity.ok(hrService.findPayrollLinesByBPartner(bpartnerId));
    }

    @GetMapping("/payrolllines/process/{processId}/registered")
    @Operation(summary = "Get registered payroll lines by process")
    public ResponseEntity<List<HRPayrollLine>> findRegisteredPayrollLinesByProcess(@PathVariable int processId) {
        return ResponseEntity.ok(hrService.findRegisteredPayrollLinesByProcess(processId));
    }

    @GetMapping("/payrolllines/process/{processId}/printed")
    @Operation(summary = "Get printed payroll lines by process")
    public ResponseEntity<List<HRPayrollLine>> findPrintedPayrollLinesByProcess(@PathVariable int processId) {
        return ResponseEntity.ok(hrService.findPrintedPayrollLinesByProcess(processId));
    }

    @PostMapping("/payrolllines")
    @Operation(summary = "Create a new payroll line")
    public ResponseEntity<HRPayrollLine> createPayrollLine(@RequestBody HRPayrollLine payrollLine) {
        HRPayrollLine saved = hrService.savePayrollLine(payrollLine);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/payrolllines/{id}")
    @Operation(summary = "Update an existing payroll line")
    public ResponseEntity<HRPayrollLine> updatePayrollLine(@PathVariable Integer id, @RequestBody HRPayrollLine payrollLine) {
        if (!hrService.existsPayrollLine(id)) {
            return ResponseEntity.notFound().build();
        }
        payrollLine.setHrMovementId(id);
        HRPayrollLine updated = hrService.savePayrollLine(payrollLine);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/payrolllines/{id}")
    @Operation(summary = "Delete a payroll line")
    public ResponseEntity<Void> deletePayrollLine(@PathVariable Integer id) {
        if (!hrService.existsPayrollLine(id)) {
            return ResponseEntity.notFound().build();
        }
        hrService.deletePayrollLine(id);
        return ResponseEntity.noContent().build();
    }

    // ==================== Concept Endpoints ====================

    @GetMapping("/concepts")
    @Operation(summary = "Get all concepts")
    public ResponseEntity<List<HRConcept>> findAllConcepts() {
        return ResponseEntity.ok(hrService.findAllConcepts());
    }

    @GetMapping("/concepts/active")
    @Operation(summary = "Get all active concepts")
    public ResponseEntity<List<HRConcept>> findAllActiveConcepts() {
        return ResponseEntity.ok(hrService.findAllActiveConcepts());
    }

    @GetMapping("/concepts/{id}")
    @Operation(summary = "Get concept by ID")
    public ResponseEntity<HRConcept> findConceptById(@PathVariable Integer id) {
        return hrService.findConceptById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/concepts/value/{value}")
    @Operation(summary = "Get concept by value/code")
    public ResponseEntity<HRConcept> findConceptByValue(@PathVariable String value) {
        return hrService.findConceptByValue(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/concepts/name/{name}")
    @Operation(summary = "Get concept by name")
    public ResponseEntity<HRConcept> findConceptByName(@PathVariable String name) {
        return hrService.findConceptByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/concepts/category/{categoryId}")
    @Operation(summary = "Get concepts by category")
    public ResponseEntity<List<HRConcept>> findConceptsByCategory(@PathVariable int categoryId) {
        return ResponseEntity.ok(hrService.findConceptsByCategory(categoryId));
    }

    @GetMapping("/concepts/type/{type}")
    @Operation(summary = "Get concepts by type")
    public ResponseEntity<List<HRConcept>> findConceptsByType(@PathVariable String type) {
        return ResponseEntity.ok(hrService.findConceptsByType(type));
    }

    @GetMapping("/concepts/manual")
    @Operation(summary = "Get manual concepts")
    public ResponseEntity<List<HRConcept>> findManualConcepts() {
        return ResponseEntity.ok(hrService.findManualConcepts());
    }

    @GetMapping("/concepts/default")
    @Operation(summary = "Get default concepts")
    public ResponseEntity<List<HRConcept>> findDefaultConcepts() {
        return ResponseEntity.ok(hrService.findDefaultConcepts());
    }

    @GetMapping("/concepts/printed")
    @Operation(summary = "Get printed concepts")
    public ResponseEntity<List<HRConcept>> findPrintedConcepts() {
        return ResponseEntity.ok(hrService.findPrintedConcepts());
    }

    @GetMapping("/concepts/registered")
    @Operation(summary = "Get registered concepts")
    public ResponseEntity<List<HRConcept>> findRegisteredConcepts() {
        return ResponseEntity.ok(hrService.findRegisteredConcepts());
    }

    @GetMapping("/concepts/employee")
    @Operation(summary = "Get employee concepts")
    public ResponseEntity<List<HRConcept>> findEmployeeConcepts() {
        return ResponseEntity.ok(hrService.findEmployeeConcepts());
    }

    @GetMapping("/concepts/paid")
    @Operation(summary = "Get paid concepts")
    public ResponseEntity<List<HRConcept>> findPaidConcepts() {
        return ResponseEntity.ok(hrService.findPaidConcepts());
    }

    @PostMapping("/concepts")
    @Operation(summary = "Create a new concept")
    public ResponseEntity<HRConcept> createConcept(@RequestBody HRConcept concept) {
        HRConcept saved = hrService.saveConcept(concept);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/concepts/{id}")
    @Operation(summary = "Update an existing concept")
    public ResponseEntity<HRConcept> updateConcept(@PathVariable Integer id, @RequestBody HRConcept concept) {
        if (!hrService.existsConcept(id)) {
            return ResponseEntity.notFound().build();
        }
        concept.setHrConceptId(id);
        HRConcept updated = hrService.saveConcept(concept);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/concepts/{id}")
    @Operation(summary = "Delete a concept")
    public ResponseEntity<Void> deleteConcept(@PathVariable Integer id) {
        if (!hrService.existsConcept(id)) {
            return ResponseEntity.notFound().build();
        }
        hrService.deleteConcept(id);
        return ResponseEntity.noContent().build();
    }

    // ==================== Contract Endpoints ====================

    @GetMapping("/contracts")
    @Operation(summary = "Get all contracts")
    public ResponseEntity<List<HRContract>> findAllContracts() {
        return ResponseEntity.ok(hrService.findAllContracts());
    }

    @GetMapping("/contracts/active")
    @Operation(summary = "Get all active contracts")
    public ResponseEntity<List<HRContract>> findAllActiveContracts() {
        return ResponseEntity.ok(hrService.findAllActiveContracts());
    }

    @GetMapping("/contracts/{id}")
    @Operation(summary = "Get contract by ID")
    public ResponseEntity<HRContract> findContractById(@PathVariable Integer id) {
        return hrService.findContractById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/contracts/value/{value}")
    @Operation(summary = "Get contract by value/code")
    public ResponseEntity<HRContract> findContractByValue(@PathVariable String value) {
        return hrService.findContractByValue(value)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/contracts/name/{name}")
    @Operation(summary = "Get contract by name")
    public ResponseEntity<HRContract> findContractByName(@PathVariable String name) {
        return hrService.findContractByName(name)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/contracts/employee/{employeeId}")
    @Operation(summary = "Get contracts by employee")
    public ResponseEntity<List<HRContract>> findContractsByEmployee(@PathVariable int employeeId) {
        return ResponseEntity.ok(hrService.findContractsByEmployee(employeeId));
    }

    @GetMapping("/contracts/employee/{employeeId}/active")
    @Operation(summary = "Get active contracts by employee")
    public ResponseEntity<List<HRContract>> findActiveContractsByEmployee(@PathVariable int employeeId) {
        return ResponseEntity.ok(hrService.findActiveContractsByEmployee(employeeId));
    }

    @GetMapping("/contracts/bpartner/{bpartnerId}")
    @Operation(summary = "Get contracts by business partner")
    public ResponseEntity<List<HRContract>> findContractsByBPartner(@PathVariable int bpartnerId) {
        return ResponseEntity.ok(hrService.findContractsByBPartner(bpartnerId));
    }

    @GetMapping("/contracts/payroll/{payrollId}")
    @Operation(summary = "Get contracts by payroll")
    public ResponseEntity<List<HRContract>> findContractsByPayroll(@PathVariable int payrollId) {
        return ResponseEntity.ok(hrService.findContractsByPayroll(payrollId));
    }

    @GetMapping("/contracts/department/{departmentId}")
    @Operation(summary = "Get contracts by department")
    public ResponseEntity<List<HRContract>> findContractsByDepartment(@PathVariable int departmentId) {
        return ResponseEntity.ok(hrService.findContractsByDepartment(departmentId));
    }

    @GetMapping("/contracts/job/{jobId}")
    @Operation(summary = "Get contracts by job")
    public ResponseEntity<List<HRContract>> findContractsByJob(@PathVariable int jobId) {
        return ResponseEntity.ok(hrService.findContractsByJob(jobId));
    }

    @GetMapping("/contracts/status/{status}")
    @Operation(summary = "Get contracts by status")
    public ResponseEntity<List<HRContract>> findContractsByStatus(@PathVariable String status) {
        return ResponseEntity.ok(hrService.findContractsByStatus(status));
    }

    @GetMapping("/contracts/docstatus/{docStatus}")
    @Operation(summary = "Get contracts by document status")
    public ResponseEntity<List<HRContract>> findContractsByDocStatus(@PathVariable String docStatus) {
        return ResponseEntity.ok(hrService.findContractsByDocStatus(docStatus));
    }

    @GetMapping("/contracts/default")
    @Operation(summary = "Get default contracts")
    public ResponseEntity<List<HRContract>> findDefaultContracts() {
        return ResponseEntity.ok(hrService.findDefaultContracts());
    }

    @PostMapping("/contracts")
    @Operation(summary = "Create a new contract")
    public ResponseEntity<HRContract> createContract(@RequestBody HRContract contract) {
        HRContract saved = hrService.saveContract(contract);
        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @PutMapping("/contracts/{id}")
    @Operation(summary = "Update an existing contract")
    public ResponseEntity<HRContract> updateContract(@PathVariable Integer id, @RequestBody HRContract contract) {
        if (!hrService.existsContract(id)) {
            return ResponseEntity.notFound().build();
        }
        contract.setHrContractId(id);
        HRContract updated = hrService.saveContract(contract);
        return ResponseEntity.ok(updated);
    }

    @DeleteMapping("/contracts/{id}")
    @Operation(summary = "Delete a contract")
    public ResponseEntity<Void> deleteContract(@PathVariable Integer id) {
        if (!hrService.existsContract(id)) {
            return ResponseEntity.notFound().build();
        }
        hrService.deleteContract(id);
        return ResponseEntity.noContent().build();
    }
}
