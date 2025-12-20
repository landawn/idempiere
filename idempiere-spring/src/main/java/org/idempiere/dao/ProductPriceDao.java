package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.ProductPrice;

/**
 * DAO interface for ProductPrice entity operations.
 */
public interface ProductPriceDao extends CrudDao<ProductPrice, Integer, SQLBuilder.PSC, ProductPriceDao> {

    @Query("SELECT * FROM M_ProductPrice WHERE M_Product_ID = :productId AND M_PriceList_Version_ID = :priceListVersionId AND IsActive = 'Y'")
    Optional<ProductPrice> findByProductAndVersion(Integer productId, Integer priceListVersionId);

    @Query("SELECT * FROM M_ProductPrice WHERE M_PriceList_Version_ID = :priceListVersionId AND IsActive = 'Y'")
    List<ProductPrice> findByPriceListVersion(Integer priceListVersionId);

    @Query("SELECT * FROM M_ProductPrice WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<ProductPrice> findByProduct(Integer productId);
}
