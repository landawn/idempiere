package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PPOrderWorkflow;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

/**
 * DAO interface for PPOrderWorkflow entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface PPOrderWorkflowDao extends CrudDao<PPOrderWorkflow, Integer, SQLBuilder.PSC, PPOrderWorkflowDao> {

    /**
     * Find workflow by manufacturing order
     */
    @Query("SELECT * FROM PP_Order_Workflow WHERE PP_Order_ID = :ppOrderId AND IsActive = 'Y'")
    Optional<PPOrderWorkflow> findByOrderId(Integer ppOrderId);

    /**
     * Find workflows by base workflow template
     */
    @Query("SELECT * FROM PP_Order_Workflow WHERE AD_Workflow_ID = :workflowId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderWorkflow> findByWorkflowId(Integer workflowId);

    /**
     * Find valid workflows
     */
    @Query("SELECT * FROM PP_Order_Workflow WHERE IsValid = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderWorkflow> findValidWorkflows();

    /**
     * Find workflows by resource
     */
    @Query("SELECT * FROM PP_Order_Workflow WHERE S_Resource_ID = :resourceId AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderWorkflow> findByResourceId(Integer resourceId);

    /**
     * Find workflows by type
     */
    @Query("SELECT * FROM PP_Order_Workflow WHERE WorkflowType = :workflowType AND IsActive = 'Y' ORDER BY Created DESC")
    List<PPOrderWorkflow> findByWorkflowType(String workflowType);

    /**
     * Find workflow by document number
     */
    @Query("SELECT * FROM PP_Order_Workflow WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<PPOrderWorkflow> findByDocumentNo(String documentNo);

    /**
     * Find workflow by ID
     */
    @Query("SELECT * FROM PP_Order_Workflow WHERE PP_Order_Workflow_ID = :id AND IsActive = 'Y'")
    Optional<PPOrderWorkflow> findById(Integer id);

    /**
     * Find workflows by priority
     */
    @Query("SELECT * FROM PP_Order_Workflow WHERE Priority >= :minPriority AND IsActive = 'Y' ORDER BY Priority DESC")
    List<PPOrderWorkflow> findByMinPriority(Integer minPriority);
}
