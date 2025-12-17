package org.idempiere.service;

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
        return browseDao.findById(browseId);
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
        if (browse.getAdBrowseId() == null || browse.getAdBrowseId() == 0) {
            browseDao.insert(browse);
        } else {
            browseDao.update(browse);
        }
        return browse;
    }

    /**
     * Delete a browse.
     */
    public void delete(int browseId) {
        browseDao.deleteById(browseId);
    }

    /**
     * Count all browses.
     */
    public long count() {
        return browseDao.count();
    }
}
