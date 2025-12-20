package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Order;

/**
 * DAO interface for Order entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface OrderDao extends CrudDao<Order, Integer, SQLBuilder.PSC, OrderDao> {

    /**
     * Find an order by document number
     */
    @Query("SELECT * FROM C_Order WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<Order> findByDocumentNo(String documentNo);

    /**
     * Find orders by business partner
     */
    @Query("SELECT * FROM C_Order WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findByBPartnerId(Integer bPartnerId);

    /**
     * Find orders by document status
     */
    @Query("SELECT * FROM C_Order WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findByDocStatus(String docStatus);

    /**
     * Find sales orders (IsSOTrx = Y)
     */
    @Query("SELECT * FROM C_Order WHERE IsSOTrx = 'Y' AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findAllSalesOrders();

    /**
     * Find purchase orders (IsSOTrx = N)
     */
    @Query("SELECT * FROM C_Order WHERE IsSOTrx = 'N' AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findAllPurchaseOrders();

    /**
     * Find orders by date range
     */
    @Query("SELECT * FROM C_Order WHERE DateOrdered BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Find draft orders
     */
    @Query("SELECT * FROM C_Order WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findAllDraft();

    /**
     * Find completed orders
     */
    @Query("SELECT * FROM C_Order WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findAllCompleted();

    /**
     * Find orders not yet delivered
     */
    @Query("SELECT * FROM C_Order WHERE IsDelivered = 'N' AND DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateOrdered")
    List<Order> findPendingDelivery();

    /**
     * Find orders not yet invoiced
     */
    @Query("SELECT * FROM C_Order WHERE IsInvoiced = 'N' AND DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateOrdered")
    List<Order> findPendingInvoice();

    /**
     * Find orders by warehouse
     */
    @Query("SELECT * FROM C_Order WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findByWarehouseId(Integer warehouseId);

    /**
     * Find orders by sales representative
     */
    @Query("SELECT * FROM C_Order WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findBySalesRepId(Integer salesRepId);

    /**
     * Find orders by document type
     */
    @Query("SELECT * FROM C_Order WHERE C_DocType_ID = :docTypeId AND IsActive = 'Y' ORDER BY DateOrdered DESC")
    List<Order> findByDocTypeId(Integer docTypeId);

    /**
     * Find all orders including inactive
     */
    @Query("SELECT * FROM C_Order ORDER BY DateOrdered DESC")
    List<Order> findAll();
}
