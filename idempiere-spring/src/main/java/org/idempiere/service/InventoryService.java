package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.InventoryDao;
import org.idempiere.dao.InventoryLineDao;
import org.idempiere.model.Inventory;
import org.idempiere.model.InventoryLine;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Inventory entity operations.
 */
@Service
@Transactional
public class InventoryService {

    private final InventoryDao inventoryDao;
    private final InventoryLineDao inventoryLineDao;

    public InventoryService(InventoryDao inventoryDao, InventoryLineDao inventoryLineDao) {
        this.inventoryDao = inventoryDao;
        this.inventoryLineDao = inventoryLineDao;
    }

    public Optional<Inventory> findById(Integer id) {
        try { return Optional.ofNullable(inventoryDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Inventory> findAll() {
        return inventoryDao.findAll();
    }

    public Optional<Inventory> findByDocumentNo(String documentNo, Integer clientId) {
        return inventoryDao.findByDocumentNo(documentNo, clientId);
    }

    public List<Inventory> findByWarehouseAndStatus(Integer warehouseId, String docStatus) {
        return inventoryDao.findByWarehouseAndStatus(warehouseId, docStatus);
    }

    public List<InventoryLine> findLinesByInventory(Integer inventoryId) {
        return inventoryLineDao.findByInventory(inventoryId);
    }

    public Inventory save(Inventory inventory) {
        try {
            if (inventory.getMInventoryId() == null) {
                inventoryDao.insert(inventory);
            } else {
                inventoryDao.update(inventory);
            }
            return inventory;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public InventoryLine saveLine(InventoryLine line) {
        try {
            if (line.getMInventoryLineId() == null) {
                inventoryLineDao.insert(line);
            } else {
                inventoryLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { inventoryDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return inventoryDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
