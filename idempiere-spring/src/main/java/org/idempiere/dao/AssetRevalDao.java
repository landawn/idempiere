package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.model.AssetReval;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Asset Revaluation operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface AssetRevalDao extends CrudDao<AssetReval, Integer, SQLBuilder.PSC, AssetRevalDao> {

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findByAsset(int assetId);

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE DocumentNo = :documentNo AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<AssetReval> findByDocumentNo(String documentNo, int clientId);

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findByClientAndOrg(int clientId, int orgId);

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE C_Period_ID = :periodId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findByPeriod(int periodId);

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE DateDoc BETWEEN :fromDate AND :toDate AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findByDateRange(LocalDateTime fromDate, LocalDateTime toDate);

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findByDocStatus(String docStatus);

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findProcessed();

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findUnprocessed();

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE PostingType = :postingType AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findByPostingType(String postingType);

    @Query("SELECT * FROM A_Asset_Reval_Entry WHERE IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetReval> findAllActive();
}
