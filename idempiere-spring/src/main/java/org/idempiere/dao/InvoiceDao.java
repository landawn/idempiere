package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Invoice;

/**
 * DAO interface for Invoice entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface InvoiceDao extends CrudDao<Invoice, Integer, SQLBuilder.PSC, InvoiceDao> {

    /**
     * Find an invoice by document number
     */
    @Query("SELECT * FROM C_Invoice WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<Invoice> findByDocumentNo(String documentNo);

    /**
     * Find invoices by business partner
     */
    @Query("SELECT * FROM C_Invoice WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findByBPartnerId(Integer bPartnerId);

    /**
     * Find invoices by document status
     */
    @Query("SELECT * FROM C_Invoice WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findByDocStatus(String docStatus);

    /**
     * Find customer invoices (IsSOTrx = Y)
     */
    @Query("SELECT * FROM C_Invoice WHERE IsSOTrx = 'Y' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findAllCustomerInvoices();

    /**
     * Find vendor invoices (IsSOTrx = N)
     */
    @Query("SELECT * FROM C_Invoice WHERE IsSOTrx = 'N' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findAllVendorInvoices();

    /**
     * Find invoices by date range
     */
    @Query("SELECT * FROM C_Invoice WHERE DateInvoiced BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Find unpaid invoices
     */
    @Query("SELECT * FROM C_Invoice WHERE IsPaid = 'N' AND DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateInvoiced")
    List<Invoice> findUnpaid();

    /**
     * Find unpaid invoices for a business partner
     */
    @Query("SELECT * FROM C_Invoice WHERE C_BPartner_ID = :bPartnerId AND IsPaid = 'N' AND DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateInvoiced")
    List<Invoice> findUnpaidByBPartnerId(Integer bPartnerId);

    /**
     * Find invoices in dispute
     */
    @Query("SELECT * FROM C_Invoice WHERE IsInDispute = 'Y' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findInDispute();

    /**
     * Find draft invoices
     */
    @Query("SELECT * FROM C_Invoice WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findAllDraft();

    /**
     * Find completed invoices
     */
    @Query("SELECT * FROM C_Invoice WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findAllCompleted();

    /**
     * Find invoices by order
     */
    @Query("SELECT * FROM C_Invoice WHERE C_Order_ID = :orderId AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findByOrderId(Integer orderId);

    /**
     * Find invoices by sales representative
     */
    @Query("SELECT * FROM C_Invoice WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findBySalesRepId(Integer salesRepId);

    /**
     * Find all invoices including inactive
     */
    @Query("SELECT * FROM C_Invoice ORDER BY DateInvoiced DESC")
    List<Invoice> findAll();
}
