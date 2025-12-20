package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.InOutConfirmDao;
import org.idempiere.dao.InOutLineConfirmDao;
import org.idempiere.model.InOutConfirm;
import org.idempiere.model.InOutLineConfirm;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for InOut Confirmation entity operations.
 */
@Service
@Transactional
public class InOutConfirmService {

    private final InOutConfirmDao inOutConfirmDao;
    private final InOutLineConfirmDao inOutLineConfirmDao;

    public InOutConfirmService(InOutConfirmDao inOutConfirmDao, InOutLineConfirmDao inOutLineConfirmDao) {
        this.inOutConfirmDao = inOutConfirmDao;
        this.inOutLineConfirmDao = inOutLineConfirmDao;
    }

    // InOutConfirm methods
    public Optional<InOutConfirm> findById(Integer id) {
        try { return Optional.ofNullable(inOutConfirmDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<InOutConfirm> findAll() {
        return inOutConfirmDao.findAll();
    }

    public List<InOutConfirm> findByInOut(Integer inOutId) {
        return inOutConfirmDao.findByInOut(inOutId);
    }

    public List<InOutConfirm> findByDocStatus(String docStatus, Integer clientId) {
        return inOutConfirmDao.findByDocStatus(docStatus, clientId);
    }

    public Optional<InOutConfirm> findByDocumentNo(String documentNo, Integer clientId) {
        return inOutConfirmDao.findByDocumentNo(documentNo, clientId);
    }

    public InOutConfirm save(InOutConfirm confirm) {
        try {
            if (confirm.getMInOutConfirmId() == null) {
                inOutConfirmDao.insert(confirm);
            } else {
                inOutConfirmDao.update(confirm);
            }
            return confirm;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // InOutLineConfirm methods
    public List<InOutLineConfirm> findLinesByConfirm(Integer confirmId) {
        return inOutLineConfirmDao.findByConfirm(confirmId);
    }

    public List<InOutLineConfirm> findLinesByInOutLine(Integer inOutLineId) {
        return inOutLineConfirmDao.findByInOutLine(inOutLineId);
    }

    public InOutLineConfirm saveLine(InOutLineConfirm line) {
        try {
            if (line.getMInOutLineConfirmId() == null) {
                inOutLineConfirmDao.insert(line);
            } else {
                inOutLineConfirmDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { inOutConfirmDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return inOutConfirmDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
