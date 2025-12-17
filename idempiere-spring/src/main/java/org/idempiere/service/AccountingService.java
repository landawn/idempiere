package org.idempiere.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AcctFactDao;
import org.idempiere.dao.GLDistributionDao;
import org.idempiere.model.AcctFact;
import org.idempiere.model.GLDistribution;
import org.idempiere.model.GLDistributionLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Accounting operations.
 */
@Service
@Transactional(readOnly = true)
public class AccountingService {

    private final AcctFactDao acctFactDao;
    private final GLDistributionDao glDistributionDao;

    public AccountingService(AcctFactDao acctFactDao, GLDistributionDao glDistributionDao) {
        this.acctFactDao = acctFactDao;
        this.glDistributionDao = glDistributionDao;
    }

    /**
     * Get accounting facts for a document.
     */
    public List<AcctFact> getFactsByDocument(int tableId, int recordId) {
        return acctFactDao.findByDocument(tableId, recordId);
    }

    /**
     * Get accounting facts for an account within date range.
     */
    public List<AcctFact> getFactsByAccount(int accountId, LocalDateTime dateFrom, LocalDateTime dateTo) {
        return acctFactDao.findByAccountAndDateRange(accountId, dateFrom, dateTo);
    }

    /**
     * Get accounting facts for a period.
     */
    public List<AcctFact> getFactsByPeriod(int acctSchemaId, int periodId) {
        return acctFactDao.findBySchemaAndPeriod(acctSchemaId, periodId);
    }

    /**
     * Get accounting facts for a business partner.
     */
    public List<AcctFact> getFactsByBPartner(int bPartnerId, LocalDateTime dateFrom, LocalDateTime dateTo) {
        return acctFactDao.findByBPartnerAndDateRange(bPartnerId, dateFrom, dateTo);
    }

    /**
     * Get accounting facts for a project.
     */
    public List<AcctFact> getFactsByProject(int projectId) {
        return acctFactDao.findByProject(projectId);
    }

    /**
     * Calculate account balance for date range.
     */
    public BigDecimal calculateBalance(int accountId, LocalDateTime dateFrom, LocalDateTime dateTo) {
        List<AcctFact> facts = acctFactDao.findByAccountAndDateRange(accountId, dateFrom, dateTo);
        BigDecimal debit = facts.stream()
                .map(f -> f.getAmtAcctDr() != null ? f.getAmtAcctDr() : BigDecimal.ZERO)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal credit = facts.stream()
                .map(f -> f.getAmtAcctCr() != null ? f.getAmtAcctCr() : BigDecimal.ZERO)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return debit.subtract(credit);
    }

    /**
     * Get valid GL distributions for an account schema.
     */
    public List<GLDistribution> getValidDistributions(int acctSchemaId) {
        return glDistributionDao.findValidBySchema(acctSchemaId);
    }

    /**
     * Get distributions by account.
     */
    public List<GLDistribution> getDistributionsByAccount(int accountId) {
        return glDistributionDao.findByAccount(accountId);
    }

    /**
     * Get distribution lines.
     */
    public List<GLDistributionLine> getDistributionLines(int distributionId) {
        return glDistributionDao.findLinesByDistribution(distributionId);
    }

    /**
     * Create an accounting fact record.
     */
    @Transactional
    public AcctFact createFact(AcctFact fact) {
        acctFactDao.insert(fact);
        return fact;
    }
}
