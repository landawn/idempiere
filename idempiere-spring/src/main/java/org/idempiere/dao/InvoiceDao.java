package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Invoice;

/**
 * DAO interface for Invoice entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface InvoiceDao extends CrudDao<Invoice, Integer, SQLBuilder.NSC, InvoiceDao> {

    /**
     * Find an invoice by document number
     */
    @Select("SELECT * FROM C_Invoice WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<Invoice> findByDocumentNo(String documentNo);

    /**
     * Find invoices by business partner
     */
    @Select("SELECT * FROM C_Invoice WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findByBPartnerId(Integer bPartnerId);

    /**
     * Find invoices by document status
     */
    @Select("SELECT * FROM C_Invoice WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findByDocStatus(String docStatus);

    /**
     * Find customer invoices (IsSOTrx = Y)
     */
    @Select("SELECT * FROM C_Invoice WHERE IsSOTrx = 'Y' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findAllCustomerInvoices();

    /**
     * Find vendor invoices (IsSOTrx = N)
     */
    @Select("SELECT * FROM C_Invoice WHERE IsSOTrx = 'N' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findAllVendorInvoices();

    /**
     * Find invoices by date range
     */
    @Select("SELECT * FROM C_Invoice WHERE DateInvoiced BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Find unpaid invoices
     */
    @Select("SELECT * FROM C_Invoice WHERE IsPaid = 'N' AND DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateInvoiced")
    List<Invoice> findUnpaid();

    /**
     * Find unpaid invoices for a business partner
     */
    @Select("SELECT * FROM C_Invoice WHERE C_BPartner_ID = :bPartnerId AND IsPaid = 'N' AND DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateInvoiced")
    List<Invoice> findUnpaidByBPartnerId(Integer bPartnerId);

    /**
     * Find invoices in dispute
     */
    @Select("SELECT * FROM C_Invoice WHERE IsInDispute = 'Y' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findInDispute();

    /**
     * Find draft invoices
     */
    @Select("SELECT * FROM C_Invoice WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findAllDraft();

    /**
     * Find completed invoices
     */
    @Select("SELECT * FROM C_Invoice WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findAllCompleted();

    /**
     * Find invoices by order
     */
    @Select("SELECT * FROM C_Invoice WHERE C_Order_ID = :orderId AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findByOrderId(Integer orderId);

    /**
     * Find invoices by sales representative
     */
    @Select("SELECT * FROM C_Invoice WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY DateInvoiced DESC")
    List<Invoice> findBySalesRepId(Integer salesRepId);
}
