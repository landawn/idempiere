package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.WorkflowResponsible;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface WorkflowResponsibleDao extends CrudDao<WorkflowResponsible, Integer, SQLBuilder.PSC, WorkflowResponsibleDao> {

    @Query("SELECT * FROM AD_WF_Responsible WHERE AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    List<WorkflowResponsible> findByClient(Integer clientId);

    @Query("SELECT * FROM AD_WF_Responsible WHERE Name = :name AND AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    Optional<WorkflowResponsible> findByName(String name, Integer clientId);

    @Query("SELECT * FROM AD_WF_Responsible WHERE ResponsibleType = :responsibleType AND AD_Client_ID IN (0, :clientId) AND IsActive = 'Y'")
    List<WorkflowResponsible> findByType(String responsibleType, Integer clientId);
}
