package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.DiscountSchemaDao;
import org.idempiere.model.DiscountSchema;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for DiscountSchema entity operations.
 */
@Service
@Transactional
public class DiscountSchemaService {

    private final DiscountSchemaDao discountSchemaDao;

    public DiscountSchemaService(DiscountSchemaDao discountSchemaDao) {
        this.discountSchemaDao = discountSchemaDao;
    }

    public Optional<DiscountSchema> findById(Integer id) {
        try { return Optional.ofNullable(discountSchemaDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<DiscountSchema> findAll() {
        return discountSchemaDao.findAll();
    }

    public List<DiscountSchema> findByClient(Integer clientId) {
        return discountSchemaDao.findByClient(clientId);
    }

    public List<DiscountSchema> findByDiscountType(String discountType, Integer clientId) {
        return discountSchemaDao.findByDiscountType(discountType, clientId);
    }

    public DiscountSchema save(DiscountSchema discountSchema) {
        try {
            if (discountSchema.getMDiscountSchemaId() == null) {
                discountSchemaDao.insert(discountSchema);
            } else {
                discountSchemaDao.update(discountSchema);
            }
            return discountSchema;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { discountSchemaDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return discountSchemaDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
