package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ArchiveDao;
import org.idempiere.model.Archive;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Archive entity operations.
 */
@Service
@Transactional
public class ArchiveService {

    private final ArchiveDao archiveDao;

    public ArchiveService(ArchiveDao archiveDao) {
        this.archiveDao = archiveDao;
    }

    public Optional<Archive> findById(Integer id) {
        try {
            return Optional.ofNullable(archiveDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Archive> findAll() {
        return archiveDao.findAllActive();
    }

    public List<Archive> findByClient(Integer clientId) {
        return archiveDao.findByClient(clientId);
    }

    public List<Archive> findByRecord(Integer tableId, Integer recordId) {
        return archiveDao.findByRecord(tableId, recordId);
    }

    public List<Archive> findByUser(Integer userId) {
        return archiveDao.findByUser(userId);
    }

    public List<Archive> findByBPartner(Integer bpartnerId) {
        return archiveDao.findByBPartner(bpartnerId);
    }

    public Archive save(Archive archive) {
        try {
            if (archive.getAdArchiveId() == null) {
                archiveDao.insert(archive);
            } else {
                archiveDao.update(archive);
            }
            return archive;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save archive", e);
        }
    }

    public void delete(Integer id) {
        try {
            archiveDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return archiveDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
