package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.AllocationHdr;
import org.idempiere.model.AllocationLine;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Allocation entity operations.
 */
@Cache(capacity = 500, evictDelay = 3000)
public interface AllocationDao extends CrudDao<AllocationHdr, Integer, SQLBuilder.PSC, AllocationDao> {

    @Query("SELECT * FROM C_AllocationHdr WHERE AD_Client_ID = :clientId AND DocStatus IN ('CO', 'CL') ORDER BY DateTrx DESC")
    List<AllocationHdr> findCompletedByClient(int clientId);

    @Query("SELECT * FROM C_AllocationHdr WHERE DateTrx BETWEEN :dateFrom AND :dateTo AND AD_Client_ID = :clientId ORDER BY DateTrx")
    List<AllocationHdr> findByDateRange(LocalDateTime dateFrom, LocalDateTime dateTo, int clientId);

    @Query("SELECT * FROM C_AllocationLine WHERE C_AllocationHdr_ID = :allocationHdrId ORDER BY C_AllocationLine_ID")
    List<AllocationLine> findLinesByHeader(int allocationHdrId);

    @Query("SELECT l.* FROM C_AllocationLine l JOIN C_AllocationHdr h ON l.C_AllocationHdr_ID = h.C_AllocationHdr_ID WHERE l.C_Invoice_ID = :invoiceId AND h.DocStatus IN ('CO', 'CL')")
    List<AllocationLine> findLinesByInvoice(int invoiceId);

    @Query("SELECT l.* FROM C_AllocationLine l JOIN C_AllocationHdr h ON l.C_AllocationHdr_ID = h.C_AllocationHdr_ID WHERE l.C_Payment_ID = :paymentId AND h.DocStatus IN ('CO', 'CL')")
    List<AllocationLine> findLinesByPayment(int paymentId);

    @Query("SELECT l.* FROM C_AllocationLine l JOIN C_AllocationHdr h ON l.C_AllocationHdr_ID = h.C_AllocationHdr_ID WHERE l.C_BPartner_ID = :bPartnerId AND h.DocStatus IN ('CO', 'CL')")
    List<AllocationLine> findLinesByBPartner(int bPartnerId);
}
