package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Inventory;

/**
 * DAO interface for Inventory entity operations.
 */
public interface InventoryDao extends CrudDao<Inventory, Integer, SQLBuilder.PSC, InventoryDao> {

    @Query("SELECT * FROM M_Inventory WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<Inventory> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM M_Inventory WHERE M_Warehouse_ID = :warehouseId AND DocStatus = :docStatus ORDER BY MovementDate DESC")
    List<Inventory> findByWarehouseAndStatus(Integer warehouseId, String docStatus);

    @Query("SELECT * FROM M_Inventory WHERE DocStatus IN ('CO', 'CL') AND AD_Client_ID = :clientId ORDER BY MovementDate DESC")
    List<Inventory> findCompletedByClient(Integer clientId);

    @Query("SELECT * FROM M_Inventory WHERE IsActive = 'Y' ORDER BY MovementDate DESC")
    List<Inventory> findAll();
}
