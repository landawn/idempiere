package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Chart;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Chart operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface ChartDao extends CrudDao<Chart, Integer, SQLBuilder.PSC, ChartDao> {

    @Query("SELECT * FROM AD_Chart WHERE Name = :name AND IsActive = 'Y'")
    Optional<Chart> findByName(String name);

    @Query("SELECT * FROM AD_Chart WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Chart> findByClient(int clientId);

    @Query("SELECT * FROM AD_Chart WHERE IsActive = 'Y' ORDER BY Name")
    List<Chart> findAllActive();

    @Query("SELECT * FROM AD_Chart WHERE ChartType = :chartType AND IsActive = 'Y' ORDER BY Name")
    List<Chart> findByChartType(String chartType);
}
