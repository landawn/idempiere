package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.DepositBatch;
import org.idempiere.model.DepositBatchLine;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Deposit Batch entity operations.
 */
@Cache(capacity = 200, evictDelay = 3000)
public interface DepositBatchDao extends CrudDao<DepositBatch, Integer, SQLBuilder.PSC, DepositBatchDao> {

    @Query("SELECT * FROM C_DepositBatch WHERE AD_Client_ID = :clientId AND DocStatus IN ('DR', 'IP') ORDER BY DateDoc DESC")
    List<DepositBatch> findDraftByClient(int clientId);

    @Query("SELECT * FROM C_DepositBatch WHERE C_BankAccount_ID = :bankAccountId ORDER BY DateDeposit DESC")
    List<DepositBatch> findByBankAccount(int bankAccountId);

    @Query("SELECT * FROM C_DepositBatch WHERE DateDeposit BETWEEN :dateFrom AND :dateTo AND AD_Client_ID = :clientId ORDER BY DateDeposit")
    List<DepositBatch> findByDateRange(LocalDateTime dateFrom, LocalDateTime dateTo, int clientId);

    @Query("SELECT * FROM C_DepositBatchLine WHERE C_DepositBatch_ID = :depositBatchId ORDER BY Line")
    List<DepositBatchLine> findLinesByBatch(int depositBatchId);

    @Query("SELECT * FROM C_DepositBatchLine WHERE C_Payment_ID = :paymentId")
    List<DepositBatchLine> findLinesByPayment(int paymentId);
}
