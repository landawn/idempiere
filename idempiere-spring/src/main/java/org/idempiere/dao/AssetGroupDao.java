package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.AssetGroup;

/**
 * DAO interface for AssetGroup entity operations.
 */
public interface AssetGroupDao extends CrudDao<AssetGroup, Integer, SQLBuilder.PSC, AssetGroupDao> {

    @Query("SELECT * FROM A_Asset_Group WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<AssetGroup> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM A_Asset_Group WHERE IsDefault = 'Y' AND AD_Client_ID = :clientId")
    Optional<AssetGroup> findDefault(Integer clientId);

    @Query("SELECT * FROM A_Asset_Group WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<AssetGroup> findByClient(Integer clientId);

    /**
     * Find all asset groups (including inactive)
     */
    @Query("SELECT * FROM A_Asset_Group ORDER BY Name")
    List<AssetGroup> findAll();

    /**
     * Find asset group by name
     */
    @Query("SELECT * FROM A_Asset_Group WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<AssetGroup> findByName(String name, Integer clientId);
}
