package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.TaxDao;
import org.idempiere.dao.TaxCategoryDao;
import org.idempiere.model.Tax;
import org.idempiere.model.TaxCategory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Tax entity operations.
 */
@Service
@Transactional
public class TaxService {

    private final TaxDao taxDao;
    private final TaxCategoryDao taxCategoryDao;

    public TaxService(TaxDao taxDao, TaxCategoryDao taxCategoryDao) {
        this.taxDao = taxDao;
        this.taxCategoryDao = taxCategoryDao;
    }

    public Optional<Tax> findById(Integer id) {
        try { return Optional.ofNullable(taxDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Tax> findAll() {
        return taxDao.findAllActive();
    }

    public List<Tax> findByClient(Integer clientId) {
        return taxDao.findByClient(clientId);
    }

    public List<Tax> findByTaxCategory(Integer taxCategoryId) {
        return taxDao.findByTaxCategory(taxCategoryId);
    }

    public Optional<Tax> findDefault(Integer clientId) {
        return taxDao.findDefault(clientId);
    }

    public List<Tax> findBySOPO(String isSOTax, Integer clientId) {
        return taxDao.findBySOPO(isSOTax, clientId);
    }

    public Optional<TaxCategory> findTaxCategoryById(Integer id) {
        try { return Optional.ofNullable(taxCategoryDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<TaxCategory> findAllTaxCategories() {
        return taxCategoryDao.findAllActive();
    }

    public List<TaxCategory> findTaxCategoriesByClient(Integer clientId) {
        return taxCategoryDao.findByClient(clientId);
    }

    public Tax save(Tax tax) {
        try {
            if (tax.getCTaxId() == null) {
                taxDao.insert(tax);
            } else {
                taxDao.update(tax);
            }
            return tax;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public TaxCategory saveTaxCategory(TaxCategory taxCategory) {
        try {
            if (taxCategory.getCTaxCategoryId() == null) {
                taxCategoryDao.insert(taxCategory);
            } else {
                taxCategoryDao.update(taxCategory);
            }
            return taxCategory;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { taxDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return taxDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
