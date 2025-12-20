package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.ProjectPhase;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Project Phase entity operations.
 */
@Cache(capacity = 500, evictDelay = 3000)
public interface ProjectPhaseDao extends CrudDao<ProjectPhase, Integer, SQLBuilder.PSC, ProjectPhaseDao> {

    @Query("SELECT * FROM C_ProjectPhase WHERE C_Project_ID = :projectId ORDER BY SeqNo")
    List<ProjectPhase> findByProject(int projectId);

    @Query("SELECT * FROM C_ProjectPhase WHERE C_Project_ID = :projectId AND IsComplete = 'N' ORDER BY SeqNo")
    List<ProjectPhase> findIncompleteByProject(int projectId);

    @Query("SELECT * FROM C_ProjectPhase WHERE C_Order_ID = :orderId")
    List<ProjectPhase> findByOrder(int orderId);
}
