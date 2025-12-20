package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.PromotionGroup;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface PromotionGroupDao extends CrudDao<PromotionGroup, Integer, SQLBuilder.PSC, PromotionGroupDao> {

    @Query("SELECT * FROM M_PromotionGroup WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<PromotionGroup> findByClient(Integer clientId);

    @Query("SELECT * FROM M_PromotionGroup WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<PromotionGroup> findByName(String name, Integer clientId);
}
