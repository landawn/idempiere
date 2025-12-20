package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.RMADao;
import org.idempiere.dao.RMALineDao;
import org.idempiere.model.RMA;
import org.idempiere.model.RMALine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for RMA (Return Material Authorization) entity operations.
 */
@Service
@Transactional
public class RMAService {

    private final RMADao rmaDao;
    private final RMALineDao rmaLineDao;

    public RMAService(RMADao rmaDao, RMALineDao rmaLineDao) {
        this.rmaDao = rmaDao;
        this.rmaLineDao = rmaLineDao;
    }

    public Optional<RMA> findById(Integer id) {
        try { return Optional.ofNullable(rmaDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<RMA> findAll() {
        return rmaDao.findAllActive();
    }

    public Optional<RMA> findByDocumentNo(String documentNo, Integer clientId) {
        return rmaDao.findByDocumentNo(documentNo, clientId);
    }

    public List<RMA> findByBPartner(Integer bpartnerId, String isSOTrx) {
        return rmaDao.findByBPartner(bpartnerId, isSOTrx);
    }

    public List<RMA> findByDocStatus(String docStatus, Integer clientId) {
        return rmaDao.findByDocStatus(docStatus, clientId);
    }

    public List<RMALine> findLinesByRMA(Integer rmaId) {
        return rmaLineDao.findByRMA(rmaId);
    }

    public RMA save(RMA rma) {
        try {
            if (rma.getMRmaId() == null) {
                rmaDao.insert(rma);
            } else {
                rmaDao.update(rma);
            }
            return rma;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public RMALine saveLine(RMALine line) {
        try {
            if (line.getMRmaLineId() == null) {
                rmaLineDao.insert(line);
            } else {
                rmaLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { rmaDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return rmaDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
