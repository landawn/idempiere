package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.FreightCategory;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface FreightCategoryDao extends CrudDao<FreightCategory, Integer, SQLBuilder.NSC, FreightCategoryDao> {

    @Query("SELECT * FROM M_FreightCategory WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<FreightCategory> findByClient(Integer clientId);

    @Query("SELECT * FROM M_FreightCategory WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<FreightCategory> findByName(String name, Integer clientId);
}
