package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.CostDetailDao;
import org.idempiere.dao.CostTypeDao;
import org.idempiere.model.CostDetail;
import org.idempiere.model.CostType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Cost Detail entity operations.
 */
@Service
@Transactional
public class CostDetailService {

    private final CostDetailDao costDetailDao;
    private final CostTypeDao costTypeDao;

    public CostDetailService(CostDetailDao costDetailDao, CostTypeDao costTypeDao) {
        this.costDetailDao = costDetailDao;
        this.costTypeDao = costTypeDao;
    }

    // CostDetail methods
    public Optional<CostDetail> findById(Integer id) {
        try {
            return Optional.ofNullable(costDetailDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<CostDetail> findByProduct(Integer productId) {
        return costDetailDao.findByProduct(productId);
    }

    public List<CostDetail> findByAcctSchema(Integer acctSchemaId) {
        return costDetailDao.findByAcctSchema(acctSchemaId);
    }

    public List<CostDetail> findByInvoiceLine(Integer invoiceLineId) {
        return costDetailDao.findByInvoiceLine(invoiceLineId);
    }

    public List<CostDetail> findByInOutLine(Integer inOutLineId) {
        return costDetailDao.findByInOutLine(inOutLineId);
    }

    public List<CostDetail> findByMovementLine(Integer movementLineId) {
        return costDetailDao.findByMovementLine(movementLineId);
    }

    public CostDetail save(CostDetail costDetail) {
        try {
            if (costDetail.getMCostDetailId() == null) {
                costDetailDao.insert(costDetail);
            } else {
                costDetailDao.update(costDetail);
            }
            return costDetail;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save cost detail", e);
        }
    }

    // CostType methods
    public Optional<CostType> findCostTypeById(Integer id) {
        try {
            return Optional.ofNullable(costTypeDao.gett(id));
        } catch (SQLException e) {
            throw new RuntimeException("Failed to find by id", e);
        }
    }

    public List<CostType> findCostTypesByClient(Integer clientId) {
        return costTypeDao.findByClient(clientId);
    }

    public Optional<CostType> findCostTypeByName(String name, Integer clientId) {
        return costTypeDao.findByName(name, clientId);
    }

    public CostType saveCostType(CostType costType) {
        try {
            if (costType.getMCostTypeId() == null) {
                costTypeDao.insert(costType);
            } else {
                costTypeDao.update(costType);
            }
            return costType;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save cost type", e);
        }
    }

    public void delete(Integer id) {
        try {
            costDetailDao.deleteById(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to delete", e);
        }
    }

    public boolean exists(Integer id) {
        try {
            return costDetailDao.exists(id);
        } catch (SQLException e) {
            throw new RuntimeException("Failed to check exists", e);
        }
    }
}
