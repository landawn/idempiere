package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Payment;

/**
 * DAO interface for Payment entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface PaymentDao extends CrudDao<Payment, Integer, SQLBuilder.PSC, PaymentDao> {

    /**
     * Find a payment by document number
     */
    @Query("SELECT * FROM C_Payment WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<Payment> findByDocumentNo(String documentNo);

    /**
     * Find payments by business partner
     */
    @Query("SELECT * FROM C_Payment WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findByBPartnerId(Integer bPartnerId);

    /**
     * Find payments by document status
     */
    @Query("SELECT * FROM C_Payment WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findByDocStatus(String docStatus);

    /**
     * Find receipts (IsReceipt = Y)
     */
    @Query("SELECT * FROM C_Payment WHERE IsReceipt = 'Y' AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findAllReceipts();

    /**
     * Find payments (IsReceipt = N)
     */
    @Query("SELECT * FROM C_Payment WHERE IsReceipt = 'N' AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findAllPayments();

    /**
     * Find payments by date range
     */
    @Query("SELECT * FROM C_Payment WHERE DateTrx BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Find unallocated payments
     */
    @Query("SELECT * FROM C_Payment WHERE IsAllocated = 'N' AND DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateTrx")
    List<Payment> findUnallocated();

    /**
     * Find unallocated payments for a business partner
     */
    @Query("SELECT * FROM C_Payment WHERE C_BPartner_ID = :bPartnerId AND IsAllocated = 'N' AND DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateTrx")
    List<Payment> findUnallocatedByBPartnerId(Integer bPartnerId);

    /**
     * Find payments by invoice
     */
    @Query("SELECT * FROM C_Payment WHERE C_Invoice_ID = :invoiceId AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findByInvoiceId(Integer invoiceId);

    /**
     * Find payments by order
     */
    @Query("SELECT * FROM C_Payment WHERE C_Order_ID = :orderId AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findByOrderId(Integer orderId);

    /**
     * Find payments by bank account
     */
    @Query("SELECT * FROM C_Payment WHERE C_BankAccount_ID = :bankAccountId AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findByBankAccountId(Integer bankAccountId);

    /**
     * Find payments by tender type
     */
    @Query("SELECT * FROM C_Payment WHERE TenderType = :tenderType AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findByTenderType(String tenderType);

    /**
     * Find prepayments
     */
    @Query("SELECT * FROM C_Payment WHERE IsPrepayment = 'Y' AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findAllPrepayments();

    /**
     * Find draft payments
     */
    @Query("SELECT * FROM C_Payment WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findAllDraft();

    /**
     * Find completed payments
     */
    @Query("SELECT * FROM C_Payment WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateTrx DESC")
    List<Payment> findAllCompleted();

    /**
     * Find all payments including inactive
     */
    @Query("SELECT * FROM C_Payment ORDER BY DateTrx DESC")
    List<Payment> findAll();
}
