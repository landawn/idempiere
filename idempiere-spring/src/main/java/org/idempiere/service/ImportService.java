package org.idempiere.service;

import org.idempiere.dao.ImportProcessorDao;
import org.idempiere.model.ImportProcessor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

/**
 * Service for Import Processor management operations.
 */
@Service
@Transactional(readOnly = true)
public class ImportService {

    private final ImportProcessorDao importProcessorDao;

    public ImportService(ImportProcessorDao importProcessorDao) {
        this.importProcessorDao = importProcessorDao;
    }

    public Optional<ImportProcessor> findById(int processorId) {
        try { return Optional.ofNullable(importProcessorDao.gett(processorId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public Optional<ImportProcessor> findByValue(String value, int clientId) {
        return importProcessorDao.findByValue(value, clientId);
    }

    public Optional<ImportProcessor> findByName(String name, int clientId) {
        return importProcessorDao.findByName(name, clientId);
    }

    public List<ImportProcessor> findByType(int processorTypeId) {
        return importProcessorDao.findByType(processorTypeId);
    }

    public List<ImportProcessor> findDueForRun() {
        return importProcessorDao.findDueForRun(LocalDateTime.now());
    }

    public List<ImportProcessor> findByClient(int clientId) {
        return importProcessorDao.findByClient(clientId);
    }

    @Transactional
    public ImportProcessor create(ImportProcessor processor) {
        importProcessorDao.insert(processor);
        return processor;
    }

    @Transactional
    public ImportProcessor update(ImportProcessor processor) {
        importProcessorDao.update(processor);
        return processor;
    }

    @Transactional
    public void updateLastRun(int processorId) {
        Optional<ImportProcessor> processorOpt = Optional.ofNullable(importProcessorDao.gett(processorId));
        if (processorOpt.isPresent()) {
            ImportProcessor processor = processorOpt.get();
            processor.setDateLastRun(LocalDateTime.now());
            importProcessorDao.update(processor);
        }
    }

    @Transactional
    public void scheduleNextRun(int processorId, LocalDateTime nextRun) {
        Optional<ImportProcessor> processorOpt = Optional.ofNullable(importProcessorDao.gett(processorId));
        if (processorOpt.isPresent()) {
            ImportProcessor processor = processorOpt.get();
            processor.setDateNextRun(nextRun);
            importProcessorDao.update(processor);
        }
    }

    @Transactional
    public void delete(int processorId) {
        try {
            Optional<ImportProcessor> processorOpt = Optional.ofNullable(importProcessorDao.gett(processorId));
            if (processorOpt.isPresent()) {
                importProcessorDao.delete(processorOpt.get());
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
