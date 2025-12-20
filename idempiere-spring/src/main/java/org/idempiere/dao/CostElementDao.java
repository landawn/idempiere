package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.CostElement;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Cost Element entity operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface CostElementDao extends CrudDao<CostElement, Integer, SQLBuilder.PSC, CostElementDao> {

    @Query("SELECT * FROM M_CostElement WHERE AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<CostElement> findByClient(int clientId);

    @Query("SELECT * FROM M_CostElement WHERE CostElementType = :type AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<CostElement> findByType(String type, int clientId);

    @Query("SELECT * FROM M_CostElement WHERE CostingMethod = :method AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<CostElement> findByCostingMethod(String method, int clientId);

    @Query("SELECT * FROM M_CostElement WHERE IsCalculated = 'Y' AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    List<CostElement> findCalculated(int clientId);
}
