package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.DunningRunLine;

/**
 * DAO interface for DunningRunLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface DunningRunLineDao extends CrudDao<DunningRunLine, Integer, SQLBuilder.PSC, DunningRunLineDao> {

    /**
     * Find all dunning run lines for a dunning run entry
     */
    @Query("SELECT * FROM C_DunningRunLine WHERE C_DunningRunEntry_ID = :dunningRunEntryId AND IsActive = 'Y' ORDER BY Created")
    List<DunningRunLine> findByDunningRunEntry(Integer dunningRunEntryId);

    /**
     * Find dunning run lines by invoice
     */
    @Query("SELECT * FROM C_DunningRunLine WHERE C_Invoice_ID = :invoiceId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunLine> findByInvoice(Integer invoiceId);

    /**
     * Find dunning run lines by payment
     */
    @Query("SELECT * FROM C_DunningRunLine WHERE C_Payment_ID = :paymentId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunLine> findByPayment(Integer paymentId);

    /**
     * Find processed dunning run lines
     */
    @Query("SELECT * FROM C_DunningRunLine WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunLine> findProcessed();

    /**
     * Find unprocessed dunning run lines
     */
    @Query("SELECT * FROM C_DunningRunLine WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunLine> findUnprocessed();

    /**
     * Find dunning run lines in dispute
     */
    @Query("SELECT * FROM C_DunningRunLine WHERE IsInDispute = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunLine> findInDispute();

    /**
     * Find dunning run lines by invoice payment schedule
     */
    @Query("SELECT * FROM C_DunningRunLine WHERE C_InvoicePaySchedule_ID = :scheduleId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunLine> findByInvoicePaySchedule(Integer scheduleId);

    /**
     * Find dunning run lines with overdue amounts
     */
    @Query("SELECT * FROM C_DunningRunLine WHERE OpenAmt > 0 AND DaysDue > 0 AND IsActive = 'Y' ORDER BY DaysDue DESC")
    List<DunningRunLine> findOverdue();
}
