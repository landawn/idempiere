package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ReportDao;
import org.idempiere.model.Report;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Financial Report business operations.
 */
@Service
@Transactional
public class ReportService {

    private final ReportDao reportDao;

    public ReportService(ReportDao reportDao) {
        this.reportDao = reportDao;
    }

    /**
     * Find report by ID.
     */
    public Optional<Report> findById(int reportId) {
        return reportDao.findById(reportId);
    }

    /**
     * Find report by name.
     */
    public Optional<Report> findByName(String name, int clientId) {
        return reportDao.findByName(name, clientId);
    }

    /**
     * Find all reports for an accounting schema.
     */
    public List<Report> findByAcctSchema(int acctSchemaId) {
        return reportDao.findByAcctSchema(acctSchemaId);
    }

    /**
     * Find all reports using a report line set.
     */
    public List<Report> findByReportLineSet(int reportLineSetId) {
        return reportDao.findByReportLineSet(reportLineSetId);
    }

    /**
     * Find all reports using a report column set.
     */
    public List<Report> findByReportColumnSet(int reportColumnSetId) {
        return reportDao.findByReportColumnSet(reportColumnSetId);
    }

    /**
     * Find all reports for a client.
     */
    public List<Report> findByClient(int clientId) {
        return reportDao.findByClient(clientId);
    }

    /**
     * Find all active reports.
     */
    public List<Report> findAllActive() {
        return reportDao.findAllActive();
    }

    /**
     * Save a report.
     */
    public Report save(Report report) {
        if (report.getPaReportId() == null || report.getPaReportId() == 0) {
            reportDao.insert(report);
        } else {
            reportDao.update(report);
        }
        return report;
    }

    /**
     * Delete a report.
     */
    public void delete(int reportId) {
        reportDao.deleteById(reportId);
    }

    /**
     * Count all reports.
     */
    public long count() {
        return reportDao.count();
    }
}
