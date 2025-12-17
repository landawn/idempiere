package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.ProjectPhase;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Project Phase entity operations.
 */
@Dao(cache = @Cache(capacity = 500, evictDelay = 3000))
public interface ProjectPhaseDao extends CrudDao<ProjectPhase, Integer, SQLBuilder.NSC, ProjectPhaseDao> {

    @Select("SELECT * FROM C_ProjectPhase WHERE C_Project_ID = :projectId ORDER BY SeqNo")
    List<ProjectPhase> findByProject(int projectId);

    @Select("SELECT * FROM C_ProjectPhase WHERE C_Project_ID = :projectId AND IsComplete = 'N' ORDER BY SeqNo")
    List<ProjectPhase> findIncompleteByProject(int projectId);

    @Select("SELECT * FROM C_ProjectPhase WHERE C_Order_ID = :orderId")
    List<ProjectPhase> findByOrder(int orderId);
}
