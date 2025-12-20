package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.AlertDao;
import org.idempiere.model.Alert;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Alert business operations.
 */
@Service
@Transactional
public class AlertService {

    private final AlertDao alertDao;

    public AlertService(AlertDao alertDao) {
        this.alertDao = alertDao;
    }

    /**
     * Find alert by ID.
     */
    public Optional<Alert> findById(int alertId) {
        try {
            try { return Optional.ofNullable(alertDao.gett(alertId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
        } catch (Exception e) {
            throw new RuntimeException("Failed to find alert by ID: " + alertId, e);
        }
    }

    /**
     * Find alert by name.
     */
    public Optional<Alert> findByName(String name, int clientId) {
        return alertDao.findByName(name, clientId);
    }

    /**
     * Find all alerts for an alert processor.
     */
    public List<Alert> findByAlertProcessor(int alertProcessorId) {
        return alertDao.findByAlertProcessor(alertProcessorId);
    }

    /**
     * Find all alerts for a client.
     */
    public List<Alert> findByClient(int clientId) {
        return alertDao.findByClient(clientId);
    }

    /**
     * Find all valid alerts.
     */
    public List<Alert> findValidAlerts() {
        return alertDao.findValidAlerts();
    }

    /**
     * Find all active alerts.
     */
    public List<Alert> findAllActive() {
        return alertDao.findAllActive();
    }

    /**
     * Save an alert.
     */
    public Alert save(Alert alert) {
        try {
            if (alert.getAdAlertId() == null || alert.getAdAlertId() == 0) {
                alertDao.insert(alert);
            } else {
                alertDao.update(alert);
            }
            return alert;
        } catch (Exception e) {
            throw new RuntimeException("Failed to save alert", e);
        }
    }

    /**
     * Delete an alert.
     */
    public void delete(int alertId) {
        try {
            try { alertDao.deleteById(alertId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
        } catch (Exception e) {
            throw new RuntimeException("Failed to delete alert: " + alertId, e);
        }
    }

    /**
     * Count all alerts.
     */
    public long count(int clientId) {
        return alertDao.findByClient(clientId).size();
    }

    /**
     * Find all alerts.
     */
    public List<Alert> findAll() {
        return alertDao.findAllActive();
    }

    /**
     * Check if alert exists.
     */
    public boolean exists(int alertId) {
        try {
            try { return alertDao.exists(alertId); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
        } catch (Exception e) {
            throw new RuntimeException("Failed to check if alert exists: " + alertId, e);
        }
    }
}
