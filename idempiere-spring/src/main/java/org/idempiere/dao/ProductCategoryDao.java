package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.ProductCategory;

/**
 * DAO interface for ProductCategory entity operations.
 */
public interface ProductCategoryDao extends CrudDao<ProductCategory, Integer, SQLBuilder.PSC, ProductCategoryDao> {

    @Query("SELECT * FROM M_Product_Category WHERE IsActive = 'Y' ORDER BY Name")
    List<ProductCategory> findAllActive();

    @Query("SELECT * FROM M_Product_Category WHERE Value = :value AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<ProductCategory> findByValueAndClient(String value, Integer clientId);

    @Query("SELECT * FROM M_Product_Category WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<ProductCategory> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM M_Product_Category WHERE IsDefault = 'Y' AND AD_Client_ID = :clientId")
    Optional<ProductCategory> findDefault(Integer clientId);

    @Query("SELECT * FROM M_Product_Category WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<ProductCategory> findByClient(Integer clientId);

    @Query("SELECT * FROM M_Product_Category WHERE IsSelfService = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<ProductCategory> findSelfService();
}
