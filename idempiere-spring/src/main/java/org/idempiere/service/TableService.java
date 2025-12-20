package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.TableDao;
import org.idempiere.model.ADTable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * Service class for Table business operations.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class TableService {

    private final TableDao tableDao;

    /**
     * Find table by ID.
     */
    public Optional<ADTable> findById(int tableId) {
        try { return Optional.ofNullable(tableDao.gett(tableId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find table by table name.
     */
    public Optional<ADTable> findByTableName(String tableName) {
        return tableDao.findByTableName(tableName);
    }

    /**
     * Find tables by entity type.
     */
    public List<ADTable> findByEntityType(String entityType) {
        return tableDao.findByEntityType(entityType);
    }

    /**
     * Find all view tables.
     */
    public List<ADTable> findAllViews() {
        return tableDao.findAllViews();
    }

    /**
     * Find all document tables.
     */
    public List<ADTable> findAllDocuments() {
        return tableDao.findAllDocuments();
    }

    /**
     * Find all tables with change log enabled.
     */
    public List<ADTable> findAllWithChangeLog() {
        return tableDao.findAllWithChangeLog();
    }

    /**
     * Find all active tables.
     */
    public List<ADTable> findAllActive() {
        return tableDao.findAllActive();
    }

    /**
     * Find all tables.
     */
    public List<ADTable> findAll() {
        return tableDao.findAll();
    }

    /**
     * Save a table.
     */
    public ADTable save(ADTable table) {
        try {
            if (table.getAdTableId() == null || table.getAdTableId() == 0) {
                tableDao.insert(table);
            } else {
                tableDao.update(table);
            }
            return table;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    /**
     * Delete a table.
     */
    public void delete(int tableId) {
        try { tableDao.deleteById(tableId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Count all tables.
     */
    public long count() {
        return tableDao.countAll();
    }

    /**
     * Check if table exists.
     */
    public boolean exists(int tableId) {
        try { return tableDao.exists(tableId); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
