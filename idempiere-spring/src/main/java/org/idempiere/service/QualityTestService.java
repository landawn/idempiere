package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.QualityTestDao;
import org.idempiere.model.QualityTest;
import org.idempiere.model.QualityTestResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Quality Test operations.
 */
@Service
@Transactional
public class QualityTestService {

    private final QualityTestDao qualityTestDao;

    public QualityTestService(QualityTestDao qualityTestDao) {
        this.qualityTestDao = qualityTestDao;
    }

    /**
     * Get quality test by ID.
     */
    public Optional<QualityTest> getById(int testId) {
        try { return Optional.ofNullable(qualityTestDao.gett(testId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Get all quality tests for a client.
     */
    public List<QualityTest> getByClient(int clientId) {
        return qualityTestDao.findByClient(clientId);
    }

    /**
     * Get test results for a quality test.
     */
    public List<QualityTestResult> getResultsByTest(int testId) {
        return qualityTestDao.findResultsByTest(testId);
    }

    /**
     * Get test results for an attribute set instance.
     */
    public List<QualityTestResult> getResultsByASI(int asiId) {
        return qualityTestDao.findResultsByASI(asiId);
    }

    /**
     * Get failed test results for an attribute set instance.
     */
    public List<QualityTestResult> getFailedResultsByASI(int asiId) {
        return qualityTestDao.findFailedResultsByASI(asiId);
    }

    /**
     * Check if all QC tests passed for an ASI.
     */
    public boolean allTestsPassed(int asiId) {
        return qualityTestDao.findFailedResultsByASI(asiId).isEmpty();
    }

    /**
     * Create a new quality test.
     */
    public QualityTest createTest(QualityTest test) {
        qualityTestDao.insert(test);
        return test;
    }

    /**
     * Update quality test.
     */
    public QualityTest updateTest(QualityTest test) {
        qualityTestDao.update(test);
        return test;
    }

    /**
     * Delete quality test.
     */
    public void deleteTest(int testId) {
        try { qualityTestDao.deleteById(testId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }
}
