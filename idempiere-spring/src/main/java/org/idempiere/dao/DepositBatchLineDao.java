package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.DepositBatchLine;

/**
 * DAO interface for DepositBatchLine entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface DepositBatchLineDao extends CrudDao<DepositBatchLine, Integer, SQLBuilder.PSC, DepositBatchLineDao> {

    /**
     * Find deposit batch lines by deposit batch ID
     */
    @Query("SELECT * FROM C_DepositBatchLine WHERE C_DepositBatch_ID = :depositBatchId AND IsActive = 'Y' ORDER BY Line")
    List<DepositBatchLine> findByDepositBatchId(Integer depositBatchId);

    /**
     * Find deposit batch lines by payment ID
     */
    @Query("SELECT * FROM C_DepositBatchLine WHERE C_Payment_ID = :paymentId AND IsActive = 'Y' ORDER BY Line")
    List<DepositBatchLine> findByPaymentId(Integer paymentId);

    /**
     * Find deposit batch lines by bank statement line ID
     */
    @Query("SELECT * FROM C_DepositBatchLine WHERE C_BankStatementLine_ID = :bankStatementLineId AND IsActive = 'Y' ORDER BY Line")
    List<DepositBatchLine> findByBankStatementLineId(Integer bankStatementLineId);

    /**
     * Find deposit batch lines by business partner ID
     */
    @Query("SELECT * FROM C_DepositBatchLine WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Line")
    List<DepositBatchLine> findByBPartnerId(Integer bPartnerId);
}
