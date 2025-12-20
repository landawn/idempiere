package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Replenish;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface ReplenishDao extends CrudDao<Replenish, Integer, SQLBuilder.PSC, ReplenishDao> {

    @Query("SELECT * FROM M_Replenish WHERE IsActive = 'Y'")
    List<Replenish> findAllActive();

    @Query("SELECT * FROM M_Replenish WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<Replenish> findByProduct(Integer productId);

    @Query("SELECT * FROM M_Replenish WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y'")
    List<Replenish> findByWarehouse(Integer warehouseId);

    @Query("SELECT * FROM M_Replenish WHERE M_Product_ID = :productId AND M_Warehouse_ID = :warehouseId AND IsActive = 'Y'")
    Optional<Replenish> findByProductAndWarehouse(Integer productId, Integer warehouseId);

    @Query("SELECT * FROM M_Replenish WHERE ReplenishType = :replenishType AND IsActive = 'Y'")
    List<Replenish> findByReplenishType(String replenishType);
}
