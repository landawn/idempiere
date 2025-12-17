package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;

import org.idempiere.model.DepositBatch;
import org.idempiere.model.DepositBatchLine;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Deposit Batch entity operations.
 */
@Dao(cache = @Cache(capacity = 200, evictDelay = 3000))
public interface DepositBatchDao extends CrudDao<DepositBatch, Integer, SQLBuilder.NSC, DepositBatchDao> {

    @Select("SELECT * FROM C_DepositBatch WHERE AD_Client_ID = :clientId AND DocStatus IN ('DR', 'IP') ORDER BY DateDoc DESC")
    List<DepositBatch> findDraftByClient(int clientId);

    @Select("SELECT * FROM C_DepositBatch WHERE C_BankAccount_ID = :bankAccountId ORDER BY DateDeposit DESC")
    List<DepositBatch> findByBankAccount(int bankAccountId);

    @Select("SELECT * FROM C_DepositBatch WHERE DateDeposit BETWEEN :dateFrom AND :dateTo AND AD_Client_ID = :clientId ORDER BY DateDeposit")
    List<DepositBatch> findByDateRange(LocalDateTime dateFrom, LocalDateTime dateTo, int clientId);

    @Select("SELECT * FROM C_DepositBatchLine WHERE C_DepositBatch_ID = :depositBatchId ORDER BY Line")
    List<DepositBatchLine> findLinesByBatch(int depositBatchId);

    @Select("SELECT * FROM C_DepositBatchLine WHERE C_Payment_ID = :paymentId")
    List<DepositBatchLine> findLinesByPayment(int paymentId);
}
