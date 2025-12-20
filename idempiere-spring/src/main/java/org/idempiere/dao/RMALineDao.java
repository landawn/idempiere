package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.RMALine;

/**
 * DAO interface for RMALine entity operations.
 */
public interface RMALineDao extends CrudDao<RMALine, Integer, SQLBuilder.PSC, RMALineDao> {

    @Query("SELECT * FROM M_RMALine WHERE M_RMA_ID = :rmaId ORDER BY Line")
    List<RMALine> findByRMA(Integer rmaId);

    @Query("SELECT * FROM M_RMALine WHERE M_InOutLine_ID = :inOutLineId")
    List<RMALine> findByInOutLine(Integer inOutLineId);

    @Query("SELECT * FROM M_RMALine WHERE M_Product_ID = :productId AND M_RMA_ID = :rmaId")
    List<RMALine> findByProductAndRMA(Integer productId, Integer rmaId);
}
