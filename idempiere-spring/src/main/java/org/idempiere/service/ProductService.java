package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ProductDao;
import org.idempiere.model.Product;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Product entity operations.
 */
@Service
@Transactional
public class ProductService {

    private final ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }

    public Optional<Product> findById(Integer id) {
        try { return Optional.ofNullable(productDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Optional<Product> findByValue(String value) {
        return productDao.findByValue(value);
    }

    public Optional<Product> findByName(String name) {
        return productDao.findByName(name);
    }

    public List<Product> findByProductCategoryId(Integer productCategoryId) {
        return productDao.findByCategoryId(productCategoryId);
    }

    public List<Product> findAllStocked() {
        return productDao.findAllStocked();
    }

    public List<Product> findAllPurchased() {
        return productDao.findAllPurchasable();
    }

    public List<Product> findAllSold() {
        return productDao.findAllSellable();
    }

    public List<Product> findByProductType(String productType) {
        return productDao.findByProductType(productType);
    }

    public List<Product> findAllActive() {
        return productDao.findAllActive();
    }

    public Product save(Product product) {
        try {
            if (product.getMProductId() == null) {
                productDao.insert(product);
            } else {
                productDao.update(product);
            }
            return product;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { productDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return productDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
