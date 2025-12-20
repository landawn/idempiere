package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.WorkflowActivity;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface WorkflowActivityDao extends CrudDao<WorkflowActivity, Integer, SQLBuilder.PSC, WorkflowActivityDao> {

    @Query("SELECT * FROM AD_WF_Activity WHERE AD_WF_Process_ID = :processId ORDER BY Created")
    List<WorkflowActivity> findByProcess(Integer processId);

    @Query("SELECT * FROM AD_WF_Activity WHERE AD_User_ID = :userId AND WFState NOT IN ('CC', 'TE') ORDER BY Created DESC")
    List<WorkflowActivity> findActiveByUser(Integer userId);

    @Query("SELECT * FROM AD_WF_Activity WHERE WFState = :wfState AND AD_Client_ID = :clientId ORDER BY Created")
    List<WorkflowActivity> findByState(String wfState, Integer clientId);

    @Query("SELECT * FROM AD_WF_Activity WHERE AD_WF_Node_ID = :nodeId ORDER BY Created DESC")
    List<WorkflowActivity> findByNode(Integer nodeId);
}
