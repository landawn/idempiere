package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import org.idempiere.model.AssetAddition;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Asset Addition operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface AssetAdditionDao extends CrudDao<AssetAddition, Integer, SQLBuilder.PSC, AssetAdditionDao> {

    @Query("SELECT * FROM A_Asset_Addition WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetAddition> findByAsset(int assetId);

    @Query("SELECT * FROM A_Asset_Addition WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<AssetAddition> findByDocumentNo(String documentNo, int clientId);

    @Query("SELECT * FROM A_Asset_Addition WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetAddition> findByClientAndOrg(int clientId, int orgId);

    @Query("SELECT * FROM A_Asset_Addition WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetAddition> findByDocStatus(String docStatus);

    @Query("SELECT * FROM A_Asset_Addition WHERE C_Invoice_ID = :invoiceId AND IsActive = 'Y'")
    List<AssetAddition> findByInvoice(int invoiceId);

    @Query("SELECT * FROM A_Asset_Addition WHERE A_SourceType = :sourceType AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetAddition> findBySourceType(String sourceType);

    @Query("SELECT * FROM A_Asset_Addition WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetAddition> findProcessed();

    @Query("SELECT * FROM A_Asset_Addition WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetAddition> findUnprocessed();

    @Query("SELECT * FROM A_Asset_Addition WHERE IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetAddition> findAllActive();
}
