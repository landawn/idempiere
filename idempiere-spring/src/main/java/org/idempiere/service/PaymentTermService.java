package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PaymentTermDao;
import org.idempiere.model.PaymentTerm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for PaymentTerm entity operations.
 */
@Service
@Transactional
public class PaymentTermService {

    private final PaymentTermDao paymentTermDao;

    public PaymentTermService(PaymentTermDao paymentTermDao) {
        this.paymentTermDao = paymentTermDao;
    }

    public Optional<PaymentTerm> findById(Integer id) {
        try { return Optional.ofNullable(paymentTermDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<PaymentTerm> findAll() {
        return paymentTermDao.findAllActive();
    }

    public List<PaymentTerm> findByClient(Integer clientId) {
        return paymentTermDao.findByClient(clientId);
    }

    public Optional<PaymentTerm> findByValue(String value, Integer clientId) {
        return paymentTermDao.findByValueAndClient(value, clientId);
    }

    public Optional<PaymentTerm> findDefault(Integer clientId) {
        return paymentTermDao.findDefault(clientId);
    }

    public PaymentTerm save(PaymentTerm paymentTerm) {
        try {
            if (paymentTerm.getCPaymentTermId() == null) {
                paymentTermDao.insert(paymentTerm);
            } else {
                paymentTermDao.update(paymentTerm);
            }
            return paymentTerm;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { paymentTermDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return paymentTermDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
