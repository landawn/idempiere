package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.LotDao;
import org.idempiere.dao.LotCtlDao;
import org.idempiere.dao.SerNoCtlDao;
import org.idempiere.model.Lot;
import org.idempiere.model.LotCtl;
import org.idempiere.model.SerNoCtl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Lot and Serial Number Control entity operations.
 */
@Service
@Transactional
public class LotService {

    private final LotDao lotDao;
    private final LotCtlDao lotCtlDao;
    private final SerNoCtlDao serNoCtlDao;

    public LotService(LotDao lotDao, LotCtlDao lotCtlDao, SerNoCtlDao serNoCtlDao) {
        this.lotDao = lotDao;
        this.lotCtlDao = lotCtlDao;
        this.serNoCtlDao = serNoCtlDao;
    }

    // Lot methods
    public Optional<Lot> findLotById(Integer id) {
        try { return Optional.ofNullable(lotDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Lot> findLotsByProduct(Integer productId) {
        return lotDao.findByProduct(productId);
    }

    public Optional<Lot> findLotByName(String name, Integer productId) {
        return lotDao.findByName(name, productId);
    }

    public List<Lot> findLotsByClient(Integer clientId) {
        return lotDao.findByClient(clientId);
    }

    public Lot saveLot(Lot lot) {
        try {
            if (lot.getMLotId() == null) {
                lotDao.insert(lot);
            } else {
                lotDao.update(lot);
            }
            return lot;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // LotCtl methods
    public Optional<LotCtl> findLotCtlById(Integer id) {
        try { return Optional.ofNullable(lotCtlDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<LotCtl> findLotCtlsByClient(Integer clientId) {
        return lotCtlDao.findByClient(clientId);
    }

    public Optional<LotCtl> findLotCtlByName(String name, Integer clientId) {
        return lotCtlDao.findByName(name, clientId);
    }

    public LotCtl saveLotCtl(LotCtl lotCtl) {
        try {
            if (lotCtl.getMLotCtlId() == null) {
                lotCtlDao.insert(lotCtl);
            } else {
                lotCtlDao.update(lotCtl);
            }
            return lotCtl;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // SerNoCtl methods
    public Optional<SerNoCtl> findSerNoCtlById(Integer id) {
        try { return Optional.ofNullable(serNoCtlDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<SerNoCtl> findSerNoCtlsByClient(Integer clientId) {
        return serNoCtlDao.findByClient(clientId);
    }

    public Optional<SerNoCtl> findSerNoCtlByName(String name, Integer clientId) {
        return serNoCtlDao.findByName(name, clientId);
    }

    public SerNoCtl saveSerNoCtl(SerNoCtl serNoCtl) {
        try {
            if (serNoCtl.getMSerNoCtlId() == null) {
                serNoCtlDao.insert(serNoCtl);
            } else {
                serNoCtlDao.update(serNoCtl);
            }
            return serNoCtl;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteLot(Integer id) {
        try { lotDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public void deleteLotCtl(Integer id) {
        try { lotCtlDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public void deleteSerNoCtl(Integer id) {
        try { serNoCtlDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }
}
