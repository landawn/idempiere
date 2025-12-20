package org.idempiere.service;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.BankStatementDao;
import org.idempiere.model.BankStatement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * Service class for BankStatement entity operations.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class BankStatementService {

    private final BankStatementDao bankStatementDao;

    /**
     * Find bank statement by ID.
     */
    public Optional<BankStatement> findById(Integer id) {
        try {
            return Optional.ofNullable(bankStatementDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    /**
     * Find all bank statements.
     */
    public List<BankStatement> findAll() {
        return bankStatementDao.findAllActive();
    }

    /**
     * Find bank statement by document number.
     */
    public Optional<BankStatement> findByDocumentNo(String documentNo) {
        return bankStatementDao.findByDocumentNo(documentNo);
    }

    /**
     * Find bank statements by bank account ID.
     */
    public List<BankStatement> findByBankAccountId(Integer bankAccountId) {
        return bankStatementDao.findByBankAccountId(bankAccountId);
    }

    /**
     * Find bank statements by document status.
     */
    public List<BankStatement> findByDocStatus(String docStatus) {
        return bankStatementDao.findByDocStatus(docStatus);
    }

    /**
     * Find bank statements by date range.
     */
    public List<BankStatement> findByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return bankStatementDao.findByDateRange(startDate, endDate);
    }

    /**
     * Find all draft bank statements.
     */
    public List<BankStatement> findAllDraft() {
        return bankStatementDao.findAllDraft();
    }

    /**
     * Find all completed bank statements.
     */
    public List<BankStatement> findAllCompleted() {
        return bankStatementDao.findAllCompleted();
    }

    /**
     * Save a bank statement.
     */
    public BankStatement save(BankStatement bankStatement) {
        try {
            if (bankStatement.getCBankStatementId() == null) {
                bankStatementDao.insert(bankStatement);
            } else {
                bankStatementDao.update(bankStatement);
            }
            return bankStatement;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Delete a bank statement.
     */
    public void delete(Integer id) {
        try {
            bankStatementDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    /**
     * Check if bank statement exists.
     */
    public boolean exists(Integer id) {
        try {
            return bankStatementDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
