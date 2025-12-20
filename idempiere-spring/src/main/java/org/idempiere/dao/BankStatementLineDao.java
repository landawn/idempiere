package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.BankStatementLine;

/**
 * DAO interface for BankStatementLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface BankStatementLineDao extends CrudDao<BankStatementLine, Integer, SQLBuilder.PSC, BankStatementLineDao> {

    /**
     * Find bank statement lines by bank statement
     */
    @Query("SELECT * FROM C_BankStatementLine WHERE C_BankStatement_ID = :bankStatementId AND IsActive = 'Y' ORDER BY Line")
    List<BankStatementLine> findByBankStatementId(Integer bankStatementId);

    /**
     * Find bank statement lines by payment
     */
    @Query("SELECT * FROM C_BankStatementLine WHERE C_Payment_ID = :paymentId AND IsActive = 'Y' ORDER BY Line")
    List<BankStatementLine> findByPaymentId(Integer paymentId);

    /**
     * Find bank statement lines by invoice
     */
    @Query("SELECT * FROM C_BankStatementLine WHERE C_Invoice_ID = :invoiceId AND IsActive = 'Y' ORDER BY Line")
    List<BankStatementLine> findByInvoiceId(Integer invoiceId);

    /**
     * Find bank statement lines by business partner
     */
    @Query("SELECT * FROM C_BankStatementLine WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY DateAcct DESC")
    List<BankStatementLine> findByBPartnerId(Integer bPartnerId);

    /**
     * Find all processed bank statement lines
     */
    @Query("SELECT * FROM C_BankStatementLine WHERE IsReconciled = 'Y' AND IsActive = 'Y' ORDER BY DateAcct DESC")
    List<BankStatementLine> findAllProcessed();
}
