package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.CashLine;

/**
 * DAO interface for CashLine entity operations.
 */
public interface CashLineDao extends CrudDao<CashLine, Integer, SQLBuilder.PSC, CashLineDao> {

    @Query("SELECT * FROM C_CashLine WHERE C_Cash_ID = :cashId ORDER BY Line")
    List<CashLine> findByCash(Integer cashId);

    @Query("SELECT * FROM C_CashLine WHERE C_Invoice_ID = :invoiceId")
    List<CashLine> findByInvoice(Integer invoiceId);

    @Query("SELECT * FROM C_CashLine WHERE CashType = :cashType AND C_Cash_ID = :cashId")
    List<CashLine> findByCashType(String cashType, Integer cashId);

    @Query("SELECT * FROM C_CashLine WHERE C_BankAccount_ID = :bankAccountId")
    List<CashLine> findByBankAccount(Integer bankAccountId);
}
