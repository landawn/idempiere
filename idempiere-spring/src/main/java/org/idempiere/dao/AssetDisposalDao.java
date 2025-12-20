package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.model.AssetDisposal;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Asset Disposal operations.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface AssetDisposalDao extends CrudDao<AssetDisposal, Integer, SQLBuilder.PSC, AssetDisposalDao> {

    @Query("SELECT * FROM A_Asset_Disposed WHERE A_Asset_ID = :assetId AND IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findByAsset(int assetId);

    @Query("SELECT * FROM A_Asset_Disposed WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findByClientAndOrg(int clientId, int orgId);

    @Query("SELECT * FROM A_Asset_Disposed WHERE A_Disposed_Method = :method AND IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findByDisposalMethod(String method);

    @Query("SELECT * FROM A_Asset_Disposed WHERE A_Disposed_Date BETWEEN :fromDate AND :toDate AND IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findByDateRange(LocalDateTime fromDate, LocalDateTime toDate);

    @Query("SELECT * FROM A_Asset_Disposed WHERE C_Period_ID = :periodId AND IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findByPeriod(int periodId);

    @Query("SELECT * FROM A_Asset_Disposed WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findProcessed();

    @Query("SELECT * FROM A_Asset_Disposed WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findUnprocessed();

    @Query("SELECT * FROM A_Asset_Disposed WHERE PostingType = :postingType AND IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findByPostingType(String postingType);

    @Query("SELECT * FROM A_Asset_Disposed WHERE IsActive = 'Y' ORDER BY A_Disposed_Date DESC")
    List<AssetDisposal> findAllActive();
}
