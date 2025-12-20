package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.SystemConfig;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for System Configuration operations.
 */
@Cache(capacity = 500, evictDelay = 3000)
public interface SystemConfigDao extends CrudDao<SystemConfig, Integer, SQLBuilder.PSC, SystemConfigDao> {

    @Query("SELECT * FROM AD_SysConfig WHERE Name = :name AND AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y'")
    Optional<SystemConfig> findByName(String name, int clientId, int orgId);

    @Query("SELECT * FROM AD_SysConfig WHERE Name = :name AND IsActive = 'Y' ORDER BY AD_Client_ID DESC, AD_Org_ID DESC")
    List<SystemConfig> findAllByName(String name);

    @Query("SELECT * FROM AD_SysConfig WHERE ConfigurationLevel = :level AND IsActive = 'Y' ORDER BY Name")
    List<SystemConfig> findByConfigurationLevel(String level);

    @Query("SELECT * FROM AD_SysConfig WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<SystemConfig> findByClient(int clientId);

    @Query("SELECT * FROM AD_SysConfig WHERE IsActive = 'Y' ORDER BY Name")
    List<SystemConfig> findAllActive();
}
