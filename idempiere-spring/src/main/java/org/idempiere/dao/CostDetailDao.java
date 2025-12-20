package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.CostDetail;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface CostDetailDao extends CrudDao<CostDetail, Integer, SQLBuilder.PSC, CostDetailDao> {

    @Query("SELECT * FROM M_CostDetail WHERE M_Product_ID = :productId ORDER BY Created DESC")
    List<CostDetail> findByProduct(Integer productId);

    @Query("SELECT * FROM M_CostDetail WHERE C_AcctSchema_ID = :acctSchemaId ORDER BY Created DESC")
    List<CostDetail> findByAcctSchema(Integer acctSchemaId);

    @Query("SELECT * FROM M_CostDetail WHERE M_InOutLine_ID = :inOutLineId")
    List<CostDetail> findByInOutLine(Integer inOutLineId);

    @Query("SELECT * FROM M_CostDetail WHERE C_InvoiceLine_ID = :invoiceLineId")
    List<CostDetail> findByInvoiceLine(Integer invoiceLineId);

    @Query("SELECT * FROM M_CostDetail WHERE M_MovementLine_ID = :movementLineId")
    List<CostDetail> findByMovementLine(Integer movementLineId);

    @Query("SELECT * FROM M_CostDetail WHERE IsProcessed = :isProcessed ORDER BY Created")
    List<CostDetail> findByProcessed(String isProcessed);
}
