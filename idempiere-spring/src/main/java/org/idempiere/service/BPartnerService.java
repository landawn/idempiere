package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.BPartnerDao;
import org.idempiere.model.BPartner;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Business Partner entity operations.
 */
@Service
@Transactional
public class BPartnerService {

    private final BPartnerDao bPartnerDao;

    public BPartnerService(BPartnerDao bPartnerDao) {
        this.bPartnerDao = bPartnerDao;
    }

    public Optional<BPartner> findById(Integer id) {
        try {
            return Optional.ofNullable(bPartnerDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<BPartner> findAll() {
        return bPartnerDao.findAllActive();
    }

    public Optional<BPartner> findByValue(String value) {
        return bPartnerDao.findByValue(value);
    }

    public Optional<BPartner> findByName(String name) {
        return bPartnerDao.findByName(name);
    }

    public List<BPartner> findAllCustomers() {
        return bPartnerDao.findAllCustomers();
    }

    public List<BPartner> findAllVendors() {
        return bPartnerDao.findAllVendors();
    }

    public List<BPartner> findAllEmployees() {
        return bPartnerDao.findAllEmployees();
    }

    public List<BPartner> findBySalesRepId(Integer salesRepId) {
        return bPartnerDao.findBySalesRepId(salesRepId);
    }

    public List<BPartner> findByBPartnerGroupId(Integer bPartnerGroupId) {
        return bPartnerDao.findByBPartnerGroupId(bPartnerGroupId);
    }

    public List<BPartner> findAllActive() {
        return bPartnerDao.findAllActive();
    }

    public BPartner save(BPartner bPartner) {
        try {
            if (bPartner.getCBpartnerId() == null) {
                bPartnerDao.insert(bPartner);
            } else {
                bPartnerDao.update(bPartner);
            }
            return bPartner;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(Integer id) {
        try {
            bPartnerDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return bPartnerDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
