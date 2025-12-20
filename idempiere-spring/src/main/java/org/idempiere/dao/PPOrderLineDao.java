package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PPOrderLine;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

/**
 * DAO interface for PPOrderLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface PPOrderLineDao extends CrudDao<PPOrderLine, Integer, SQLBuilder.PSC, PPOrderLineDao> {

    /**
     * Find all lines for a manufacturing order
     */
    @Query("SELECT * FROM PP_Order_BOMLine WHERE PP_Order_ID = :ppOrderId AND IsActive = 'Y' ORDER BY Line")
    List<PPOrderLine> findByOrderId(Integer ppOrderId);

    /**
     * Find lines by product
     */
    @Query("SELECT * FROM PP_Order_BOMLine WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderLine> findByProductId(Integer productId);

    /**
     * Find critical component lines
     */
    @Query("SELECT * FROM PP_Order_BOMLine WHERE IsCritical = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderLine> findCriticalLines();

    /**
     * Find lines not yet delivered
     */
    @Query("SELECT * FROM PP_Order_BOMLine WHERE PP_Order_ID = :ppOrderId AND QtyDelivered < QtyRequired AND IsActive = 'Y' ORDER BY Line")
    List<PPOrderLine> findPendingDeliveryByOrderId(Integer ppOrderId);

    /**
     * Find lines by component type
     */
    @Query("SELECT * FROM PP_Order_BOMLine WHERE ComponentType = :componentType AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderLine> findByComponentType(String componentType);

    /**
     * Find lines by warehouse
     */
    @Query("SELECT * FROM PP_Order_BOMLine WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderLine> findByWarehouseId(Integer warehouseId);

    /**
     * Find line by ID
     */
    @Query("SELECT * FROM PP_Order_BOMLine WHERE PP_Order_BOMLine_ID = :id AND IsActive = 'Y'")
    Optional<PPOrderLine> findById(Integer id);
}
