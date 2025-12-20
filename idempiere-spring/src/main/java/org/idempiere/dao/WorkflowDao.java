package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Workflow;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

@Cache(capacity = 100, evictDelay = 3000)
public interface WorkflowDao extends CrudDao<Workflow, Integer, SQLBuilder.PSC, WorkflowDao> {

    @Query("SELECT * FROM AD_Workflow WHERE Value = :value AND IsActive = 'Y'")
    Optional<Workflow> findByValue(String value);

    @Query("SELECT * FROM AD_Workflow WHERE Name = :name AND IsActive = 'Y'")
    Optional<Workflow> findByName(String name);

    @Query("SELECT * FROM AD_Workflow WHERE IsActive = 'Y' ORDER BY Name")
    List<Workflow> findAllActive();

    @Query("SELECT * FROM AD_Workflow WHERE WorkflowType = :workflowType AND IsActive = 'Y' ORDER BY Name")
    List<Workflow> findByWorkflowType(String workflowType);

    @Query("SELECT * FROM AD_Workflow WHERE AD_Table_ID = :tableId AND IsActive = 'Y'")
    List<Workflow> findByTable(int tableId);

    @Query("SELECT * FROM AD_Workflow WHERE IsValid = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Workflow> findAllValid();
}
