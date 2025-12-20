package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.InOutDao;
import org.idempiere.dao.InOutLineDao;
import org.idempiere.model.InOut;
import org.idempiere.model.InOutLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for InOut (Shipment/Receipt) entity operations.
 */
@Service
@Transactional
public class InOutService {

    private final InOutDao inOutDao;
    private final InOutLineDao inOutLineDao;

    public InOutService(InOutDao inOutDao, InOutLineDao inOutLineDao) {
        this.inOutDao = inOutDao;
        this.inOutLineDao = inOutLineDao;
    }

    public Optional<InOut> findById(Integer id) {
        try { return Optional.ofNullable(inOutDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<InOut> findAll() {
        return inOutDao.findAll();
    }

    public Optional<InOut> findByDocumentNo(String documentNo, Integer clientId) {
        return inOutDao.findByDocumentNo(documentNo, clientId);
    }

    public List<InOut> findByBPartner(Integer bpartnerId) {
        return inOutDao.findByBPartner(bpartnerId);
    }

    public List<InOutLine> findLinesByInOut(Integer inOutId) {
        return inOutLineDao.findByInOut(inOutId);
    }

    public InOut save(InOut inOut) {
        try {
            if (inOut.getMInOutId() == null) {
                inOutDao.insert(inOut);
            } else {
                inOutDao.update(inOut);
            }
            return inOut;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public InOutLine saveLine(InOutLine line) {
        try {
            if (line.getMInOutLineId() == null) {
                inOutLineDao.insert(line);
            } else {
                inOutLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { inOutDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return inOutDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
