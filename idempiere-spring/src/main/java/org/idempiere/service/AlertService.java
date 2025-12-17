package org.idempiere.service;

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
        return alertDao.findById(alertId);
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
        if (alert.getAdAlertId() == null || alert.getAdAlertId() == 0) {
            alertDao.insert(alert);
        } else {
            alertDao.update(alert);
        }
        return alert;
    }

    /**
     * Delete an alert.
     */
    public void delete(int alertId) {
        alertDao.deleteById(alertId);
    }

    /**
     * Count all alerts.
     */
    public long count() {
        return alertDao.count();
    }
}
