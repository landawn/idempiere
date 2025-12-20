package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.MatchPO;

/**
 * DAO interface for MatchPO entity operations.
 */
public interface MatchPODao extends CrudDao<MatchPO, Integer, SQLBuilder.PSC, MatchPODao> {

    @Query("SELECT * FROM M_MatchPO WHERE IsActive = 'Y'")
    List<MatchPO> findAllActive();

    @Query("SELECT * FROM M_MatchPO WHERE M_InOutLine_ID = :inOutLineId")
    List<MatchPO> findByInOutLine(Integer inOutLineId);

    @Query("SELECT * FROM M_MatchPO WHERE C_OrderLine_ID = :orderLineId")
    List<MatchPO> findByOrderLine(Integer orderLineId);

    @Query("SELECT * FROM M_MatchPO WHERE C_InvoiceLine_ID = :invoiceLineId")
    List<MatchPO> findByInvoiceLine(Integer invoiceLineId);

    @Query("SELECT * FROM M_MatchPO WHERE M_Product_ID = :productId AND Processed = 'Y' ORDER BY DateTrx DESC")
    List<MatchPO> findByProduct(Integer productId);
}
