package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.MatchInvDao;
import org.idempiere.dao.MatchPODao;
import org.idempiere.model.MatchInv;
import org.idempiere.model.MatchPO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Matching (Invoice/PO) entity operations.
 */
@Service
@Transactional
public class MatchingService {

    private final MatchInvDao matchInvDao;
    private final MatchPODao matchPODao;

    public MatchingService(MatchInvDao matchInvDao, MatchPODao matchPODao) {
        this.matchInvDao = matchInvDao;
        this.matchPODao = matchPODao;
    }

    // Match Invoice methods
    public Optional<MatchInv> findMatchInvById(Integer id) {
        try { return Optional.ofNullable(matchInvDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<MatchInv> findAllMatchInv() {
        return matchInvDao.findAllActive();
    }

    public List<MatchInv> findMatchInvByInvoiceLine(Integer invoiceLineId) {
        return matchInvDao.findByInvoiceLine(invoiceLineId);
    }

    public List<MatchInv> findMatchInvByInOutLine(Integer inOutLineId) {
        return matchInvDao.findByInOutLine(inOutLineId);
    }

    public MatchInv saveMatchInv(MatchInv matchInv) {
        try {
            if (matchInv.getMMatchInvId() == null) {
                matchInvDao.insert(matchInv);
            } else {
                matchInvDao.update(matchInv);
            }
            return matchInv;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteMatchInv(Integer id) {
        try { matchInvDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    // Match PO methods
    public Optional<MatchPO> findMatchPOById(Integer id) {
        try { return Optional.ofNullable(matchPODao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<MatchPO> findAllMatchPO() {
        return matchPODao.findAllActive();
    }

    public List<MatchPO> findMatchPOByOrderLine(Integer orderLineId) {
        return matchPODao.findByOrderLine(orderLineId);
    }

    public List<MatchPO> findMatchPOByInOutLine(Integer inOutLineId) {
        return matchPODao.findByInOutLine(inOutLineId);
    }

    public MatchPO saveMatchPO(MatchPO matchPO) {
        try {
            if (matchPO.getMMatchPoId() == null) {
                matchPODao.insert(matchPO);
            } else {
                matchPODao.update(matchPO);
            }
            return matchPO;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteMatchPO(Integer id) {
        try { matchPODao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }
}
