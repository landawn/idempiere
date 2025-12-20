package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ProcessDao;
import org.idempiere.model.Process;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * Service class for Process business operations.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class ProcessService {

    private final ProcessDao processDao;

    /**
     * Find process by ID.
     */
    public Optional<Process> findById(int processId) {
        try { return Optional.ofNullable(processDao.gett(processId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find process by value.
     */
    public Optional<Process> findByValue(String value) {
        return processDao.findByValue(value);
    }

    /**
     * Find process by name.
     */
    public Optional<Process> findByName(String name) {
        return processDao.findByName(name);
    }

    /**
     * Find processes by classname.
     */
    public List<Process> findByClassname(String classname) {
        return processDao.findByClassname(classname);
    }

    /**
     * Find all report processes.
     */
    public List<Process> findAllReports() {
        return processDao.findAllReports();
    }

    /**
     * Find processes by entity type.
     */
    public List<Process> findByEntityType(String entityType) {
        return processDao.findByEntityType(entityType);
    }

    /**
     * Find processes by procedure name.
     */
    public List<Process> findByProcedureName(String procedureName) {
        return processDao.findByProcedureName(procedureName);
    }

    /**
     * Find all active processes.
     */
    public List<Process> findAllActive() {
        return processDao.findAllActive();
    }

    /**
     * Find all processes.
     */
    public List<Process> findAll() {
        return processDao.findAll();
    }

    /**
     * Save a process.
     */
    public Process save(Process process) {
        try {
            if (process.getAdProcessId() == null || process.getAdProcessId() == 0) {
                processDao.insert(process);
            } else {
                processDao.update(process);
            }
            return process;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    /**
     * Delete a process.
     */
    public void delete(int processId) {
        try { processDao.deleteById(processId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Check if process exists.
     */
    public boolean exists(int processId) {
        try { return processDao.exists(processId); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
