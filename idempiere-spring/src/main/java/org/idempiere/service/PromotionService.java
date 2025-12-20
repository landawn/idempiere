package org.idempiere.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.idempiere.dao.PromotionDao;
import org.idempiere.model.Promotion;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class for Promotion business operations.
 */
@Service
@Transactional
public class PromotionService {

    private final PromotionDao promotionDao;

    public PromotionService(PromotionDao promotionDao) {
        this.promotionDao = promotionDao;
    }

    /**
     * Find promotion by ID.
     */
    public Optional<Promotion> findById(int promotionId) {
        try { return Optional.ofNullable(promotionDao.gett(promotionId)); } catch (SQLException e) { throw new RuntimeException("Failed to find by id", e); }
    }

    /**
     * Find promotion by name.
     */
    public Optional<Promotion> findByName(String name, int clientId) {
        return promotionDao.findByName(name, clientId);
    }

    /**
     * Find all promotions for a client.
     */
    public List<Promotion> findByClient(int clientId) {
        return promotionDao.findByClient(clientId);
    }

    /**
     * Find all promotions in a promotion group.
     */
    public List<Promotion> findByPromotionGroup(int promotionGroupId) {
        return promotionDao.findByPromotionGroup(promotionGroupId);
    }

    /**
     * Find all promotions for a campaign.
     */
    public List<Promotion> findByCampaign(int campaignId) {
        return promotionDao.findByCampaign(campaignId);
    }

    /**
     * Find all active promotions (within valid date range).
     */
    public List<Promotion> findActivePromotions() {
        return promotionDao.findActivePromotions();
    }

    /**
     * Find all active promotions.
     */
    public List<Promotion> findAllActive() {
        return promotionDao.findAllActive();
    }

    /**
     * Save a promotion.
     */
    public Promotion save(Promotion promotion) {
        if (promotion.getMPromotionId() == null || promotion.getMPromotionId() == 0) {
            promotionDao.insert(promotion);
        } else {
            promotionDao.update(promotion);
        }
        return promotion;
    }

    /**
     * Delete a promotion.
     */
    public void delete(int promotionId) {
        try { promotionDao.deleteById(promotionId); } catch (SQLException e) { throw new RuntimeException("Failed to delete", e); }
    }

    /**
     * Count all promotions.
     */
    public long count() {
        return promotionDao.findAllActive().size();
    }
}
