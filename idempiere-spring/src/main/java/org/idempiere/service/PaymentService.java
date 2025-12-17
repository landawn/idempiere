package org.idempiere.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PaymentDao;
import org.idempiere.model.Payment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Payment entity operations.
 */
@Service
@Transactional
public class PaymentService {

    private final PaymentDao paymentDao;

    public PaymentService(PaymentDao paymentDao) {
        this.paymentDao = paymentDao;
    }

    public Optional<Payment> findById(Integer id) {
        return paymentDao.findById(id);
    }

    public List<Payment> findAll() {
        return paymentDao.findAll();
    }

    public Optional<Payment> findByDocumentNo(String documentNo) {
        return paymentDao.findByDocumentNo(documentNo);
    }

    public List<Payment> findByBPartnerId(Integer bPartnerId) {
        return paymentDao.findByBPartnerId(bPartnerId);
    }

    public List<Payment> findByDocStatus(String docStatus) {
        return paymentDao.findByDocStatus(docStatus);
    }

    public List<Payment> findAllReceipts() {
        return paymentDao.findAllReceipts();
    }

    public List<Payment> findAllPayments() {
        return paymentDao.findAllPayments();
    }

    public List<Payment> findByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return paymentDao.findByDateRange(startDate, endDate);
    }

    public List<Payment> findUnallocated() {
        return paymentDao.findUnallocated();
    }

    public List<Payment> findUnallocatedByBPartnerId(Integer bPartnerId) {
        return paymentDao.findUnallocatedByBPartnerId(bPartnerId);
    }

    public List<Payment> findByInvoiceId(Integer invoiceId) {
        return paymentDao.findByInvoiceId(invoiceId);
    }

    public List<Payment> findByOrderId(Integer orderId) {
        return paymentDao.findByOrderId(orderId);
    }

    public List<Payment> findByBankAccountId(Integer bankAccountId) {
        return paymentDao.findByBankAccountId(bankAccountId);
    }

    public List<Payment> findByTenderType(String tenderType) {
        return paymentDao.findByTenderType(tenderType);
    }

    public List<Payment> findAllPrepayments() {
        return paymentDao.findAllPrepayments();
    }

    public List<Payment> findAllDraft() {
        return paymentDao.findAllDraft();
    }

    public List<Payment> findAllCompleted() {
        return paymentDao.findAllCompleted();
    }

    public Payment save(Payment payment) {
        if (payment.getCPaymentId() == null) {
            paymentDao.insert(payment);
        } else {
            paymentDao.update(payment);
        }
        return payment;
    }

    public void delete(Integer id) {
        paymentDao.deleteById(id);
    }

    public boolean exists(Integer id) {
        return paymentDao.exists(id);
    }
}
