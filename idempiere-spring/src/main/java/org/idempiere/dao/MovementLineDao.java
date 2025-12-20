package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.MovementLine;

/**
 * DAO interface for MovementLine entity operations.
 */
public interface MovementLineDao extends CrudDao<MovementLine, Integer, SQLBuilder.PSC, MovementLineDao> {

    @Query("SELECT * FROM M_MovementLine WHERE M_Movement_ID = :movementId ORDER BY Line")
    List<MovementLine> findByMovement(Integer movementId);

    @Query("SELECT * FROM M_MovementLine WHERE M_Product_ID = :productId AND M_Movement_ID = :movementId")
    List<MovementLine> findByProductAndMovement(Integer productId, Integer movementId);
}
