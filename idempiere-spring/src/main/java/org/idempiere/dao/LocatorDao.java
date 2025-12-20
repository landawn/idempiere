package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Locator;

/**
 * DAO interface for Locator entity operations.
 */
public interface LocatorDao extends CrudDao<Locator, Integer, SQLBuilder.PSC, LocatorDao> {

    @Query("SELECT * FROM M_Locator WHERE M_Warehouse_ID = :warehouseId AND IsActive = 'Y' ORDER BY Value")
    List<Locator> findByWarehouse(Integer warehouseId);

    @Query("SELECT * FROM M_Locator WHERE Value = :value AND M_Warehouse_ID = :warehouseId AND IsActive = 'Y'")
    Optional<Locator> findByValueAndWarehouse(String value, Integer warehouseId);

    @Query("SELECT * FROM M_Locator WHERE IsDefault = 'Y' AND M_Warehouse_ID = :warehouseId")
    Optional<Locator> findDefaultByWarehouse(Integer warehouseId);

    @Query("SELECT * FROM M_Locator WHERE X = :x AND Y = :y AND Z = :z AND M_Warehouse_ID = :warehouseId")
    Optional<Locator> findByCoordinates(String x, String y, String z, Integer warehouseId);
}
