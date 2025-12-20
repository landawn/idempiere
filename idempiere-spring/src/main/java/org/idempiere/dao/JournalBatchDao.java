package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.JournalBatch;

/**
 * DAO interface for JournalBatch entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface JournalBatchDao extends CrudDao<JournalBatch, Integer, SQLBuilder.PSC, JournalBatchDao> {

    /**
     * Find a journal batch by document number
     */
    @Query("SELECT * FROM GL_JournalBatch WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<JournalBatch> findByDocumentNo(String documentNo, Integer clientId);

    /**
     * Find journal batches by document status
     */
    @Query("SELECT * FROM GL_JournalBatch WHERE DocStatus = :docStatus AND AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<JournalBatch> findByDocStatus(String docStatus, Integer clientId);

    /**
     * Find journal batches by GL category
     */
    @Query("SELECT * FROM GL_JournalBatch WHERE GL_Category_ID = :categoryId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<JournalBatch> findByCategory(Integer categoryId);

    /**
     * Find all draft journal batches
     */
    @Query("SELECT * FROM GL_JournalBatch WHERE DocStatus = 'DR' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<JournalBatch> findAllDraft();

    /**
     * Find all completed journal batches
     */
    @Query("SELECT * FROM GL_JournalBatch WHERE DocStatus = 'CO' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<JournalBatch> findAllCompleted();

    /**
     * Find journal batches by period
     */
    @Query("SELECT * FROM GL_JournalBatch WHERE C_Period_ID = :periodId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<JournalBatch> findByPeriod(Integer periodId);

    @Query("SELECT * FROM GL_JournalBatch WHERE IsActive = 'Y' ORDER BY DateDoc DESC")
    List<JournalBatch> findAll();
}
