package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PaySelection;
import org.idempiere.model.PaySelectionLine;
import org.idempiere.model.PaySelectionCheck;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Pay Selection entity operations.
 */
@Dao(cache = @Cache(capacity = 200, evictDelay = 3000))
public interface PaySelectionDao extends CrudDao<PaySelection, Integer, SQLBuilder.NSC, PaySelectionDao> {

    @Select("SELECT * FROM C_PaySelection WHERE AD_Client_ID = :clientId AND Processed = 'N' ORDER BY PayDate DESC")
    List<PaySelection> findUnprocessedByClient(int clientId);

    @Select("SELECT * FROM C_PaySelection WHERE C_BankAccount_ID = :bankAccountId ORDER BY PayDate DESC")
    List<PaySelection> findByBankAccount(int bankAccountId);

    @Select("SELECT * FROM C_PaySelectionLine WHERE C_PaySelection_ID = :paySelectionId ORDER BY Line")
    List<PaySelectionLine> findLinesBySelection(int paySelectionId);

    @Select("SELECT * FROM C_PaySelectionLine WHERE C_Invoice_ID = :invoiceId")
    List<PaySelectionLine> findLinesByInvoice(int invoiceId);

    @Select("SELECT * FROM C_PaySelectionCheck WHERE C_PaySelection_ID = :paySelectionId ORDER BY DocumentNo")
    List<PaySelectionCheck> findChecksBySelection(int paySelectionId);

    @Select("SELECT * FROM C_PaySelectionCheck WHERE C_BPartner_ID = :bPartnerId AND Processed = 'N'")
    List<PaySelectionCheck> findUnprintedChecksByBPartner(int bPartnerId);
}
