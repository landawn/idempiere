package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.AllocationLine;

/**
 * DAO interface for AllocationLine entity operations.
 */
public interface AllocationLineDao extends CrudDao<AllocationLine, Integer, SQLBuilder.PSC, AllocationLineDao> {

    @Query("SELECT * FROM C_AllocationLine WHERE C_AllocationHdr_ID = :allocationHdrId ORDER BY Line")
    List<AllocationLine> findByAllocationHdr(Integer allocationHdrId);

    @Query("SELECT * FROM C_AllocationLine WHERE C_Invoice_ID = :invoiceId")
    List<AllocationLine> findByInvoice(Integer invoiceId);

    @Query("SELECT * FROM C_AllocationLine WHERE C_Payment_ID = :paymentId")
    List<AllocationLine> findByPayment(Integer paymentId);

    @Query("SELECT * FROM C_AllocationLine WHERE C_BPartner_ID = :bpartnerId")
    List<AllocationLine> findByBPartner(Integer bpartnerId);
}
