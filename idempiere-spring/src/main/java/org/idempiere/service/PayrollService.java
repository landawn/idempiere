package org.idempiere.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PayrollDao;
import org.idempiere.dao.HREmployeeDao;
import org.idempiere.model.Payroll;
import org.idempiere.model.HREmployee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Payroll operations.
 */
@Service
@Transactional
public class PayrollService {

    private final PayrollDao payrollDao;
    private final HREmployeeDao hrEmployeeDao;

    public PayrollService(PayrollDao payrollDao, HREmployeeDao hrEmployeeDao) {
        this.payrollDao = payrollDao;
        this.hrEmployeeDao = hrEmployeeDao;
    }

    /**
     * Get payroll by ID.
     */
    public Optional<Payroll> getById(int payrollId) {
        try { return Optional.ofNullable(payrollDao.gett(payrollId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Get all payrolls for a client.
     */
    public List<Payroll> getByClient(int clientId) {
        return payrollDao.findByClient(clientId);
    }

    /**
     * Get payroll by value code.
     */
    public Optional<Payroll> getByValue(String value, int clientId) {
        Payroll payroll = payrollDao.findByValue(value, clientId);
        return Optional.ofNullable(payroll);
    }

    /**
     * Create a new payroll.
     */
    public Payroll create(Payroll payroll) {
        payrollDao.insert(payroll);
        return payroll;
    }

    /**
     * Update an existing payroll.
     */
    public Payroll update(Payroll payroll) {
        payrollDao.update(payroll);
        return payroll;
    }

    /**
     * Delete a payroll.
     */
    public void delete(int payrollId) {
        try { payrollDao.deleteById(payrollId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Get employees assigned to a payroll.
     */
    public List<HREmployee> getEmployeesByPayroll(int payrollId) {
        return hrEmployeeDao.findByPayroll(payrollId);
    }
}
