package org.idempiere.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.RequestDao;
import org.idempiere.model.Request;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Request business operations.
 */
@Service
@Transactional
public class RequestService {

    private final RequestDao requestDao;

    public RequestService(RequestDao requestDao) {
        this.requestDao = requestDao;
    }

    /**
     * Find request by ID.
     */
    public Optional<Request> findById(int requestId) {
        return requestDao.findById(requestId);
    }

    /**
     * Find request by document number.
     */
    public Optional<Request> findByDocumentNo(String documentNo, int clientId) {
        return requestDao.findByDocumentNo(documentNo, clientId);
    }

    /**
     * Find all requests for a request type.
     */
    public List<Request> findByRequestType(int requestTypeId) {
        return requestDao.findByRequestType(requestTypeId);
    }

    /**
     * Find all requests for a sales rep.
     */
    public List<Request> findBySalesRep(int salesRepId) {
        return requestDao.findBySalesRep(salesRepId);
    }

    /**
     * Find all requests for a business partner.
     */
    public List<Request> findByBPartner(int bPartnerId) {
        return requestDao.findByBPartner(bPartnerId);
    }

    /**
     * Find all requests for a user.
     */
    public List<Request> findByUser(int userId) {
        return requestDao.findByUser(userId);
    }

    /**
     * Find all requests by status.
     */
    public List<Request> findByStatus(int statusId) {
        return requestDao.findByStatus(statusId);
    }

    /**
     * Find all requests for a project.
     */
    public List<Request> findByProject(int projectId) {
        return requestDao.findByProject(projectId);
    }

    /**
     * Find all open requests.
     */
    public List<Request> findOpenRequests() {
        return requestDao.findOpenRequests();
    }

    /**
     * Find all requests for a client.
     */
    public List<Request> findByClient(int clientId) {
        return requestDao.findByClient(clientId);
    }

    /**
     * Find all active requests.
     */
    public List<Request> findAllActive() {
        return requestDao.findAllActive();
    }

    /**
     * Save a request.
     */
    public Request save(Request request) {
        if (request.getRRequestId() == null || request.getRRequestId() == 0) {
            requestDao.insert(request);
        } else {
            requestDao.update(request);
        }
        return request;
    }

    /**
     * Close a request.
     */
    public Request closeRequest(Request request) {
        request.setProcessed("Y");
        request.setCloseDate(LocalDateTime.now());
        requestDao.update(request);
        return request;
    }

    /**
     * Escalate a request.
     */
    public Request escalateRequest(Request request, int supervisorId) {
        request.setIsEscalated("Y");
        request.setSalesRepId(supervisorId);
        requestDao.update(request);
        return request;
    }

    /**
     * Delete a request.
     */
    public void delete(int requestId) {
        requestDao.deleteById(requestId);
    }

    /**
     * Count all requests.
     */
    public long count() {
        return requestDao.count();
    }
}
