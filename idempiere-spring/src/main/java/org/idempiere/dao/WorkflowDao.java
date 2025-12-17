package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Workflow;

import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Dao.Cache;
import com.landawn.abacus.condition.ConditionFactory.CF;
import com.landawn.abacus.jdbc.Jdbc;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface WorkflowDao extends CrudDao<Workflow, Integer, SQLBuilder.NSC, WorkflowDao> {

    @Select("SELECT * FROM AD_Workflow WHERE Value = :value AND IsActive = 'Y'")
    Optional<Workflow> findByValue(String value);

    @Select("SELECT * FROM AD_Workflow WHERE Name = :name AND IsActive = 'Y'")
    Optional<Workflow> findByName(String name);

    @Select("SELECT * FROM AD_Workflow WHERE IsActive = 'Y' ORDER BY Name")
    List<Workflow> findAllActive();

    @Select("SELECT * FROM AD_Workflow WHERE WorkflowType = :workflowType AND IsActive = 'Y' ORDER BY Name")
    List<Workflow> findByWorkflowType(String workflowType);

    @Select("SELECT * FROM AD_Workflow WHERE AD_Table_ID = :tableId AND IsActive = 'Y'")
    List<Workflow> findByTable(int tableId);

    @Select("SELECT * FROM AD_Workflow WHERE IsValid = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Workflow> findAllValid();
}
