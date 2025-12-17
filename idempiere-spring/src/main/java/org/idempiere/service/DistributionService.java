package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.DistributionListDao;
import org.idempiere.model.DistributionList;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Distribution List business operations.
 */
@Service
@Transactional
public class DistributionService {

    private final DistributionListDao distributionListDao;

    public DistributionService(DistributionListDao distributionListDao) {
        this.distributionListDao = distributionListDao;
    }

    /**
     * Find distribution list by ID.
     */
    public Optional<DistributionList> findById(int distributionListId) {
        return distributionListDao.findById(distributionListId);
    }

    /**
     * Find distribution list by name.
     */
    public Optional<DistributionList> findByName(String name, int clientId) {
        return distributionListDao.findByName(name, clientId);
    }

    /**
     * Find all distribution lists for a client.
     */
    public List<DistributionList> findByClient(int clientId) {
        return distributionListDao.findByClient(clientId);
    }

    /**
     * Find all active distribution lists.
     */
    public List<DistributionList> findAllActive() {
        return distributionListDao.findAllActive();
    }

    /**
     * Save a distribution list.
     */
    public DistributionList save(DistributionList distributionList) {
        if (distributionList.getMDistributionListId() == null || distributionList.getMDistributionListId() == 0) {
            distributionListDao.insert(distributionList);
        } else {
            distributionListDao.update(distributionList);
        }
        return distributionList;
    }

    /**
     * Delete a distribution list.
     */
    public void delete(int distributionListId) {
        distributionListDao.deleteById(distributionListId);
    }

    /**
     * Count all distribution lists.
     */
    public long count() {
        return distributionListDao.count();
    }
}
