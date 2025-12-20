package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.JournalDao;
import org.idempiere.dao.JournalLineDao;
import org.idempiere.dao.JournalBatchDao;
import org.idempiere.model.Journal;
import org.idempiere.model.JournalLine;
import org.idempiere.model.JournalBatch;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Journal entity operations.
 */
@Service
@Transactional
public class JournalService {

    private final JournalDao journalDao;
    private final JournalLineDao journalLineDao;
    private final JournalBatchDao journalBatchDao;

    public JournalService(JournalDao journalDao, JournalLineDao journalLineDao, JournalBatchDao journalBatchDao) {
        this.journalDao = journalDao;
        this.journalLineDao = journalLineDao;
        this.journalBatchDao = journalBatchDao;
    }

    // Journal methods
    public Optional<Journal> findById(Integer id) {
        try { return Optional.ofNullable(journalDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Journal> findAll() {
        return journalDao.findAll();
    }

    public Optional<Journal> findByDocumentNo(String documentNo, Integer clientId) {
        return journalDao.findByDocumentNo(documentNo, clientId);
    }

    public List<Journal> findByBatch(Integer batchId) {
        return journalDao.findByBatch(batchId);
    }

    public List<Journal> findByDocStatus(String docStatus, Integer clientId) {
        return journalDao.findByDocStatus(docStatus, clientId);
    }

    public Journal save(Journal journal) {
        try {
            if (journal.getGlJournalId() == null) {
                journalDao.insert(journal);
            } else {
                journalDao.update(journal);
            }
            return journal;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // JournalLine methods
    public List<JournalLine> findLinesByJournal(Integer journalId) {
        return journalLineDao.findByJournal(journalId);
    }

    public JournalLine saveLine(JournalLine line) {
        try {
            if (line.getGlJournalLineId() == null) {
                journalLineDao.insert(line);
            } else {
                journalLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    // JournalBatch methods
    public Optional<JournalBatch> findBatchById(Integer id) {
        try { return Optional.ofNullable(journalBatchDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<JournalBatch> findAllBatches() {
        return journalBatchDao.findAll();
    }

    public Optional<JournalBatch> findBatchByDocumentNo(String documentNo, Integer clientId) {
        return journalBatchDao.findByDocumentNo(documentNo, clientId);
    }

    public List<JournalBatch> findBatchesByDocStatus(String docStatus, Integer clientId) {
        return journalBatchDao.findByDocStatus(docStatus, clientId);
    }

    public JournalBatch saveBatch(JournalBatch batch) {
        try {
            if (batch.getGlJournalBatchId() == null) {
                journalBatchDao.insert(batch);
            } else {
                journalBatchDao.update(batch);
            }
            return batch;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { journalDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return journalDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
