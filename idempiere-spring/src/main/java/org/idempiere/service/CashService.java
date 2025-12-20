package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.CashDao;
import org.idempiere.dao.CashLineDao;
import org.idempiere.dao.CashBookDao;
import org.idempiere.model.Cash;
import org.idempiere.model.CashLine;
import org.idempiere.model.CashBook;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Cash entity operations.
 */
@Service
@Transactional
public class CashService {

    private final CashDao cashDao;
    private final CashLineDao cashLineDao;
    private final CashBookDao cashBookDao;

    public CashService(CashDao cashDao, CashLineDao cashLineDao, CashBookDao cashBookDao) {
        this.cashDao = cashDao;
        this.cashLineDao = cashLineDao;
        this.cashBookDao = cashBookDao;
    }

    public Optional<Cash> findById(Integer id) {
        try {
            return Optional.ofNullable(cashDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Cash> findAll() {
        return cashDao.findAllActive();
    }

    public Optional<Cash> findByDocumentNo(String documentNo, Integer clientId) {
        return cashDao.findByDocumentNo(documentNo, clientId);
    }

    public List<Cash> findByCashBook(Integer cashBookId) {
        return cashDao.findByCashBook(cashBookId);
    }

    public List<Cash> findByDocStatus(String docStatus, Integer clientId) {
        return cashDao.findByDocStatus(docStatus, clientId);
    }

    public List<CashLine> findLinesByCash(Integer cashId) {
        return cashLineDao.findByCash(cashId);
    }

    public List<CashBook> findCashBooksByOrg(Integer orgId) {
        return cashBookDao.findByOrg(orgId);
    }

    public Optional<CashBook> findDefaultCashBook(Integer orgId) {
        return cashBookDao.findDefaultByOrg(orgId);
    }

    public Cash save(Cash cash) {
        try {
            if (cash.getCCashId() == null) {
                cashDao.insert(cash);
            } else {
                cashDao.update(cash);
            }
            return cash;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public CashLine saveLine(CashLine line) {
        try {
            if (line.getCCashLineId() == null) {
                cashLineDao.insert(line);
            } else {
                cashLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id) {
        try {
            cashDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return cashDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
