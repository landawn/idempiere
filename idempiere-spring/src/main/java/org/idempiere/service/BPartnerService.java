package org.idempiere.service;

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
        return bPartnerDao.findById(id);
    }

    public List<BPartner> findAll() {
        return bPartnerDao.findAll();
    }

    public Optional<BPartner> findByValue(String value) {
        return bPartnerDao.findByValue(value);
    }

    public List<BPartner> findByName(String name) {
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
        if (bPartner.getCBPartnerId() == null) {
            bPartnerDao.insert(bPartner);
        } else {
            bPartnerDao.update(bPartner);
        }
        return bPartner;
    }

    public void delete(Integer id) {
        bPartnerDao.deleteById(id);
    }

    public boolean exists(Integer id) {
        return bPartnerDao.exists(id);
    }
}
