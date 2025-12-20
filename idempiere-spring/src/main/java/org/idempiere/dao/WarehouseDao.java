package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Warehouse;

/**
 * DAO interface for Warehouse entity operations.
 */
public interface WarehouseDao extends CrudDao<Warehouse, Integer, SQLBuilder.PSC, WarehouseDao> {

    @Query("SELECT * FROM M_Warehouse WHERE Value = :value AND IsActive = 'Y'")
    Optional<Warehouse> findByValue(String value);

    @Query("SELECT * FROM M_Warehouse WHERE Name = :name AND IsActive = 'Y'")
    Optional<Warehouse> findByName(String name);

    @Query("SELECT * FROM M_Warehouse WHERE AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY Name")
    List<Warehouse> findByOrgId(Integer orgId);

    @Query("SELECT * FROM M_Warehouse WHERE IsInTransit = 'Y' AND IsActive = 'Y'")
    List<Warehouse> findInTransitWarehouses();

    @Query("SELECT * FROM M_Warehouse WHERE IsActive = 'Y' ORDER BY Name")
    List<Warehouse> findAllActive();

    @Query("SELECT * FROM M_Warehouse WHERE AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY Name")
    List<Warehouse> findByOrg(Integer orgId);

    @Query("SELECT * FROM M_Warehouse WHERE Value = :value AND AD_Org_ID = :orgId AND IsActive = 'Y'")
    Optional<Warehouse> findByValueAndOrg(String value, Integer orgId);

    @Query("SELECT * FROM M_Warehouse WHERE IsActive = 'Y' ORDER BY Name")
    List<Warehouse> findAll();
}
