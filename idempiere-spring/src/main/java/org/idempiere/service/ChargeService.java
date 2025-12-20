package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.ChargeDao;
import org.idempiere.model.Charge;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Charge entity operations.
 */
@Service
@Transactional
public class ChargeService {

    private final ChargeDao chargeDao;

    public ChargeService(ChargeDao chargeDao) {
        this.chargeDao = chargeDao;
    }

    public Optional<Charge> findById(Integer id) {
        try { return Optional.ofNullable(chargeDao.gett(id)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    public List<Charge> findAll() {
        return chargeDao.findAllActive();
    }

    public List<Charge> findByClient(Integer clientId) {
        return chargeDao.findByClient(clientId);
    }

    public Optional<Charge> findByName(String name, Integer clientId) {
        return chargeDao.findByNameAndClient(name, clientId);
    }

    public List<Charge> findExpenseType(Integer clientId) {
        return chargeDao.findExpenseType(clientId);
    }

    public Charge save(Charge charge) {
        try {
            if (charge.getCChargeId() == null) {
                chargeDao.insert(charge);
            } else {
                chargeDao.update(charge);
            }
            return charge;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save", e);
        }
    }

    public void delete(Integer id) {
        try { chargeDao.deleteById(id); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    public boolean exists(Integer id) {
        try { return chargeDao.exists(id); } catch (SQLException e) { throw new RuntimeException("Failed to check exists", e); }
    }
}
