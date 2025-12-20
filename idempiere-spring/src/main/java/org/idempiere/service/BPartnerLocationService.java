package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.BPartnerLocationDao;
import org.idempiere.dao.BPBankAccountDao;
import org.idempiere.model.BPartnerLocation;
import org.idempiere.model.BPBankAccount;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for BPartnerLocation and BPBankAccount entity operations.
 */
@Service
@Transactional
public class BPartnerLocationService {

    private final BPartnerLocationDao bPartnerLocationDao;
    private final BPBankAccountDao bpBankAccountDao;

    public BPartnerLocationService(BPartnerLocationDao bPartnerLocationDao, BPBankAccountDao bpBankAccountDao) {
        this.bPartnerLocationDao = bPartnerLocationDao;
        this.bpBankAccountDao = bpBankAccountDao;
    }

    // BPartnerLocation methods
    public Optional<BPartnerLocation> findById(Integer id) {
        try { return Optional.ofNullable(bPartnerLocationDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<BPartnerLocation> findByBPartner(Integer bpartnerId) {
        return bPartnerLocationDao.findByBPartner(bpartnerId);
    }

    public Optional<BPartnerLocation> findShipToLocation(Integer bpartnerId) {
        return bPartnerLocationDao.findShipTo(bpartnerId);
    }

    public Optional<BPartnerLocation> findBillToLocation(Integer bpartnerId) {
        return bPartnerLocationDao.findBillTo(bpartnerId);
    }

    public BPartnerLocation save(BPartnerLocation location) {
        try {
            if (location.getCBPartnerLocationId() == null) {
                bPartnerLocationDao.insert(location);
            } else {
                bPartnerLocationDao.update(location);
            }
            return location;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { bPartnerLocationDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    // BPBankAccount methods
    public Optional<BPBankAccount> findBankAccountById(Integer id) {
        try { return Optional.ofNullable(bpBankAccountDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<BPBankAccount> findBankAccountsByBPartner(Integer bpartnerId) {
        return bpBankAccountDao.findByBPartner(bpartnerId);
    }

    public Optional<BPBankAccount> findDefaultBankAccount(Integer bpartnerId) {
        return bpBankAccountDao.findDefault(bpartnerId);
    }

    public BPBankAccount saveBankAccount(BPBankAccount bankAccount) {
        try {
            if (bankAccount.getCBpBankAccountId() == null) {
                bpBankAccountDao.insert(bankAccount);
            } else {
                bpBankAccountDao.update(bankAccount);
            }
            return bankAccount;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void deleteBankAccount(Integer id) {
        try { bpBankAccountDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }
}
