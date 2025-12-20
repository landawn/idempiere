package org.idempiere.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.CostDao;
import org.idempiere.dao.CostElementDao;
import org.idempiere.model.Cost;
import org.idempiere.model.CostElement;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service for Cost Management operations.
 */
@Service
@Transactional
public class CostService {

    private final CostDao costDao;
    private final CostElementDao costElementDao;

    public CostService(CostDao costDao, CostElementDao costElementDao) {
        this.costDao = costDao;
        this.costElementDao = costElementDao;
    }

    /**
     * Get cost by ID.
     */
    public Optional<Cost> getById(int costId) {
        try { return Optional.ofNullable(costDao.gett(costId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Get cost for a product.
     */
    public List<Cost> getByProduct(int productId) {
        return costDao.findByProduct(productId);
    }

    /**
     * Get cost for a product, schema, and cost element combination.
     */
    public Optional<Cost> getProductCost(int productId, int acctSchemaId, int costElementId) {
        return costDao.findByProductAndSchema(productId, acctSchemaId, costElementId);
    }

    /**
     * Get cost elements for a client.
     */
    public List<CostElement> getCostElements(int clientId) {
        return costElementDao.findByClient(clientId);
    }

    /**
     * Get calculated cost elements.
     */
    public List<CostElement> getCalculatedCostElements(int clientId) {
        return costElementDao.findCalculated(clientId);
    }

    /**
     * Create or update product cost.
     */
    public Cost saveCost(Cost cost) {
        try {
            if (cost.getMCostUU() == null || cost.getMCostUU().isEmpty()) {
                costDao.insert(cost);
            } else {
                costDao.update(cost);
            }
            return cost;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to save cost", e);
        }
    }

    /**
     * Update cost with new transaction.
     */
    public Cost updateCost(int costId, BigDecimal amt, BigDecimal qty) {
        try {
            Optional<Cost> optCost = Optional.ofNullable(costDao.gett(costId));
            if (optCost.isPresent()) {
                Cost cost = optCost.get();

                // Update cumulated values
                BigDecimal newCumulatedAmt = cost.getCumulatedAmt().add(amt);
                BigDecimal newCumulatedQty = cost.getCumulatedQty().add(qty);
                cost.setCumulatedAmt(newCumulatedAmt);
                cost.setCumulatedQty(newCumulatedQty);

                // Update current values
                BigDecimal newCurrentQty = cost.getCurrentQty().add(qty);
                cost.setCurrentQty(newCurrentQty);

                // Recalculate current cost price (average costing)
                if (newCumulatedQty.compareTo(BigDecimal.ZERO) != 0) {
                    BigDecimal newCostPrice = newCumulatedAmt.divide(newCumulatedQty, 6, RoundingMode.HALF_UP);
                    cost.setCurrentCostPrice(newCostPrice);
                }

                costDao.update(cost);
                return cost;
            }
            return null;
        } catch (SQLException e) {
            throw new RuntimeException("Failed to update cost", e);
        }
    }

    /**
     * Freeze cost for a product.
     */
    public void freezeCost(int costId) {
        try {
            Optional<Cost> optCost = Optional.ofNullable(costDao.gett(costId));
            if (optCost.isPresent()) {
                Cost cost = optCost.get();
                cost.setIsCostFrozen("Y");
                costDao.update(cost);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to freeze cost", e);
        }
    }

    /**
     * Set future cost price.
     */
    public void setFutureCostPrice(int costId, BigDecimal futureCostPrice) {
        try {
            Optional<Cost> optCost = Optional.ofNullable(costDao.gett(costId));
            if (optCost.isPresent()) {
                Cost cost = optCost.get();
                cost.setFutureCostPrice(futureCostPrice);
                costDao.update(cost);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Failed to set future cost price", e);
        }
    }
}
