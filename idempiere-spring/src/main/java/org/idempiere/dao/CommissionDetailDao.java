package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.CommissionDetail;

/**
 * DAO interface for CommissionDetail entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface CommissionDetailDao extends CrudDao<CommissionDetail, Integer, SQLBuilder.PSC, CommissionDetailDao> {

    /**
     * Find all commission details for a commission amount
     */
    @Query("SELECT * FROM C_CommissionDetail WHERE C_CommissionAmt_ID = :commissionAmtId AND IsActive = 'Y' ORDER BY Created")
    List<CommissionDetail> findByCommissionAmt(Integer commissionAmtId);

    /**
     * Find commission details by invoice line
     */
    @Query("SELECT * FROM C_CommissionDetail WHERE C_InvoiceLine_ID = :invoiceLineId AND IsActive = 'Y' ORDER BY Created")
    List<CommissionDetail> findByInvoiceLine(Integer invoiceLineId);

    /**
     * Find commission details by order line
     */
    @Query("SELECT * FROM C_CommissionDetail WHERE C_OrderLine_ID = :orderLineId AND IsActive = 'Y' ORDER BY Created")
    List<CommissionDetail> findByOrderLine(Integer orderLineId);

    /**
     * Find commission details by currency
     */
    @Query("SELECT * FROM C_CommissionDetail WHERE C_Currency_ID = :currencyId AND IsActive = 'Y' ORDER BY Created DESC")
    List<CommissionDetail> findByCurrency(Integer currencyId);
}
