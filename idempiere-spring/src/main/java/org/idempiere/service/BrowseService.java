package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.BrowseDao;
import org.idempiere.model.Browse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Smart Browse business operations.
 */
@Service
@Transactional
public class BrowseService {

    private final BrowseDao browseDao;

    public BrowseService(BrowseDao browseDao) {
        this.browseDao = browseDao;
    }

    /**
     * Find browse by ID.
     */
    public Optional<Browse> findById(int browseId) {
        try { return Optional.ofNullable(browseDao.gett(browseId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find browse by value code.
     */
    public Optional<Browse> findByValue(String value) {
        return browseDao.findByValue(value);
    }

    /**
     * Find all browses for a client.
     */
    public List<Browse> findByClient(int clientId) {
        return browseDao.findByClient(clientId);
    }

    /**
     * Find all browses for a window.
     */
    public List<Browse> findByWindow(int windowId) {
        return browseDao.findByWindow(windowId);
    }

    /**
     * Search browses by name pattern.
     */
    public List<Browse> searchByName(String name) {
        return browseDao.searchByName("%" + name + "%");
    }

    /**
     * Find all active browses.
     */
    public List<Browse> findAllActive() {
        return browseDao.findAllActive();
    }

    /**
     * Save a browse.
     */
    public Browse save(Browse browse) {
        try {
            if (browse.getAdBrowseId() == null || browse.getAdBrowseId() == 0) {
                browseDao.insert(browse);
            } else {
                browseDao.update(browse);
            }
            return browse;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    /**
     * Delete a browse.
     */
    public void delete(int browseId) {
        try { browseDao.deleteById(browseId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Count all browses.
     */
    public long count() {
        return browseDao.findAllActive().size();
    }
}
