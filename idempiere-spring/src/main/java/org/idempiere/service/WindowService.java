package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.WindowDao;
import org.idempiere.model.Window;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * Service class for Window business operations.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class WindowService {

    private final WindowDao windowDao;

    /**
     * Find window by ID.
     */
    public Optional<Window> findById(int windowId) {
        try { return Optional.ofNullable(windowDao.gett(windowId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find window by name.
     */
    public Optional<Window> findByName(String name) {
        return windowDao.findByName(name);
    }

    /**
     * Find windows by entity type.
     */
    public List<Window> findByEntityType(String entityType) {
        return windowDao.findByEntityType(entityType);
    }

    /**
     * Find all active windows.
     */
    public List<Window> findAllActive() {
        return windowDao.findAllActive();
    }

    /**
     * Find all windows.
     */
    public List<Window> findAll() {
        return windowDao.findAll();
    }

    /**
     * Save a window.
     */
    public Window save(Window window) {
        try {
            if (window.getAdWindowId() == null || window.getAdWindowId() == 0) {
                windowDao.insert(window);
            } else {
                windowDao.update(window);
            }
            return window;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    /**
     * Delete a window.
     */
    public void delete(int windowId) {
        try { windowDao.deleteById(windowId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Check if window exists.
     */
    public boolean exists(int windowId) {
        try { return windowDao.exists(windowId); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
