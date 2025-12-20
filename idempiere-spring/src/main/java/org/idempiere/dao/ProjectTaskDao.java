package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.ProjectTask;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Project Task entity operations.
 */
@Cache(capacity = 500, evictDelay = 3000)
public interface ProjectTaskDao extends CrudDao<ProjectTask, Integer, SQLBuilder.PSC, ProjectTaskDao> {

    @Query("SELECT * FROM C_ProjectTask WHERE C_ProjectPhase_ID = :phaseId ORDER BY SeqNo")
    List<ProjectTask> findByPhase(int phaseId);

    @Query("SELECT * FROM C_ProjectTask WHERE C_ProjectPhase_ID = :phaseId AND IsComplete = 'N' ORDER BY SeqNo")
    List<ProjectTask> findIncompleteByPhase(int phaseId);

    @Query("SELECT * FROM C_ProjectTask WHERE C_ProjectPhase_ID = :phaseId AND IsMilestone = 'Y' ORDER BY SeqNo")
    List<ProjectTask> findMilestonesByPhase(int phaseId);

    @Query("SELECT * FROM C_ProjectTask WHERE C_Order_ID = :orderId")
    List<ProjectTask> findByOrder(int orderId);
}
