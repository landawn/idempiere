package org.idempiere.dao;

import java.math.BigDecimal;
import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.PaySelectionLine;

/**
 * DAO interface for PaySelectionLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface PaySelectionLineDao extends CrudDao<PaySelectionLine, Integer, SQLBuilder.PSC, PaySelectionLineDao> {

    /**
     * Find payment selection lines by payment selection ID
     */
    @Query("SELECT * FROM C_PaySelectionLine WHERE C_PaySelection_ID = :paySelectionId AND IsActive = 'Y' ORDER BY Line")
    List<PaySelectionLine> findByPaySelectionId(Integer paySelectionId);

    /**
     * Find payment selection lines by invoice ID
     */
    @Query("SELECT * FROM C_PaySelectionLine WHERE C_Invoice_ID = :invoiceId AND IsActive = 'Y' ORDER BY Line")
    List<PaySelectionLine> findByInvoiceId(Integer invoiceId);

    /**
     * Find payment selection lines by business partner ID
     */
    @Query("SELECT * FROM C_PaySelectionLine WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Line")
    List<PaySelectionLine> findByBPartnerId(Integer bPartnerId);

    /**
     * Find payment selection lines with amount greater than specified value
     */
    @Query("SELECT * FROM C_PaySelectionLine WHERE PayAmt > :minAmount AND IsActive = 'Y' ORDER BY PayAmt DESC")
    List<PaySelectionLine> findByMinAmount(BigDecimal minAmount);

    /**
     * Find processed payment selection lines
     */
    @Query("SELECT * FROM C_PaySelectionLine WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY Line")
    List<PaySelectionLine> findAllProcessed();
}
