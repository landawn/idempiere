package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PromotionReward;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PromotionRewardDao extends CrudDao<PromotionReward, Integer, SQLBuilder.PSC, PromotionRewardDao> {

    @Query("SELECT * FROM M_PromotionReward WHERE M_Promotion_ID = :promotionId AND IsActive = 'Y' ORDER BY SeqNo")
    List<PromotionReward> findByPromotion(Integer promotionId);

    @Query("SELECT * FROM M_PromotionReward WHERE RewardType = :rewardType AND IsActive = 'Y'")
    List<PromotionReward> findByRewardType(String rewardType);
}
