package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ImportFormatDao;
import org.idempiere.model.ImportFormat;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Import Format business operations.
 */
@Service
@Transactional
public class ImportFormatService {

    private final ImportFormatDao importFormatDao;

    public ImportFormatService(ImportFormatDao importFormatDao) {
        this.importFormatDao = importFormatDao;
    }

    /**
     * Find import format by ID.
     */
    public Optional<ImportFormat> findById(int importFormatId) {
        return importFormatDao.findById(importFormatId);
    }

    /**
     * Find import format by name.
     */
    public Optional<ImportFormat> findByName(String name, int clientId) {
        return importFormatDao.findByName(name, clientId);
    }

    /**
     * Find all import formats for a table.
     */
    public List<ImportFormat> findByTable(int tableId) {
        return importFormatDao.findByTable(tableId);
    }

    /**
     * Find all import formats for a client.
     */
    public List<ImportFormat> findByClient(int clientId) {
        return importFormatDao.findByClient(clientId);
    }

    /**
     * Find all import formats by format type.
     */
    public List<ImportFormat> findByFormatType(String formatType) {
        return importFormatDao.findByFormatType(formatType);
    }

    /**
     * Find all active import formats.
     */
    public List<ImportFormat> findAllActive() {
        return importFormatDao.findAllActive();
    }

    /**
     * Save an import format.
     */
    public ImportFormat save(ImportFormat importFormat) {
        if (importFormat.getAdImpFormatId() == null || importFormat.getAdImpFormatId() == 0) {
            importFormatDao.insert(importFormat);
        } else {
            importFormatDao.update(importFormat);
        }
        return importFormat;
    }

    /**
     * Delete an import format.
     */
    public void delete(int importFormatId) {
        importFormatDao.deleteById(importFormatId);
    }

    /**
     * Count all import formats.
     */
    public long count() {
        return importFormatDao.count();
    }
}
