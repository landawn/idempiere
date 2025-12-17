package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PrintFormatDao;
import org.idempiere.model.PrintFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Print Format business operations.
 */
@Service
@Transactional
public class PrintFormatService {

    private final PrintFormatDao printFormatDao;

    public PrintFormatService(PrintFormatDao printFormatDao) {
        this.printFormatDao = printFormatDao;
    }

    /**
     * Find print format by ID.
     */
    public Optional<PrintFormat> findById(int printFormatId) {
        return printFormatDao.findById(printFormatId);
    }

    /**
     * Find print format by name.
     */
    public Optional<PrintFormat> findByName(String name, int clientId) {
        return printFormatDao.findByName(name, clientId);
    }

    /**
     * Find all print formats for a table.
     */
    public List<PrintFormat> findByTable(int tableId) {
        return printFormatDao.findByTable(tableId);
    }

    /**
     * Find all print formats for a report view.
     */
    public List<PrintFormat> findByReportView(int reportViewId) {
        return printFormatDao.findByReportView(reportViewId);
    }

    /**
     * Find default print format for a table.
     */
    public Optional<PrintFormat> findDefault(int tableId, int clientId) {
        return printFormatDao.findDefault(tableId, clientId);
    }

    /**
     * Find all forms.
     */
    public List<PrintFormat> findForms() {
        return printFormatDao.findForms();
    }

    /**
     * Find all print formats for a client.
     */
    public List<PrintFormat> findByClient(int clientId) {
        return printFormatDao.findByClient(clientId);
    }

    /**
     * Find all active print formats.
     */
    public List<PrintFormat> findAllActive() {
        return printFormatDao.findAllActive();
    }

    /**
     * Save a print format.
     */
    public PrintFormat save(PrintFormat printFormat) {
        if (printFormat.getAdPrintFormatId() == null || printFormat.getAdPrintFormatId() == 0) {
            printFormatDao.insert(printFormat);
        } else {
            printFormatDao.update(printFormat);
        }
        return printFormat;
    }

    /**
     * Delete a print format.
     */
    public void delete(int printFormatId) {
        printFormatDao.deleteById(printFormatId);
    }

    /**
     * Count all print formats.
     */
    public long count() {
        return printFormatDao.count();
    }
}
