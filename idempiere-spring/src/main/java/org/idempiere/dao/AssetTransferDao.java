package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.model.AssetTransfer;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Asset Transfer operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface AssetTransferDao extends CrudDao<AssetTransfer, Integer, SQLBuilder.PSC, AssetTransferDao> {

    @Query("SELECT * FROM A_Asset_Transfer WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findByAsset(int assetId);

    @Query("SELECT * FROM A_Asset_Transfer WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<AssetTransfer> findByDocumentNo(String documentNo, int clientId);

    @Query("SELECT * FROM A_Asset_Transfer WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findByClientAndOrg(int clientId, int orgId);

    @Query("SELECT * FROM A_Asset_Transfer WHERE C_Period_ID = :periodId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findByPeriod(int periodId);

    @Query("SELECT * FROM A_Asset_Transfer WHERE DateDoc BETWEEN :fromDate AND :toDate AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findByDateRange(LocalDateTime fromDate, LocalDateTime toDate);

    @Query("SELECT * FROM A_Asset_Transfer WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findByDocStatus(String docStatus);

    @Query("SELECT * FROM A_Asset_Transfer WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findProcessed();

    @Query("SELECT * FROM A_Asset_Transfer WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findUnprocessed();

    @Query("SELECT * FROM A_Asset_Transfer WHERE PostingType = :postingType AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findByPostingType(String postingType);

    @Query("SELECT * FROM A_Asset_Transfer WHERE A_Asset_Acct_ID = :assetAcctId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findByAssetAcct(int assetAcctId);

    @Query("SELECT * FROM A_Asset_Transfer WHERE IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetTransfer> findAllActive();
}
