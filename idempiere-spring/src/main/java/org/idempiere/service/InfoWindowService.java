package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.InfoWindowDao;
import org.idempiere.model.InfoWindow;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Info Window business operations.
 */
@Service
@Transactional
public class InfoWindowService {

    private final InfoWindowDao infoWindowDao;

    public InfoWindowService(InfoWindowDao infoWindowDao) {
        this.infoWindowDao = infoWindowDao;
    }

    /**
     * Find info window by ID.
     */
    public Optional<InfoWindow> findById(int infoWindowId) {
        try { return Optional.ofNullable(infoWindowDao.gett(infoWindowId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find info window by name.
     */
    public Optional<InfoWindow> findByName(String name, int clientId) {
        return infoWindowDao.findByName(name, clientId);
    }

    /**
     * Find all info windows for a table.
     */
    public List<InfoWindow> findByTable(int tableId) {
        return infoWindowDao.findByTable(tableId);
    }

    /**
     * Find all info windows for a client.
     */
    public List<InfoWindow> findByClient(int clientId) {
        return infoWindowDao.findByClient(clientId);
    }

    /**
     * Find all active info windows.
     */
    public List<InfoWindow> findAllActive() {
        return infoWindowDao.findAllActive();
    }

    /**
     * Save an info window.
     */
    public InfoWindow save(InfoWindow infoWindow) {
        if (infoWindow.getAdInfoWindowId() == null || infoWindow.getAdInfoWindowId() == 0) {
            infoWindowDao.insert(infoWindow);
        } else {
            infoWindowDao.update(infoWindow);
        }
        return infoWindow;
    }

    /**
     * Delete an info window.
     */
    public void delete(int infoWindowId) {
        try { infoWindowDao.deleteById(infoWindowId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Count all info windows.
     */
    public long count() {
        return infoWindowDao.findAllActive().size();
    }
}
