package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.InOutLine;

/**
 * DAO interface for InOutLine entity operations.
 */
public interface InOutLineDao extends CrudDao<InOutLine, Integer, SQLBuilder.NSC, InOutLineDao> {

    @Query("SELECT * FROM M_InOutLine WHERE M_InOut_ID = :inOutId ORDER BY Line")
    List<InOutLine> findByInOut(Integer inOutId);

    @Query("SELECT * FROM M_InOutLine WHERE M_Product_ID = :productId AND M_InOut_ID = :inOutId")
    List<InOutLine> findByProductAndInOut(Integer productId, Integer inOutId);

    @Query("SELECT * FROM M_InOutLine WHERE C_OrderLine_ID = :orderLineId")
    List<InOutLine> findByOrderLine(Integer orderLineId);
}
