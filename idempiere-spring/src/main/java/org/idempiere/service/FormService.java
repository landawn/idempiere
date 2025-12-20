package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.FormDao;
import org.idempiere.model.Form;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

/**
 * Service class for Form business operations.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class FormService {

    private final FormDao formDao;

    /**
     * Find form by ID.
     */
    public Optional<Form> findById(int formId) {
        try {
            return Optional.ofNullable(formDao.gett(formId));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    /**
     * Find form by name.
     */
    public Optional<Form> findByName(String name) {
        return formDao.findByName(name);
    }

    /**
     * Find forms by classname.
     */
    public List<Form> findByClassname(String classname) {
        return formDao.findByClassname(classname);
    }

    /**
     * Find forms by entity type.
     */
    public List<Form> findByEntityType(String entityType) {
        return formDao.findByEntityType(entityType);
    }

    /**
     * Find all active forms.
     */
    public List<Form> findAllActive() {
        return formDao.findAllActive();
    }

    /**
     * Find all forms.
     */
    public List<Form> findAll() {
        return formDao.findAll();
    }

    /**
     * Save a form.
     */
    public Form save(Form form) {
        try {
            if (form.getAdFormId() == null || form.getAdFormId() == 0) {
                formDao.insert(form);
            } else {
                formDao.update(form);
            }
            return form;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save form", e);
        }
    }

    /**
     * Delete a form.
     */
    public void delete(int formId) {
        try {
            formDao.deleteById(formId);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    /**
     * Check if form exists.
     */
    public boolean exists(int formId) {
        try {
            return formDao.exists(formId);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
