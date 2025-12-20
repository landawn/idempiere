package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Journal;

/**
 * DAO interface for GL Journal entity operations.
 */
public interface JournalDao extends CrudDao<Journal, Integer, SQLBuilder.PSC, JournalDao> {

    @Query("SELECT * FROM GL_Journal WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Journal> findByDocumentNo(String documentNo, Integer clientId);

    @Query("SELECT * FROM GL_Journal WHERE GL_JournalBatch_ID = :batchId AND IsActive = 'Y' ORDER BY DocumentNo")
    List<Journal> findByBatch(Integer batchId);

    @Query("SELECT * FROM GL_Journal WHERE DocStatus = :docStatus AND AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findByDocStatus(String docStatus, Integer clientId);

    @Query("SELECT * FROM GL_Journal WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findByAcctSchemaId(Integer acctSchemaId);

    @Query("SELECT * FROM GL_Journal WHERE DateDoc BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    @Query("SELECT * FROM GL_Journal WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findAllDraft();

    @Query("SELECT * FROM GL_Journal WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findAllCompleted();

    @Query("SELECT * FROM GL_Journal WHERE Posted = 'N' AND DocStatus = 'CO' AND IsActive = 'Y'")
    List<Journal> findUnposted();

    @Query("SELECT * FROM GL_Journal WHERE IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findAll();
}
