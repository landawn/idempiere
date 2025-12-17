package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Chart;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Chart operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface ChartDao extends CrudDao<Chart, Integer, SQLBuilder.NSC, ChartDao> {

    @Select("SELECT * FROM AD_Chart WHERE Name = :name AND IsActive = 'Y'")
    Optional<Chart> findByName(String name);

    @Select("SELECT * FROM AD_Chart WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Chart> findByClient(int clientId);

    @Select("SELECT * FROM AD_Chart WHERE IsActive = 'Y' ORDER BY Name")
    List<Chart> findAllActive();

    @Select("SELECT * FROM AD_Chart WHERE ChartType = :chartType AND IsActive = 'Y' ORDER BY Name")
    List<Chart> findByChartType(String chartType);
}
