package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ReferenceDao;
import org.idempiere.model.Reference;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * Service class for Reference business operations.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class ReferenceService {

    private final ReferenceDao referenceDao;

    /**
     * Find reference by ID.
     */
    public Optional<Reference> findById(int referenceId) {
        try { return Optional.ofNullable(referenceDao.gett(referenceId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find reference by name.
     */
    public Optional<Reference> findByName(String name) {
        return referenceDao.findByName(name);
    }

    /**
     * Find references by validation type.
     */
    public List<Reference> findByValidationType(String validationType) {
        return referenceDao.findByValidationType(validationType);
    }

    /**
     * Find references by entity type.
     */
    public List<Reference> findByEntityType(String entityType) {
        return referenceDao.findByEntityType(entityType);
    }

    /**
     * Find all active references.
     */
    public List<Reference> findAllActive() {
        return referenceDao.findAllActive();
    }

    /**
     * Find all references.
     */
    public List<Reference> findAll() {
        return referenceDao.findAllActive();
    }

    /**
     * Save a reference.
     */
    public Reference save(Reference reference) {
        try {
            if (reference.getAdReferenceId() == null || reference.getAdReferenceId() == 0) {
                referenceDao.insert(reference);
            } else {
                referenceDao.update(reference);
            }
            return reference;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    /**
     * Delete a reference.
     */
    public void delete(int referenceId) {
        try { referenceDao.deleteById(referenceId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Count all references.
     */
    public long count() {
        return referenceDao.findAllActive().size();
    }

    /**
     * Check if reference exists.
     */
    public boolean exists(int referenceId) {
        try { return referenceDao.exists(referenceId); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
