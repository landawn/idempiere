package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.WorkflowNode;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface WorkflowNodeDao extends CrudDao<WorkflowNode, Integer, SQLBuilder.PSC, WorkflowNodeDao> {

    @Query("SELECT * FROM AD_WF_Node WHERE AD_Workflow_ID = :workflowId AND IsActive = 'Y' ORDER BY XPosition, YPosition")
    List<WorkflowNode> findByWorkflow(Integer workflowId);

    @Query("SELECT * FROM AD_WF_Node WHERE Value = :value AND AD_Workflow_ID = :workflowId AND IsActive = 'Y'")
    Optional<WorkflowNode> findByValue(String value, Integer workflowId);

    @Query("SELECT * FROM AD_WF_Node WHERE Action = :action AND AD_Workflow_ID = :workflowId AND IsActive = 'Y'")
    List<WorkflowNode> findByAction(String action, Integer workflowId);
}
