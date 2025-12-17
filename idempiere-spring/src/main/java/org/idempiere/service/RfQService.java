package org.idempiere.service;

import java.util.List;
import java.util.Optional;

import org.idempiere.dao.RfQDao;
import org.idempiere.model.RfQ;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Request for Quotation business operations.
 */
@Service
@Transactional
public class RfQService {

    private final RfQDao rfQDao;

    public RfQService(RfQDao rfQDao) {
        this.rfQDao = rfQDao;
    }

    /**
     * Find RfQ by ID.
     */
    public Optional<RfQ> findById(int rfQId) {
        return rfQDao.findById(rfQId);
    }

    /**
     * Find RfQ by document number.
     */
    public Optional<RfQ> findByDocumentNo(String documentNo, int clientId) {
        return rfQDao.findByDocumentNo(documentNo, clientId);
    }

    /**
     * Find all RfQs for a client and organization.
     */
    public List<RfQ> findByClientAndOrg(int clientId, int orgId) {
        return rfQDao.findByClientAndOrg(clientId, orgId);
    }

    /**
     * Find all RfQs for a business partner.
     */
    public List<RfQ> findByBPartner(int bPartnerId) {
        return rfQDao.findByBPartner(bPartnerId);
    }

    /**
     * Find all RfQs for a sales representative.
     */
    public List<RfQ> findBySalesRep(int salesRepId) {
        return rfQDao.findBySalesRep(salesRepId);
    }

    /**
     * Find all RfQs by topic.
     */
    public List<RfQ> findByTopic(int topicId) {
        return rfQDao.findByTopic(topicId);
    }

    /**
     * Find all open (unprocessed) RfQs.
     */
    public List<RfQ> findOpenRfQs() {
        return rfQDao.findOpenRfQs();
    }

    /**
     * Save an RfQ.
     */
    public RfQ save(RfQ rfQ) {
        if (rfQ.getCRfQId() == null || rfQ.getCRfQId() == 0) {
            rfQDao.insert(rfQ);
        } else {
            rfQDao.update(rfQ);
        }
        return rfQ;
    }

    /**
     * Delete an RfQ.
     */
    public void delete(int rfQId) {
        rfQDao.deleteById(rfQId);
    }

    /**
     * Count all RfQs.
     */
    public long count() {
        return rfQDao.count();
    }
}
