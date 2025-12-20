package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.InventoryLine;

/**
 * DAO interface for InventoryLine entity operations.
 */
public interface InventoryLineDao extends CrudDao<InventoryLine, Integer, SQLBuilder.PSC, InventoryLineDao> {

    @Query("SELECT * FROM M_InventoryLine WHERE M_Inventory_ID = :inventoryId ORDER BY Line")
    List<InventoryLine> findByInventory(Integer inventoryId);

    @Query("SELECT * FROM M_InventoryLine WHERE M_Product_ID = :productId AND M_Inventory_ID = :inventoryId")
    List<InventoryLine> findByProductAndInventory(Integer productId, Integer inventoryId);

    @Query("SELECT * FROM M_InventoryLine WHERE M_Locator_ID = :locatorId")
    List<InventoryLine> findByLocator(Integer locatorId);
}
