package org.idempiere.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.InvoiceDao;
import org.idempiere.dao.InvoiceLineDao;
import org.idempiere.model.Invoice;
import org.idempiere.model.InvoiceLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Invoice and InvoiceLine entity operations.
 */
@Service
@Transactional
public class InvoiceService {

    private final InvoiceDao invoiceDao;
    private final InvoiceLineDao invoiceLineDao;

    public InvoiceService(InvoiceDao invoiceDao, InvoiceLineDao invoiceLineDao) {
        this.invoiceDao = invoiceDao;
        this.invoiceLineDao = invoiceLineDao;
    }

    // Invoice operations

    public Optional<Invoice> findById(Integer id) {
        return invoiceDao.findById(id);
    }

    public List<Invoice> findAll() {
        return invoiceDao.findAll();
    }

    public Optional<Invoice> findByDocumentNo(String documentNo) {
        return invoiceDao.findByDocumentNo(documentNo);
    }

    public List<Invoice> findByBPartnerId(Integer bPartnerId) {
        return invoiceDao.findByBPartnerId(bPartnerId);
    }

    public List<Invoice> findByDocStatus(String docStatus) {
        return invoiceDao.findByDocStatus(docStatus);
    }

    public List<Invoice> findAllCustomerInvoices() {
        return invoiceDao.findAllCustomerInvoices();
    }

    public List<Invoice> findAllVendorInvoices() {
        return invoiceDao.findAllVendorInvoices();
    }

    public List<Invoice> findByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return invoiceDao.findByDateRange(startDate, endDate);
    }

    public List<Invoice> findUnpaid() {
        return invoiceDao.findUnpaid();
    }

    public List<Invoice> findUnpaidByBPartnerId(Integer bPartnerId) {
        return invoiceDao.findUnpaidByBPartnerId(bPartnerId);
    }

    public List<Invoice> findInDispute() {
        return invoiceDao.findInDispute();
    }

    public List<Invoice> findAllDraft() {
        return invoiceDao.findAllDraft();
    }

    public List<Invoice> findAllCompleted() {
        return invoiceDao.findAllCompleted();
    }

    public List<Invoice> findByOrderId(Integer orderId) {
        return invoiceDao.findByOrderId(orderId);
    }

    public List<Invoice> findBySalesRepId(Integer salesRepId) {
        return invoiceDao.findBySalesRepId(salesRepId);
    }

    public Invoice save(Invoice invoice) {
        if (invoice.getCInvoiceId() == null) {
            invoiceDao.insert(invoice);
        } else {
            invoiceDao.update(invoice);
        }
        return invoice;
    }

    public void delete(Integer id) {
        // First delete all invoice lines
        List<InvoiceLine> lines = invoiceLineDao.findByInvoiceId(id);
        for (InvoiceLine line : lines) {
            invoiceLineDao.deleteById(line.getCInvoiceLineId());
        }
        // Then delete the invoice
        invoiceDao.deleteById(id);
    }

    public boolean exists(Integer id) {
        return invoiceDao.exists(id);
    }

    // InvoiceLine operations

    public Optional<InvoiceLine> findLineById(Integer id) {
        return invoiceLineDao.findById(id);
    }

    public List<InvoiceLine> findLinesByInvoiceId(Integer invoiceId) {
        return invoiceLineDao.findByInvoiceId(invoiceId);
    }

    public List<InvoiceLine> findLinesByProductId(Integer productId) {
        return invoiceLineDao.findByProductId(productId);
    }

    public List<InvoiceLine> findLinesByOrderLineId(Integer orderLineId) {
        return invoiceLineDao.findByOrderLineId(orderLineId);
    }

    public InvoiceLine saveLine(InvoiceLine invoiceLine) {
        if (invoiceLine.getCInvoiceLineId() == null) {
            invoiceLineDao.insert(invoiceLine);
        } else {
            invoiceLineDao.update(invoiceLine);
        }
        return invoiceLine;
    }

    public void deleteLine(Integer lineId) {
        invoiceLineDao.deleteById(lineId);
    }
}
