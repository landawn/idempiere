package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.RequisitionDao;
import org.idempiere.dao.RequisitionLineDao;
import org.idempiere.model.Requisition;
import org.idempiere.model.RequisitionLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Requisition entity operations.
 */
@Service
@Transactional
public class RequisitionService {

    private final RequisitionDao requisitionDao;
    private final RequisitionLineDao requisitionLineDao;

    public RequisitionService(RequisitionDao requisitionDao, RequisitionLineDao requisitionLineDao) {
        this.requisitionDao = requisitionDao;
        this.requisitionLineDao = requisitionLineDao;
    }

    public Optional<Requisition> findById(Integer id) {
        try { return Optional.ofNullable(requisitionDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Requisition> findAll() {
        return requisitionDao.findAllActive();
    }

    public Optional<Requisition> findByDocumentNo(String documentNo, Integer clientId) {
        return requisitionDao.findByDocumentNo(documentNo, clientId);
    }

    public List<Requisition> findOpenByUser(Integer userId) {
        return requisitionDao.findOpenByUser(userId);
    }

    public List<Requisition> findByDocStatus(String docStatus, Integer clientId) {
        return requisitionDao.findByDocStatus(docStatus, clientId);
    }

    public List<RequisitionLine> findLinesByRequisition(Integer requisitionId) {
        return requisitionLineDao.findByRequisition(requisitionId);
    }

    public List<RequisitionLine> findUnorderedLines() {
        return requisitionLineDao.findUnorderedLines();
    }

    public Requisition save(Requisition requisition) {
        try {
            if (requisition.getMRequisitionId() == null) {
                requisitionDao.insert(requisition);
            } else {
                requisitionDao.update(requisition);
            }
            return requisition;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public RequisitionLine saveLine(RequisitionLine line) {
        try {
            if (line.getMRequisitionLineId() == null) {
                requisitionLineDao.insert(line);
            } else {
                requisitionLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { requisitionDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return requisitionDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
