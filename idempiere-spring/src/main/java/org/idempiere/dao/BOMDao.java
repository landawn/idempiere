package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.BOM;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface BOMDao extends CrudDao<BOM, Integer, SQLBuilder.PSC, BOMDao> {

    @Query("SELECT * FROM M_BOM WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<BOM> findByProduct(Integer productId);

    @Query("SELECT * FROM M_BOM WHERE M_Product_ID = :productId AND BOMType = :bomType AND IsActive = 'Y'")
    Optional<BOM> findByProductAndType(Integer productId, String bomType);

    @Query("SELECT * FROM M_BOM WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<BOM> findByName(String name, Integer clientId);

    @Query("SELECT * FROM M_BOM WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<BOM> findByClient(Integer clientId);
}
