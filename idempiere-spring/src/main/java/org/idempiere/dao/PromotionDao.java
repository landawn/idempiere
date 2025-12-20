package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Promotion;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Promotion operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface PromotionDao extends CrudDao<Promotion, Integer, SQLBuilder.PSC, PromotionDao> {

    @Query("SELECT * FROM M_Promotion WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Promotion> findByName(String name, int clientId);

    @Query("SELECT * FROM M_Promotion WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY PromotionPriority")
    List<Promotion> findByClient(int clientId);

    @Query("SELECT * FROM M_Promotion WHERE M_Promotion_Group_ID = :promotionGroupId AND IsActive = 'Y' ORDER BY PromotionPriority")
    List<Promotion> findByPromotionGroup(int promotionGroupId);

    @Query("SELECT * FROM M_Promotion WHERE C_Campaign_ID = :campaignId AND IsActive = 'Y' ORDER BY PromotionPriority")
    List<Promotion> findByCampaign(int campaignId);

    @Query("SELECT * FROM M_Promotion WHERE (DateFrom IS NULL OR DateFrom <= CURRENT_DATE) AND (DateTo IS NULL OR DateTo >= CURRENT_DATE) AND IsActive = 'Y' ORDER BY PromotionPriority")
    List<Promotion> findActivePromotions();

    @Query("SELECT * FROM M_Promotion WHERE IsActive = 'Y' ORDER BY PromotionPriority")
    List<Promotion> findAllActive();
}
