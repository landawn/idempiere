package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.RequisitionLine;

/**
 * DAO interface for RequisitionLine entity operations.
 */
public interface RequisitionLineDao extends CrudDao<RequisitionLine, Integer, SQLBuilder.PSC, RequisitionLineDao> {

    @Query("SELECT * FROM M_RequisitionLine WHERE M_Requisition_ID = :requisitionId ORDER BY Line")
    List<RequisitionLine> findByRequisition(Integer requisitionId);

    @Query("SELECT * FROM M_RequisitionLine WHERE M_Product_ID = :productId AND M_Requisition_ID = :requisitionId")
    List<RequisitionLine> findByProductAndRequisition(Integer productId, Integer requisitionId);

    @Query("SELECT * FROM M_RequisitionLine WHERE C_OrderLine_ID IS NULL AND M_Requisition_ID IN (SELECT M_Requisition_ID FROM M_Requisition WHERE DocStatus = 'CO')")
    List<RequisitionLine> findUnorderedLines();
}
