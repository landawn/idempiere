package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.CostType;

import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

public interface CostTypeDao extends CrudDao<CostType, Integer, SQLBuilder.PSC, CostTypeDao> {

    @Query("SELECT * FROM M_CostType WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<CostType> findByClient(Integer clientId);

    @Query("SELECT * FROM M_CostType WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<CostType> findByName(String name, Integer clientId);
}
