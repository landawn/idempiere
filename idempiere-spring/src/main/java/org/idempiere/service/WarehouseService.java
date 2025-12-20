package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.LocatorDao;
import org.idempiere.dao.WarehouseDao;
import org.idempiere.model.Locator;
import org.idempiere.model.Warehouse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Warehouse entity operations.
 */
@Service
@Transactional
public class WarehouseService {

    private final WarehouseDao warehouseDao;
    private final LocatorDao locatorDao;

    public WarehouseService(WarehouseDao warehouseDao, LocatorDao locatorDao) {
        this.warehouseDao = warehouseDao;
        this.locatorDao = locatorDao;
    }

    public Optional<Warehouse> findById(Integer id) {
        try { return Optional.ofNullable(warehouseDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Warehouse> findAll() {
        return warehouseDao.findAll();
    }

    public List<Warehouse> findByOrg(Integer orgId) {
        return warehouseDao.findByOrg(orgId);
    }

    public Optional<Warehouse> findByValueAndOrg(String value, Integer orgId) {
        return warehouseDao.findByValueAndOrg(value, orgId);
    }

    public Warehouse save(Warehouse warehouse) {
        try {
            if (warehouse.getMWarehouseId() == null) {
                warehouseDao.insert(warehouse);
            } else {
                warehouseDao.update(warehouse);
            }
            return warehouse;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { warehouseDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return warehouseDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }

    public Optional<Warehouse> findDefault(Integer orgId) {
        List<Warehouse> warehouses = warehouseDao.findByOrg(orgId);
        return warehouses.stream().findFirst();
    }

    // Locator methods
    public List<Locator> findLocatorsByWarehouse(Integer warehouseId) {
        return locatorDao.findByWarehouse(warehouseId);
    }

    public Optional<Locator> findDefaultLocator(Integer warehouseId) {
        return locatorDao.findDefaultByWarehouse(warehouseId);
    }

    public Locator saveLocator(Locator locator) {
        try {
            if (locator.getMLocatorId() == null) {
                locatorDao.insert(locator);
            } else {
                locatorDao.update(locator);
            }
            return locator;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }
}
