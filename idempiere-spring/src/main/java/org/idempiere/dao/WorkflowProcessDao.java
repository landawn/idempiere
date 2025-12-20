package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.WorkflowProcess;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface WorkflowProcessDao extends CrudDao<WorkflowProcess, Integer, SQLBuilder.PSC, WorkflowProcessDao> {

    @Query("SELECT * FROM AD_WF_Process WHERE AD_Workflow_ID = :workflowId ORDER BY Created DESC")
    List<WorkflowProcess> findByWorkflow(Integer workflowId);

    @Query("SELECT * FROM AD_WF_Process WHERE AD_Table_ID = :tableId AND Record_ID = :recordId ORDER BY Created DESC")
    List<WorkflowProcess> findByRecord(Integer tableId, Integer recordId);

    @Query("SELECT * FROM AD_WF_Process WHERE WFState = :wfState AND AD_Client_ID = :clientId ORDER BY Created DESC")
    List<WorkflowProcess> findByState(String wfState, Integer clientId);

    @Query("SELECT * FROM AD_WF_Process WHERE AD_User_ID = :userId AND WFState NOT IN ('CC', 'TE') ORDER BY Created DESC")
    List<WorkflowProcess> findActiveByUser(Integer userId);
}
