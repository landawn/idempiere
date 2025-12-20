package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.AssetDepreciationEntry;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Asset Depreciation operations.
 * Maps to A_Depreciation table.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface AssetDepreciationEntryDao extends CrudDao<AssetDepreciationEntry, Integer, SQLBuilder.PSC, AssetDepreciationEntryDao> {

    @Query("SELECT * FROM A_Depreciation WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<AssetDepreciationEntry> findByName(String name, int clientId);

    @Query("SELECT * FROM A_Depreciation WHERE DepreciationType = :depreciationType AND IsActive = 'Y' ORDER BY Name")
    List<AssetDepreciationEntry> findByDepreciationType(String depreciationType);

    @Query("SELECT * FROM A_Depreciation WHERE A_Depreciation_Method_ID = :methodId AND IsActive = 'Y' ORDER BY Name")
    List<AssetDepreciationEntry> findByDepreciationMethod(int methodId);

    @Query("SELECT * FROM A_Depreciation WHERE A_Depreciation_Convention_ID = :conventionId AND IsActive = 'Y' ORDER BY Name")
    List<AssetDepreciationEntry> findByDepreciationConvention(int conventionId);

    @Query("SELECT * FROM A_Depreciation WHERE IsDepreciated = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<AssetDepreciationEntry> findDepreciated();

    @Query("SELECT * FROM A_Depreciation WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<AssetDepreciationEntry> findProcessed();

    @Query("SELECT * FROM A_Depreciation WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<AssetDepreciationEntry> findUnprocessed();

    @Query("SELECT * FROM A_Depreciation WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY Name")
    List<AssetDepreciationEntry> findByClientAndOrg(int clientId, int orgId);

    @Query("SELECT * FROM A_Depreciation WHERE IsActive = 'Y' ORDER BY Name")
    List<AssetDepreciationEntry> findAllActive();
}
