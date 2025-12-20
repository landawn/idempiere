package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.MatchInv;

/**
 * DAO interface for MatchInv entity operations.
 */
public interface MatchInvDao extends CrudDao<MatchInv, Integer, SQLBuilder.PSC, MatchInvDao> {

    @Query("SELECT * FROM M_MatchInv WHERE IsActive = 'Y'")
    List<MatchInv> findAllActive();

    @Query("SELECT * FROM M_MatchInv WHERE M_InOutLine_ID = :inOutLineId")
    List<MatchInv> findByInOutLine(Integer inOutLineId);

    @Query("SELECT * FROM M_MatchInv WHERE C_InvoiceLine_ID = :invoiceLineId")
    List<MatchInv> findByInvoiceLine(Integer invoiceLineId);

    @Query("SELECT * FROM M_MatchInv WHERE M_Product_ID = :productId AND Processed = 'Y' ORDER BY DateTrx DESC")
    List<MatchInv> findByProduct(Integer productId);

    @Query("SELECT * FROM M_MatchInv WHERE DateTrx BETWEEN :startDate AND :endDate AND AD_Client_ID = :clientId ORDER BY DateTrx")
    List<MatchInv> findByDateRange(java.time.LocalDateTime startDate, java.time.LocalDateTime endDate, Integer clientId);
}
