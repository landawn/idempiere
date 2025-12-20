package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Product;

/**
 * DAO interface for Product entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface ProductDao extends CrudDao<Product, Integer, SQLBuilder.PSC, ProductDao> {

    /**
     * Find a product by its value (search key)
     */
    @Query("SELECT * FROM M_Product WHERE Value = :value AND IsActive = 'Y'")
    Optional<Product> findByValue(String value);

    /**
     * Find a product by name
     */
    @Query("SELECT * FROM M_Product WHERE Name = :name AND IsActive = 'Y'")
    Optional<Product> findByName(String name);

    /**
     * Find a product by UPC/barcode
     */
    @Query("SELECT * FROM M_Product WHERE UPC = :upc AND IsActive = 'Y'")
    Optional<Product> findByUpc(String upc);

    /**
     * Find a product by SKU
     */
    @Query("SELECT * FROM M_Product WHERE SKU = :sku AND IsActive = 'Y'")
    Optional<Product> findBySku(String sku);

    /**
     * Find products by category
     */
    @Query("SELECT * FROM M_Product WHERE M_Product_Category_ID = :categoryId AND IsActive = 'Y' ORDER BY Name")
    List<Product> findByCategoryId(Integer categoryId);

    /**
     * Find all products that can be sold
     */
    @Query("SELECT * FROM M_Product WHERE IsSold = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllSellable();

    /**
     * Find all products that can be purchased
     */
    @Query("SELECT * FROM M_Product WHERE IsPurchased = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllPurchasable();

    /**
     * Find all stocked products
     */
    @Query("SELECT * FROM M_Product WHERE IsStocked = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllStocked();

    /**
     * Search products by name pattern
     */
    @Query("SELECT * FROM M_Product WHERE UPPER(Name) LIKE UPPER(:namePattern) AND IsActive = 'Y' ORDER BY Name")
    List<Product> searchByName(String namePattern);

    /**
     * Find products by product type (I=Item, S=Service, R=Resource, E=Expense)
     */
    @Query("SELECT * FROM M_Product WHERE ProductType = :productType AND IsActive = 'Y' ORDER BY Name")
    List<Product> findByProductType(String productType);

    /**
     * Find all items (not services)
     */
    @Query("SELECT * FROM M_Product WHERE ProductType = 'I' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllItems();

    /**
     * Find all services
     */
    @Query("SELECT * FROM M_Product WHERE ProductType = 'S' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllServices();

    /**
     * Find all active products
     */
    @Query("SELECT * FROM M_Product WHERE IsActive = 'Y' ORDER BY Name")
    List<Product> findAllActive();

    /**
     * Find all products including inactive
     */
    @Query("SELECT * FROM M_Product ORDER BY Name")
    List<Product> findAll();
}
