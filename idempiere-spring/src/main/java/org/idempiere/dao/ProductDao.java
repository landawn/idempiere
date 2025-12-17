package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Product;

/**
 * DAO interface for Product entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface ProductDao extends CrudDao<Product, Integer, SQLBuilder.NSC, ProductDao> {

    /**
     * Find a product by its value (search key)
     */
    @Select("SELECT * FROM M_Product WHERE Value = :value AND IsActive = 'Y'")
    Optional<Product> findByValue(String value);

    /**
     * Find a product by name
     */
    @Select("SELECT * FROM M_Product WHERE Name = :name AND IsActive = 'Y'")
    Optional<Product> findByName(String name);

    /**
     * Find a product by UPC/barcode
     */
    @Select("SELECT * FROM M_Product WHERE UPC = :upc AND IsActive = 'Y'")
    Optional<Product> findByUpc(String upc);

    /**
     * Find a product by SKU
     */
    @Select("SELECT * FROM M_Product WHERE SKU = :sku AND IsActive = 'Y'")
    Optional<Product> findBySku(String sku);

    /**
     * Find products by category
     */
    @Select("SELECT * FROM M_Product WHERE M_Product_Category_ID = :categoryId AND IsActive = 'Y' ORDER BY Name")
    List<Product> findByCategoryId(Integer categoryId);

    /**
     * Find all products that can be sold
     */
    @Select("SELECT * FROM M_Product WHERE IsSold = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllSellable();

    /**
     * Find all products that can be purchased
     */
    @Select("SELECT * FROM M_Product WHERE IsPurchased = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllPurchasable();

    /**
     * Find all stocked products
     */
    @Select("SELECT * FROM M_Product WHERE IsStocked = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllStocked();

    /**
     * Search products by name pattern
     */
    @Select("SELECT * FROM M_Product WHERE UPPER(Name) LIKE UPPER(:namePattern) AND IsActive = 'Y' ORDER BY Name")
    List<Product> searchByName(String namePattern);

    /**
     * Find products by product type (I=Item, S=Service, R=Resource, E=Expense)
     */
    @Select("SELECT * FROM M_Product WHERE ProductType = :productType AND IsActive = 'Y' ORDER BY Name")
    List<Product> findByProductType(String productType);

    /**
     * Find all items (not services)
     */
    @Select("SELECT * FROM M_Product WHERE ProductType = 'I' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllItems();

    /**
     * Find all services
     */
    @Select("SELECT * FROM M_Product WHERE ProductType = 'S' AND IsActive = 'Y' ORDER BY Name")
    List<Product> findAllServices();
}
