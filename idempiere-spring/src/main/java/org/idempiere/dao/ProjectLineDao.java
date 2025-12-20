package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.ProjectLine;

/**
 * DAO interface for ProjectLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface ProjectLineDao extends CrudDao<ProjectLine, Integer, SQLBuilder.PSC, ProjectLineDao> {

    /**
     * Find project lines by project ID
     */
    @Query("SELECT * FROM C_ProjectLine WHERE C_Project_ID = :projectId AND IsActive = 'Y' ORDER BY Line")
    List<ProjectLine> findByProjectId(Integer projectId);

    /**
     * Find project lines by project phase ID
     */
    @Query("SELECT * FROM C_ProjectLine WHERE C_ProjectPhase_ID = :projectPhaseId AND IsActive = 'Y' ORDER BY Line")
    List<ProjectLine> findByProjectPhaseId(Integer projectPhaseId);

    /**
     * Find project lines by project task ID
     */
    @Query("SELECT * FROM C_ProjectLine WHERE C_ProjectTask_ID = :projectTaskId AND IsActive = 'Y' ORDER BY Line")
    List<ProjectLine> findByProjectTaskId(Integer projectTaskId);

    /**
     * Find project lines by product ID
     */
    @Query("SELECT * FROM C_ProjectLine WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Line")
    List<ProjectLine> findByProductId(Integer productId);

    /**
     * Find project lines by order line ID
     */
    @Query("SELECT * FROM C_ProjectLine WHERE C_OrderPO_ID = :orderLineId AND IsActive = 'Y' ORDER BY Line")
    List<ProjectLine> findByOrderLineId(Integer orderLineId);

    /**
     * Find invoiced project lines
     */
    @Query("SELECT * FROM C_ProjectLine WHERE IsInvoiced = 'Y' AND IsActive = 'Y' ORDER BY Line")
    List<ProjectLine> findAllInvoiced();

    /**
     * Find processed project lines
     */
    @Query("SELECT * FROM C_ProjectLine WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY Line")
    List<ProjectLine> findAllProcessed();
}
