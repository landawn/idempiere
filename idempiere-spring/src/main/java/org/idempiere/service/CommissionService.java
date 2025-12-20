package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.CommissionDao;
import org.idempiere.dao.CommissionLineDao;
import org.idempiere.dao.CommissionRunDao;
import org.idempiere.model.Commission;
import org.idempiere.model.CommissionLine;
import org.idempiere.model.CommissionRun;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Commission entity operations.
 */
@Service
@Transactional
public class CommissionService {

    private final CommissionDao commissionDao;
    private final CommissionLineDao commissionLineDao;
    private final CommissionRunDao commissionRunDao;

    public CommissionService(CommissionDao commissionDao, CommissionLineDao commissionLineDao,
                             CommissionRunDao commissionRunDao) {
        this.commissionDao = commissionDao;
        this.commissionLineDao = commissionLineDao;
        this.commissionRunDao = commissionRunDao;
    }

    public Optional<Commission> findById(Integer id) {
        try {
            return Optional.ofNullable(commissionDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<Commission> findAll() {
        return commissionDao.findAllActive();
    }

    public List<Commission> findByBPartner(Integer bpartnerId) {
        return commissionDao.findByBPartner(bpartnerId);
    }

    public List<CommissionLine> findLinesByCommission(Integer commissionId) {
        return commissionLineDao.findByCommission(commissionId);
    }

    public List<CommissionRun> findRunsByCommission(Integer commissionId) {
        return commissionRunDao.findByCommission(commissionId);
    }

    public Commission save(Commission commission) {
        try {
            if (commission.getCCommissionId() == null) {
                commissionDao.insert(commission);
            } else {
                commissionDao.update(commission);
            }
            return commission;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save commission", e);
        }
    }

    public CommissionLine saveLine(CommissionLine line) {
        try {
            if (line.getCCommissionLineId() == null) {
                commissionLineDao.insert(line);
            } else {
                commissionLineDao.update(line);
            }
            return line;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save commission line", e);
        }
    }

    public CommissionRun saveRun(CommissionRun run) {
        try {
            if (run.getCCommissionRunId() == null) {
                commissionRunDao.insert(run);
            } else {
                commissionRunDao.update(run);
            }
            return run;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save commission run", e);
        }
    }

    public void delete(Integer id) {
        try {
            commissionDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return commissionDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
