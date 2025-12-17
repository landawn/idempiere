package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Warehouse;

/**
 * DAO interface for Warehouse entity operations.
 */
public interface WarehouseDao extends CrudDao<Warehouse, Integer, SQLBuilder.NSC, WarehouseDao> {

    @Select("SELECT * FROM M_Warehouse WHERE Value = :value AND IsActive = 'Y'")
    Optional<Warehouse> findByValue(String value);

    @Select("SELECT * FROM M_Warehouse WHERE Name = :name AND IsActive = 'Y'")
    Optional<Warehouse> findByName(String name);

    @Select("SELECT * FROM M_Warehouse WHERE AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY Name")
    List<Warehouse> findByOrgId(Integer orgId);

    @Select("SELECT * FROM M_Warehouse WHERE IsInTransit = 'Y' AND IsActive = 'Y'")
    List<Warehouse> findInTransitWarehouses();

    @Select("SELECT * FROM M_Warehouse WHERE IsActive = 'Y' ORDER BY Name")
    List<Warehouse> findAllActive();
}
