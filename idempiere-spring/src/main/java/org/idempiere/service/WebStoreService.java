package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.WebStoreDao;
import org.idempiere.model.WebStore;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Web Store business operations.
 */
@Service
@Transactional
public class WebStoreService {

    private final WebStoreDao webStoreDao;

    public WebStoreService(WebStoreDao webStoreDao) {
        this.webStoreDao = webStoreDao;
    }

    /**
     * Find web store by ID.
     */
    public Optional<WebStore> findById(int webStoreId) {
        return webStoreDao.findById(webStoreId);
    }

    /**
     * Find web store by name.
     */
    public Optional<WebStore> findByName(String name, int clientId) {
        return webStoreDao.findByName(name, clientId);
    }

    /**
     * Find web store by web context.
     */
    public Optional<WebStore> findByWebContext(String webContext) {
        return webStoreDao.findByWebContext(webContext);
    }

    /**
     * Find all web stores for a client.
     */
    public List<WebStore> findByClient(int clientId) {
        return webStoreDao.findByClient(clientId);
    }

    /**
     * Find default web store for a client.
     */
    public Optional<WebStore> findDefaultStore(int clientId) {
        return webStoreDao.findDefaultStore(clientId);
    }

    /**
     * Find all active web stores.
     */
    public List<WebStore> findAllActive() {
        return webStoreDao.findAllActive();
    }

    /**
     * Save a web store.
     */
    public WebStore save(WebStore webStore) {
        if (webStore.getWStoreId() == null || webStore.getWStoreId() == 0) {
            webStoreDao.insert(webStore);
        } else {
            webStoreDao.update(webStore);
        }
        return webStore;
    }

    /**
     * Delete a web store.
     */
    public void delete(int webStoreId) {
        webStoreDao.deleteById(webStoreId);
    }

    /**
     * Count all web stores.
     */
    public long count() {
        return webStoreDao.count();
    }
}
