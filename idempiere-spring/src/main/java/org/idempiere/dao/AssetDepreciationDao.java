package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.idempiere.model.AssetDepreciation;

import com.landawn.abacus.jdbc.annotation.Cache;
import com.landawn.abacus.jdbc.annotation.Query;
import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;

/**
 * DAO for Asset Depreciation Entry operations.
 * Maps to A_Depreciation_Entry table.
 */
@Cache(capacity = 100, evictDelay = 3000)
public interface AssetDepreciationDao extends CrudDao<AssetDepreciation, Integer, SQLBuilder.PSC, AssetDepreciationDao> {

    @Query("SELECT * FROM A_Depreciation_Entry WHERE C_AcctSchema_ID = :acctSchemaId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findByAcctSchema(int acctSchemaId);

    @Query("SELECT * FROM A_Depreciation_Entry WHERE C_Period_ID = :periodId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findByPeriod(int periodId);

    @Query("SELECT * FROM A_Depreciation_Entry WHERE DateDoc BETWEEN :fromDate AND :toDate AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findByDateRange(LocalDateTime fromDate, LocalDateTime toDate);

    @Query("SELECT * FROM A_Depreciation_Entry WHERE A_Entry_Type = :entryType AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findByEntryType(String entryType);

    @Query("SELECT * FROM A_Depreciation_Entry WHERE PostingType = :postingType AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findByPostingType(String postingType);

    @Query("SELECT * FROM A_Depreciation_Entry WHERE DocStatus = :docStatus AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findByDocStatus(String docStatus);

    @Query("SELECT * FROM A_Depreciation_Entry WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findProcessed();

    @Query("SELECT * FROM A_Depreciation_Entry WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findUnprocessed();

    @Query("SELECT * FROM A_Depreciation_Entry WHERE Posted = :posted AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findByPosted(String posted);

    @Query("SELECT * FROM A_Depreciation_Entry WHERE AD_Client_ID = :clientId AND AD_Org_ID = :orgId AND IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findByClientAndOrg(int clientId, int orgId);

    @Query("SELECT * FROM A_Depreciation_Entry WHERE IsActive = 'Y' ORDER BY DateDoc DESC")
    List<AssetDepreciation> findAllActive();
}
