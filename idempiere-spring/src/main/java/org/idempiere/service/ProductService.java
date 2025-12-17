package org.idempiere.service;

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
        return productDao.findById(id);
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Optional<Product> findByValue(String value) {
        return productDao.findByValue(value);
    }

    public List<Product> findByName(String name) {
        return productDao.findByName(name);
    }

    public List<Product> findByProductCategoryId(Integer productCategoryId) {
        return productDao.findByProductCategoryId(productCategoryId);
    }

    public List<Product> findAllStocked() {
        return productDao.findAllStocked();
    }

    public List<Product> findAllPurchased() {
        return productDao.findAllPurchased();
    }

    public List<Product> findAllSold() {
        return productDao.findAllSold();
    }

    public List<Product> findByProductType(String productType) {
        return productDao.findByProductType(productType);
    }

    public List<Product> findAllActive() {
        return productDao.findAllActive();
    }

    public Product save(Product product) {
        if (product.getMProductId() == null) {
            productDao.insert(product);
        } else {
            productDao.update(product);
        }
        return product;
    }

    public void delete(Integer id) {
        productDao.deleteById(id);
    }

    public boolean exists(Integer id) {
        return productDao.exists(id);
    }
}
