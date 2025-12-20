package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.model.PPCostCollector;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

/**
 * DAO interface for PPCostCollector entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface PPCostCollectorDao extends CrudDao<PPCostCollector, Integer, SQLBuilder.PSC, PPCostCollectorDao> {

    /**
     * Find cost collector by document number
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<PPCostCollector> findByDocumentNo(String documentNo);

    /**
     * Find cost collectors by manufacturing order
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE PP_Order_ID = :ppOrderId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findByOrderId(Integer ppOrderId);

    /**
     * Find cost collectors by order line
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE PP_Order_BOMLine_ID = :bomLineId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findByBOMLineId(Integer bomLineId);

    /**
     * Find cost collectors by order node
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE PP_Order_Node_ID = :nodeId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findByNodeId(Integer nodeId);

    /**
     * Find cost collectors by product
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findByProductId(Integer productId);

    /**
     * Find cost collectors by warehouse
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findByWarehouseId(Integer warehouseId);

    /**
     * Find cost collectors by document status
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findByDocStatus(String docStatus);

    /**
     * Find cost collectors by collector type
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE CostCollectorType = :collectorType AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findByCollectorType(String collectorType);

    /**
     * Find cost collectors by movement type
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE MovementType = :movementType AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findByMovementType(String movementType);

    /**
     * Find cost collectors by date range
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE MovementDate BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY MovementDate DESC")
    List<PPCostCollector> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Find subcontracting cost collectors
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE IsSubcontracting = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPCostCollector> findSubcontracting();

    /**
     * Find cost collector by ID
     */
    @Query("SELECT * FROM PP_Cost_Collector WHERE PP_Cost_Collector_ID = :id AND IsActive = 'Y'")
    Optional<PPCostCollector> findById(Integer id);
}
