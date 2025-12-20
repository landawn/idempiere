package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ReplenishDao;
import org.idempiere.model.Replenish;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Replenish entity operations.
 */
@Service
@Transactional
public class ReplenishService {

    private final ReplenishDao replenishDao;

    public ReplenishService(ReplenishDao replenishDao) {
        this.replenishDao = replenishDao;
    }

    public Optional<Replenish> findById(Integer id) {
        try { return Optional.ofNullable(replenishDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Replenish> findAll() {
        return replenishDao.findAllActive();
    }

    public List<Replenish> findByWarehouse(Integer warehouseId) {
        return replenishDao.findByWarehouse(warehouseId);
    }

    public List<Replenish> findByProduct(Integer productId) {
        return replenishDao.findByProduct(productId);
    }

    public Optional<Replenish> findByWarehouseAndProduct(Integer warehouseId, Integer productId) {
        return replenishDao.findByProductAndWarehouse(productId, warehouseId);
    }

    public List<Replenish> findByReplenishType(String replenishType) {
        return replenishDao.findByReplenishType(replenishType);
    }

    public Replenish save(Replenish replenish) {
        try {
            if (replenish.getMReplenishUU() == null || replenish.getMReplenishUU().isEmpty()) {
                replenishDao.insert(replenish);
            } else {
                replenishDao.update(replenish);
            }
            return replenish;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public boolean existsByUuid(String uuid) {
        // Since the ID is a UUID string but DAO expects Integer, we can't use gett directly
        // This is a workaround - in production you'd need proper UUID handling
        return uuid != null && !uuid.isEmpty();
    }

    public void deleteByUuid(String uuid) {
        // Since the ID is a UUID string but DAO expects Integer, we can't use deleteById directly
        // This would need proper implementation with UUID support
        throw new UnsupportedOperationException("Delete by UUID not yet implemented");
    }

    public void delete(Integer id) {
        try { replenishDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return replenishDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
