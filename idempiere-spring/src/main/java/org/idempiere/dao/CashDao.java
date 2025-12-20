package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Cash;

/**
 * DAO interface for Cash entity operations.
 */
public interface CashDao extends CrudDao<Cash, Integer, SQLBuilder.PSC, CashDao> {

    @Query("SELECT * FROM C_Cash WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId")
    Optional<Cash> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM C_Cash WHERE C_CashBook_ID = :cashBookId AND DocStatus NOT IN ('VO', 'RE') ORDER BY StatementDate DESC")
    List<Cash> findByCashBook(Integer cashBookId);

    @Query("SELECT * FROM C_Cash WHERE DocStatus = :docStatus AND AD_Client_ID = :clientId ORDER BY StatementDate DESC")
    List<Cash> findByDocStatus(String docStatus, Integer clientId);

    @Query("SELECT * FROM C_Cash WHERE StatementDate BETWEEN :startDate AND :endDate AND AD_Client_ID = :clientId ORDER BY StatementDate")
    List<Cash> findByDateRange(java.time.LocalDateTime startDate, java.time.LocalDateTime endDate, Integer clientId);

    @Query("SELECT * FROM C_Cash WHERE IsActive = 'Y' ORDER BY StatementDate DESC")
    List<Cash> findAllActive();
}
