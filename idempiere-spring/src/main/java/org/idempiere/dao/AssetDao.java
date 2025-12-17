package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.Asset;

import com.landawn.abacus.annotation.Cache;
import com.landawn.abacus.annotation.Dao;
import com.landawn.abacus.annotation.Select;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.util.SQLBuilder;

/**
 * DAO for Asset operations.
 */
@Dao(cache = @Cache(capacity = 100, evictDelay = 3000))
public interface AssetDao extends CrudDao<Asset, Integer, SQLBuilder.NSC, AssetDao> {

    @Select("SELECT * FROM A_Asset WHERE Value = :value AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Asset> findByValue(String value, int clientId);

    @Select("SELECT * FROM A_Asset WHERE Name LIKE :name AND AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Asset> searchByName(String name, int clientId);

    @Select("SELECT * FROM A_Asset WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY Name")
    List<Asset> findByClientAndOrg(int clientId, int orgId);

    @Select("SELECT * FROM A_Asset WHERE A_Asset_Group_ID = :assetGroupId AND IsActive = 'Y' ORDER BY Name")
    List<Asset> findByAssetGroup(int assetGroupId);

    @Select("SELECT * FROM A_Asset WHERE C_BPartner_ID = :bPartnerId AND IsActive = 'Y' ORDER BY Name")
    List<Asset> findByBPartner(int bPartnerId);

    @Select("SELECT * FROM A_Asset WHERE M_Product_ID = :productId AND IsActive = 'Y' ORDER BY Name")
    List<Asset> findByProduct(int productId);

    @Select("SELECT * FROM A_Asset WHERE SerNo = :serNo AND IsActive = 'Y'")
    Optional<Asset> findBySerialNo(String serNo);

    @Select("SELECT * FROM A_Asset WHERE IsDepreciated = 'Y' AND IsFullyDepreciated = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<Asset> findDepreciableAssets();

    @Select("SELECT * FROM A_Asset WHERE IsOwned = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Asset> findOwnedAssets();

    @Select("SELECT * FROM A_Asset WHERE A_Asset_Status = :status AND IsActive = 'Y' ORDER BY Name")
    List<Asset> findByStatus(String status);

    @Select("SELECT * FROM A_Asset WHERE IsActive = 'Y' ORDER BY Name")
    List<Asset> findAllActive();
}
