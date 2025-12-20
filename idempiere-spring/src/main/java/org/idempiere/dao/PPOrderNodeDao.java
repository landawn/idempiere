package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PPOrderNode;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

/**
 * DAO interface for PPOrderNode entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface PPOrderNodeDao extends CrudDao<PPOrderNode, Integer, SQLBuilder.PSC, PPOrderNodeDao> {

    /**
     * Find all nodes for a manufacturing order
     */
    @Query("SELECT * FROM PP_Order_Node WHERE PP_Order_ID = :ppOrderId AND IsActive = 'Y' ORDER BY Priority")
    List<PPOrderNode> findByOrderId(Integer ppOrderId);

    /**
     * Find nodes by workflow
     */
    @Query("SELECT * FROM PP_Order_Node WHERE PP_Order_Workflow_ID = :workflowId AND IsActive = 'Y' ORDER BY Priority")
    List<PPOrderNode> findByWorkflowId(Integer workflowId);

    /**
     * Find nodes by resource
     */
    @Query("SELECT * FROM PP_Order_Node WHERE S_Resource_ID = :resourceId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderNode> findByResourceId(Integer resourceId);

    /**
     * Find milestone nodes
     */
    @Query("SELECT * FROM PP_Order_Node WHERE IsMilestone = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderNode> findMilestones();

    /**
     * Find subcontracting nodes
     */
    @Query("SELECT * FROM PP_Order_Node WHERE IsSubcontracting = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderNode> findSubcontractingNodes();

    /**
     * Find nodes by action
     */
    @Query("SELECT * FROM PP_Order_Node WHERE Action = :action AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderNode> findByAction(String action);

    /**
     * Find node by ID
     */
    @Query("SELECT * FROM PP_Order_Node WHERE PP_Order_Node_ID = :id AND IsActive = 'Y'")
    Optional<PPOrderNode> findById(Integer id);

    /**
     * Find nodes by order and action
     */
    @Query("SELECT * FROM PP_Order_Node WHERE PP_Order_ID = :ppOrderId AND Action = :action AND IsActive = 'Y' ORDER BY Priority")
    List<PPOrderNode> findByOrderIdAndAction(Integer ppOrderId, String action);
}
