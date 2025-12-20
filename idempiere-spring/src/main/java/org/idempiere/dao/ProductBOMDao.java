package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.ProductBOM;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ProductBOMDao extends CrudDao<ProductBOM, Integer, SQLBuilder.PSC, ProductBOMDao> {

    @Query("SELECT * FROM M_Product_BOM WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Line")
    List<ProductBOM> findByProduct(Integer productId);

    @Query("SELECT * FROM M_Product_BOM WHERE M_ProductBOM_ID = :bomProductId AND IsActive = 'Y'")
    List<ProductBOM> findByBOMProduct(Integer bomProductId);
}
