package org.idempiere.service;

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
        return organizationDao.findById(id);
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
        if (organization.getAdOrgId() == null) {
            organizationDao.insert(organization);
        } else {
            organizationDao.update(organization);
        }
        return organization;
    }

    public void delete(Integer id) {
        organizationDao.deleteById(id);
    }

    public boolean exists(Integer id) {
        return organizationDao.exists(id);
    }
}
