package org.idempiere.dao;

import java.util.List;

import org.idempiere.model.PromotionGroupLine;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PromotionGroupLineDao extends CrudDao<PromotionGroupLine, Integer, SQLBuilder.PSC, PromotionGroupLineDao> {

    @Query("SELECT * FROM M_PromotionGroupLine WHERE M_PromotionGroup_ID = :promotionGroupId AND IsActive = 'Y'")
    List<PromotionGroupLine> findByPromotionGroup(Integer promotionGroupId);

    @Query("SELECT * FROM M_PromotionGroupLine WHERE M_Product_ID = :productId AND IsActive = 'Y'")
    List<PromotionGroupLine> findByProduct(Integer productId);
}
