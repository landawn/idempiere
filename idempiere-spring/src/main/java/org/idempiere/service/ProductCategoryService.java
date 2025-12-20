package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ProductCategoryDao;
import org.idempiere.model.ProductCategory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for ProductCategory entity operations.
 */
@Service
@Transactional
public class ProductCategoryService {

    private final ProductCategoryDao productCategoryDao;

    public ProductCategoryService(ProductCategoryDao productCategoryDao) {
        this.productCategoryDao = productCategoryDao;
    }

    public Optional<ProductCategory> findById(Integer id) {
        try { return Optional.ofNullable(productCategoryDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<ProductCategory> findAll() {
        return productCategoryDao.findAllActive();
    }

    public List<ProductCategory> findByClient(Integer clientId) {
        return productCategoryDao.findByClient(clientId);
    }

    public Optional<ProductCategory> findByValue(String value, Integer clientId) {
        return productCategoryDao.findByValueAndClient(value, clientId);
    }

    public Optional<ProductCategory> findDefault(Integer clientId) {
        return productCategoryDao.findDefault(clientId);
    }

    public ProductCategory save(ProductCategory productCategory) {
        try {
            if (productCategory.getMProductCategoryId() == null) {
                productCategoryDao.insert(productCategory);
            } else {
                productCategoryDao.update(productCategory);
            }
            return productCategory;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { productCategoryDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return productCategoryDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
