package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Journal;

/**
 * DAO interface for GL Journal entity operations.
 */
public interface JournalDao extends CrudDao<Journal, Integer, SQLBuilder.NSC, JournalDao> {

    @Select("SELECT * FROM GL_Journal WHERE DocumentNo = :documentNo AND IsActive = 'Y'")
    Optional<Journal> findByDocumentNo(String documentNo);

    @Select("SELECT * FROM GL_Journal WHERE GL_JournalBatch_ID = :batchId AND IsActive = 'Y' ORDER BY DocumentNo")
    List<Journal> findByBatchId(Integer batchId);

    @Select("SELECT * FROM GL_Journal WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findByDocStatus(String docStatus);

    @Select("SELECT * FROM GL_Journal WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findByAcctSchemaId(Integer acctSchemaId);

    @Select("SELECT * FROM GL_Journal WHERE DateDoc BETWEEN :startDate AND :endDate AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    @Select("SELECT * FROM GL_Journal WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findAllDraft();

    @Select("SELECT * FROM GL_Journal WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<Journal> findAllCompleted();

    @Select("SELECT * FROM GL_Journal WHERE Posted = 'N' AND DocStatus = 'CO' AND IsActive = 'Y'")
    List<Journal> findUnposted();
}
