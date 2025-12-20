package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PromotionLine;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PromotionLineDao extends CrudDao<PromotionLine, Integer, SQLBuilder.PSC, PromotionLineDao> {

    @Query("SELECT * FROM M_PromotionLine WHERE M_Promotion_ID = :promotionId AND IsActive = 'Y' ORDER BY SeqNo")
    List<PromotionLine> findByPromotion(Integer promotionId);
}
