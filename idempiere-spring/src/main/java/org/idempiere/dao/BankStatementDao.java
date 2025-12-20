package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.BankStatement;

/**
 * DAO interface for BankStatement entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface BankStatementDao extends CrudDao<BankStatement, Integer, SQLBuilder.PSC, BankStatementDao> {

    /**
     * Find a bank statement by document number
     */
    @Query("SELECT * FROM C_BankStatement WHERE Name = :documentNo AND IsActive = 'Y'")
    Optional<BankStatement> findByDocumentNo(String documentNo);

    /**
     * Find bank statements by bank account
     */
    @Query("SELECT * FROM C_BankStatement WHERE C_BankAccount_ID = :bankAccountId AND IsActive = 'Y' ORDER BY StatementDate DESC")
    List<BankStatement> findByBankAccountId(Integer bankAccountId);

    /**
     * Find bank statements by document status
     */
    @Query("SELECT * FROM C_BankStatement WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY StatementDate DESC")
    List<BankStatement> findByDocStatus(String docStatus);

    /**
     * Find bank statements by date range
     */
    @Query("SELECT * FROM C_BankStatement WHERE StatementDate BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY StatementDate DESC")
    List<BankStatement> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Find all draft bank statements
     */
    @Query("SELECT * FROM C_BankStatement WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY StatementDate DESC")
    List<BankStatement> findAllDraft();

    /**
     * Find all completed bank statements
     */
    @Query("SELECT * FROM C_BankStatement WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY StatementDate DESC")
    List<BankStatement> findAllCompleted();

    /**
     * Find all active bank statements
     */
    @Query("SELECT * FROM C_BankStatement WHERE IsActive = 'Y' ORDER BY StatementDate DESC")
    List<BankStatement> findAllActive();
}
