package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.OrganizationDao;
import org.idempiere.model.Organization;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Organization entity operations.
 */
@Service
@Transactional
public class OrganizationService {

    private final OrganizationDao organizationDao;

    public OrganizationService(OrganizationDao organizationDao) {
        this.organizationDao = organizationDao;
    }

    public Optional<Organization> findById(Integer id) {
        try { return Optional.ofNullable(organizationDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Organization> findAll() {
        return organizationDao.findAll();
    }

    public Optional<Organization> findByValue(String value) {
        return organizationDao.findByValue(value);
    }

    public List<Organization> findByClientId(Integer clientId) {
        return organizationDao.findByClientId(clientId);
    }

    public List<Organization> findAllActive() {
        return organizationDao.findAllActive();
    }

    public List<Organization> findSummaryOrganizations() {
        return organizationDao.findSummaryOrganizations();
    }

    public Organization save(Organization organization) {
        try {
            if (organization.getAdOrgId() == null) {
                organizationDao.insert(organization);
            } else {
                organizationDao.update(organization);
            }
            return organization;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { organizationDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return organizationDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
