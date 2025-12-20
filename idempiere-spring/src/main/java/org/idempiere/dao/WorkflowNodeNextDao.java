package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.WorkflowNodeNext;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface WorkflowNodeNextDao extends CrudDao<WorkflowNodeNext, Integer, SQLBuilder.PSC, WorkflowNodeNextDao> {

    @Query("SELECT * FROM AD_WF_NodeNext WHERE AD_WF_Node_ID = :nodeId AND IsActive = 'Y' ORDER BY SeqNo")
    List<WorkflowNodeNext> findByNode(Integer nodeId);

    @Query("SELECT * FROM AD_WF_NodeNext WHERE AD_WF_Next_ID = :nextNodeId AND IsActive = 'Y'")
    List<WorkflowNodeNext> findByNextNode(Integer nextNodeId);

    @Query("SELECT * FROM AD_WF_NodeNext WHERE AD_WF_Node_ID = :nodeId AND IsStdUserWorkflow = 'Y' AND IsActive = 'Y'")
    Optional<WorkflowNodeNext> findStdUserWorkflowTransition(Integer nodeId);
}
