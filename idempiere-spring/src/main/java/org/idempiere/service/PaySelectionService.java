package org.idempiere.service;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PaySelectionDao;
import org.idempiere.model.PaySelection;
import org.idempiere.model.PaySelectionLine;
import org.idempiere.model.PaySelectionCheck;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Pay Selection operations.
 */
@Service
@Transactional
public class PaySelectionService {

    private final PaySelectionDao paySelectionDao;

    public PaySelectionService(PaySelectionDao paySelectionDao) {
        this.paySelectionDao = paySelectionDao;
    }

    /**
     * Get pay selection by ID.
     */
    public Optional<PaySelection> getById(int paySelectionId) {
        try { return Optional.ofNullable(paySelectionDao.gett(paySelectionId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Get unprocessed pay selections for a client.
     */
    public List<PaySelection> getUnprocessedByClient(int clientId) {
        return paySelectionDao.findUnprocessedByClient(clientId);
    }

    /**
     * Get pay selections by bank account.
     */
    public List<PaySelection> getByBankAccount(int bankAccountId) {
        return paySelectionDao.findByBankAccount(bankAccountId);
    }

    /**
     * Get pay selection lines.
     */
    public List<PaySelectionLine> getLines(int paySelectionId) {
        return paySelectionDao.findLinesBySelection(paySelectionId);
    }

    /**
     * Get pay selection checks.
     */
    public List<PaySelectionCheck> getChecks(int paySelectionId) {
        return paySelectionDao.findChecksBySelection(paySelectionId);
    }

    /**
     * Get unprinted checks for a business partner.
     */
    public List<PaySelectionCheck> getUnprintedChecks(int bPartnerId) {
        return paySelectionDao.findUnprintedChecksByBPartner(bPartnerId);
    }

    /**
     * Calculate total payment amount for a selection.
     */
    public BigDecimal getTotalPayAmount(int paySelectionId) {
        List<PaySelectionLine> lines = paySelectionDao.findLinesBySelection(paySelectionId);
        return lines.stream()
                .map(l -> l.getPayAmt() != null ? l.getPayAmt() : BigDecimal.ZERO)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Create a new pay selection.
     */
    public PaySelection createPaySelection(PaySelection paySelection) {
        paySelection.setProcessed("N");
        paySelectionDao.insert(paySelection);
        return paySelection;
    }

    /**
     * Update pay selection.
     */
    public PaySelection updatePaySelection(PaySelection paySelection) {
        paySelectionDao.update(paySelection);
        return paySelection;
    }

    /**
     * Delete pay selection.
     */
    public void deletePaySelection(int paySelectionId) {
        try { paySelectionDao.deleteById(paySelectionId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }
}
