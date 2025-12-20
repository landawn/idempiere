package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.AssetAcct;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Asset Accounting operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface AssetAcctDao extends CrudDao<AssetAcct, Integer, SQLBuilder.PSC, AssetAcctDao> {

    @Query("SELECT * FROM A_Asset_Acct WHERE A_Asset_ID = :assetId AND IsActive = 'Y'")
    List<AssetAcct> findByAsset(int assetId);

    @Query("SELECT * FROM A_Asset_Acct WHERE A_Asset_ID = :assetId AND C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y'")
    Optional<AssetAcct> findByAssetAndAcctSchema(int assetId, int acctSchemaId);

    @Query("SELECT * FROM A_Asset_Acct WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y'")
    List<AssetAcct> findByAcctSchema(int acctSchemaId);

    @Query("SELECT * FROM A_Asset_Acct WHERE PostingType = :postingType AND IsActive = 'Y'")
    List<AssetAcct> findByPostingType(String postingType);

    @Query("SELECT * FROM A_Asset_Acct WHERE A_Depreciation_Method_ID = :methodId AND IsActive = 'Y'")
    List<AssetAcct> findByDepreciationMethod(int methodId);

    @Query("SELECT * FROM A_Asset_Acct WHERE A_Depreciation_Table_Header_ID = :tableHeaderId AND IsActive = 'Y'")
    List<AssetAcct> findByDepreciationTable(int tableHeaderId);

    @Query("SELECT * FROM A_Asset_Acct WHERE A_Asset_Spread_Type = :spreadType AND IsActive = 'Y'")
    List<AssetAcct> findByAssetSpreadType(int spreadType);

    @Query("SELECT * FROM A_Asset_Acct WHERE Processing = 'Y' AND IsActive = 'Y'")
    List<AssetAcct> findProcessing();

    @Query("SELECT * FROM A_Asset_Acct WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y'")
    List<AssetAcct> findByClientAndOrg(int clientId, int orgId);

    @Query("SELECT * FROM A_Asset_Acct WHERE IsActive = 'Y'")
    List<AssetAcct> findAllActive();
}
