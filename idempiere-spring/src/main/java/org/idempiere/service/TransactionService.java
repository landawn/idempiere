package org.idempiere.service;

import java.time.LocalDateTime;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.TransactionDao;
import org.idempiere.model.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Inventory Transaction entity operations.
 */
@Service
@Transactional
public class TransactionService {

    private final TransactionDao transactionDao;

    public TransactionService(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    public Optional<Transaction> findById(Integer id) {
        try { return Optional.ofNullable(transactionDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Transaction> findAll() {
        return transactionDao.findAll();
    }

    public List<Transaction> findByProduct(Integer productId) {
        return transactionDao.findByProduct(productId);
    }

    public List<Transaction> findByLocator(Integer locatorId) {
        return transactionDao.findByLocator(locatorId);
    }

    public List<Transaction> findByMovementType(String movementType) {
        return transactionDao.findByMovementType(movementType);
    }

    public List<Transaction> findByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return transactionDao.findByDateRange(startDate, endDate);
    }

    public List<Transaction> findByInOutLine(Integer inOutLineId) {
        return transactionDao.findByInOutLine(inOutLineId);
    }

    public List<Transaction> findByInventoryLine(Integer inventoryLineId) {
        return transactionDao.findByInventoryLine(inventoryLineId);
    }

    public List<Transaction> findByMovementLine(Integer movementLineId) {
        return transactionDao.findByMovementLine(movementLineId);
    }

    public Transaction save(Transaction transaction) {
        try {
            if (transaction.getMTransactionId() == null) {
                transactionDao.insert(transaction);
            } else {
                transactionDao.update(transaction);
            }
            return transaction;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { transactionDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return transactionDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
