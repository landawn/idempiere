package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PromotionPreCondition;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PromotionPreConditionDao extends CrudDao<PromotionPreCondition, Integer, SQLBuilder.PSC, PromotionPreConditionDao> {

    @Query("SELECT * FROM M_PromotionPreCondition WHERE M_Promotion_ID = :promotionId AND IsActive = 'Y' ORDER BY SeqNo")
    List<PromotionPreCondition> findByPromotion(Integer promotionId);
}
