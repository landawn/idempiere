package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PromotionDistribution;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PromotionDistributionDao extends CrudDao<PromotionDistribution, Integer, SQLBuilder.PSC, PromotionDistributionDao> {

    @Query("SELECT * FROM M_PromotionDistribution WHERE M_Promotion_ID = :promotionId AND IsActive = 'Y' ORDER BY SeqNo")
    List<PromotionDistribution> findByPromotion(Integer promotionId);
}
