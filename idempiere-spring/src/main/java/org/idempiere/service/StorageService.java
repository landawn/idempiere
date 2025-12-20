package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.StorageDao;
import org.idempiere.dao.StorageReservationDao;
import org.idempiere.dao.TransactionDao;
import org.idempiere.model.Storage;
import org.idempiere.model.StorageReservation;
import org.idempiere.model.Transaction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

/**
 * Service class for Storage entity operations.
 */
@Service
@Transactional
public class StorageService {

    private final StorageDao storageDao;
    private final StorageReservationDao storageReservationDao;
    private final TransactionDao transactionDao;

    public StorageService(StorageDao storageDao, StorageReservationDao storageReservationDao,
                          TransactionDao transactionDao) {
        this.storageDao = storageDao;
        this.storageReservationDao = storageReservationDao;
        this.transactionDao = transactionDao;
    }

    // Storage methods
    public Optional<Storage> findById(Integer id) {
        try { return Optional.ofNullable(storageDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Storage> findByProduct(Integer productId) {
        return storageDao.findByProduct(productId);
    }

    public List<Storage> findByLocator(Integer locatorId) {
        return storageDao.findByLocator(locatorId);
    }

    public Optional<Storage> findByProductLocatorASI(Integer productId, Integer locatorId, Integer asiId) {
        return storageDao.findByProductLocatorASI(productId, locatorId, asiId);
    }

    public List<Storage> findAvailableByProduct(Integer productId) {
        return storageDao.findAvailableByProduct(productId);
    }

    public Storage save(Storage storage) {
        try {
            if (storage.getMStorageId() == null) {
                storageDao.insert(storage);
            } else {
                storageDao.update(storage);
            }
            return storage;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // StorageReservation methods
    public Optional<StorageReservation> findReservationById(Integer id) {
        try { return Optional.ofNullable(storageReservationDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<StorageReservation> findReservationsByProduct(Integer productId) {
        return storageReservationDao.findByProduct(productId);
    }

    public List<StorageReservation> findReservationsByWarehouse(Integer warehouseId) {
        return storageReservationDao.findByWarehouse(warehouseId);
    }

    public Optional<StorageReservation> findReservation(Integer productId, Integer warehouseId, String isSOTrx) {
        return storageReservationDao.findByProductWarehouseSOTrx(productId, warehouseId, isSOTrx);
    }

    public StorageReservation saveReservation(StorageReservation reservation) {
        try {
            if (reservation.getMStorageReservationUU() == null) {
                storageReservationDao.insert(reservation);
            } else {
                storageReservationDao.update(reservation);
            }
            return reservation;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // Transaction methods
    public List<Transaction> findTransactionsByProduct(Integer productId) {
        return transactionDao.findByProduct(productId);
    }

    public List<Transaction> findTransactionsByLocator(Integer locatorId) {
        return transactionDao.findByLocator(locatorId);
    }

    public List<Transaction> findTransactionsByMovementType(String movementType) {
        return transactionDao.findByMovementType(movementType);
    }

    public List<Transaction> findTransactionsByDateRange(LocalDateTime startDate, LocalDateTime endDate) {
        return transactionDao.findByDateRange(startDate, endDate);
    }

    public Transaction saveTransaction(Transaction transaction) {
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
}
