package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PaySelection;
import org.idempiere.model.PaySelectionLine;
import org.idempiere.model.PaySelectionCheck;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Pay Selection entity operations.
 */
@Cache(capacity = 200, evictDelay = 3000)
public interface PaySelectionDao extends CrudDao<PaySelection, Integer, SQLBuilder.PSC, PaySelectionDao> {

    @Query("SELECT * FROM C_PaySelection WHERE AD_Client_ID = :clientId AND Processed = 'N' ORDER BY PayDate DESC")
    List<PaySelection> findUnprocessedByClient(int clientId);

    @Query("SELECT * FROM C_PaySelection WHERE C_BankAccount_ID = :bankAccountId ORDER BY PayDate DESC")
    List<PaySelection> findByBankAccount(int bankAccountId);

    @Query("SELECT * FROM C_PaySelectionLine WHERE C_PaySelection_ID = :paySelectionId ORDER BY Line")
    List<PaySelectionLine> findLinesBySelection(int paySelectionId);

    @Query("SELECT * FROM C_PaySelectionLine WHERE C_Invoice_ID = :invoiceId")
    List<PaySelectionLine> findLinesByInvoice(int invoiceId);

    @Query("SELECT * FROM C_PaySelectionCheck WHERE C_PaySelection_ID = :paySelectionId ORDER BY DocumentNo")
    List<PaySelectionCheck> findChecksBySelection(int paySelectionId);

    @Query("SELECT * FROM C_PaySelectionCheck WHERE C_BPartner_ID = :bPartnerId AND Processed = 'N'")
    List<PaySelectionCheck> findUnprintedChecksByBPartner(int bPartnerId);
}
