package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.UOMDao;
import org.idempiere.model.UOM;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for UOM (Unit of Measure) entity operations.
 */
@Service
@Transactional
public class UOMService {

    private final UOMDao uomDao;

    public UOMService(UOMDao uomDao) {
        this.uomDao = uomDao;
    }

    public Optional<UOM> findById(Integer id) {
        try { return Optional.ofNullable(uomDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<UOM> findAll() {
        return uomDao.findAll();
    }

    public Optional<UOM> findByX12DE355(String x12DE355) {
        return uomDao.findByX12DE355(x12DE355);
    }

    public Optional<UOM> findByName(String name) {
        return uomDao.findByName(name);
    }

    public List<UOM> findByClient(Integer clientId) {
        return uomDao.findByClient(clientId);
    }

    public UOM save(UOM uom) {
        try {
            if (uom.getCUomId() == null) {
                uomDao.insert(uom);
            } else {
                uomDao.update(uom);
            }
            return uom;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { uomDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return uomDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
