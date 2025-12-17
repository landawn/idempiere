package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.OrderLine;

/**
 * DAO interface for OrderLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface OrderLineDao extends CrudDao<OrderLine, Integer, SQLBuilder.NSC, OrderLineDao> {

    /**
     * Find all order lines for an order
     */
    @Select("SELECT * FROM C_OrderLine WHERE C_Order_ID = :orderId AND IsActive = 'Y' ORDER BY Line")
    List<OrderLine> findByOrderId(Integer orderId);

    /**
     * Find order lines by product
     */
    @Select("SELECT * FROM C_OrderLine WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<OrderLine> findByProductId(Integer productId);

    /**
     * Find order lines not yet delivered
     */
    @Select("SELECT * FROM C_OrderLine WHERE C_Order_ID = :orderId AND QtyDelivered < QtyOrdered AND IsActive = 'Y' ORDER BY Line")
    List<OrderLine> findPendingDeliveryByOrderId(Integer orderId);

    /**
     * Find order lines not yet invoiced
     */
    @Select("SELECT * FROM C_OrderLine WHERE C_Order_ID = :orderId AND QtyInvoiced < QtyOrdered AND IsActive = 'Y' ORDER BY Line")
    List<OrderLine> findPendingInvoiceByOrderId(Integer orderId);

    /**
     * Find description lines for an order
     */
    @Select("SELECT * FROM C_OrderLine WHERE C_Order_ID = :orderId AND IsDescription = 'Y' AND IsActive = 'Y' ORDER BY Line")
    List<OrderLine> findDescriptionLinesByOrderId(Integer orderId);

    /**
     * Find order lines by charge
     */
    @Select("SELECT * FROM C_OrderLine WHERE C_Charge_ID = :chargeId AND IsActive = 'Y' ORDER BY Created DESC")
    List<OrderLine> findByChargeId(Integer chargeId);

    /**
     * Find order lines by project
     */
    @Select("SELECT * FROM C_OrderLine WHERE C_Project_ID = :projectId AND IsActive = 'Y' ORDER BY Created DESC")
    List<OrderLine> findByProjectId(Integer projectId);
}
