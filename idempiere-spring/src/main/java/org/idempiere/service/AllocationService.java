package org.idempiere.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AllocationDao;
import org.idempiere.model.AllocationHdr;
import org.idempiere.model.AllocationLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Payment Allocation operations.
 */
@Service
@Transactional
public class AllocationService {

    private final AllocationDao allocationDao;

    public AllocationService(AllocationDao allocationDao) {
        this.allocationDao = allocationDao;
    }

    /**
     * Get allocation by ID.
     */
    public Optional<AllocationHdr> getById(int allocationId) {
        return allocationDao.findById(allocationId);
    }

    /**
     * Get completed allocations for a client.
     */
    public List<AllocationHdr> getCompletedByClient(int clientId) {
        return allocationDao.findCompletedByClient(clientId);
    }

    /**
     * Get allocations within date range.
     */
    public List<AllocationHdr> getByDateRange(LocalDateTime dateFrom, LocalDateTime dateTo, int clientId) {
        return allocationDao.findByDateRange(dateFrom, dateTo, clientId);
    }

    /**
     * Get allocation lines for a header.
     */
    public List<AllocationLine> getLinesByHeader(int allocationHdrId) {
        return allocationDao.findLinesByHeader(allocationHdrId);
    }

    /**
     * Get allocations for an invoice.
     */
    public List<AllocationLine> getAllocationsForInvoice(int invoiceId) {
        return allocationDao.findLinesByInvoice(invoiceId);
    }

    /**
     * Get allocations for a payment.
     */
    public List<AllocationLine> getAllocationsForPayment(int paymentId) {
        return allocationDao.findLinesByPayment(paymentId);
    }

    /**
     * Get allocations for a business partner.
     */
    public List<AllocationLine> getAllocationsForBPartner(int bPartnerId) {
        return allocationDao.findLinesByBPartner(bPartnerId);
    }

    /**
     * Calculate total allocated amount for an invoice.
     */
    public BigDecimal getTotalAllocatedForInvoice(int invoiceId) {
        List<AllocationLine> lines = allocationDao.findLinesByInvoice(invoiceId);
        return lines.stream()
                .map(l -> l.getAmount() != null ? l.getAmount() : BigDecimal.ZERO)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    /**
     * Create a new allocation header.
     */
    public AllocationHdr createAllocation(AllocationHdr allocation) {
        allocation.setDocStatus("DR");
        allocation.setProcessed("N");
        allocationDao.insert(allocation);
        return allocation;
    }

    /**
     * Update allocation header.
     */
    public AllocationHdr updateAllocation(AllocationHdr allocation) {
        allocationDao.update(allocation);
        return allocation;
    }
}
