package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PPProductPlanning;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

/**
 * DAO interface for PPProductPlanning entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface PPProductPlanningDao extends CrudDao<PPProductPlanning, Integer, SQLBuilder.PSC, PPProductPlanningDao> {

    /**
     * Find product planning by product and warehouse
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE M_Product_ID = :productId AND M_Warehouse_ID = :warehouseId AND IsActive = 'Y'")
    Optional<PPProductPlanning> findByProductAndWarehouse(Integer productId, Integer warehouseId);

    /**
     * Find product planning by product
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findByProductId(Integer productId);

    /**
     * Find product planning by warehouse
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findByWarehouseId(Integer warehouseId);

    /**
     * Find product planning by resource
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE S_Resource_ID = :resourceId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findByResourceId(Integer resourceId);

    /**
     * Find product planning requiring MRP
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE IsRequiredMRP = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findRequiringMRP();

    /**
     * Find product planning requiring DRP
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE IsRequiredDRP = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findRequiringDRP();

    /**
     * Find product planning with create plan flag
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE IsCreatePlan = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findWithCreatePlan();

    /**
     * Find phantom products
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE IsPhantom = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findPhantomProducts();

    /**
     * Find MPS items
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE IsMPS = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findMPSItems();

    /**
     * Find product planning by order policy
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE Order_Policy = :orderPolicy AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findByOrderPolicy(String orderPolicy);

    /**
     * Find product planning by planner
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE Planner_ID = :plannerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPProductPlanning> findByPlannerId(Integer plannerId);

    /**
     * Find product planning by ID
     */
    @Query("SELECT * FROM PP_Product_Planning WHERE PP_Product_Planning_ID = :id AND IsActive = 'Y'")
    Optional<PPProductPlanning> findById(Integer id);
}
