package org.idempiere.dao;

import java.time.LocalDateTime;
import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.DunningRun;

/**
 * DAO interface for DunningRun entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface DunningRunDao extends CrudDao<DunningRun, Integer, SQLBuilder.PSC, DunningRunDao> {

    /**
     * Find all dunning runs for a dunning level
     */
    @Query("SELECT * FROM C_DunningRun WHERE C_DunningLevel_ID = :dunningLevelId AND IsActive = 'Y' ORDER BY DunningDate DESC")
    List<DunningRun> findByDunningLevel(Integer dunningLevelId);

    /**
     * Find dunning runs by business partner
     */
    @Query("SELECT * FROM C_DunningRun WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY DunningDate DESC")
    List<DunningRun> findByBPartner(Integer bpartnerId);

    /**
     * Find processed dunning runs
     */
    @Query("SELECT * FROM C_DunningRun WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY DunningDate DESC")
    List<DunningRun> findProcessed();

    /**
     * Find unprocessed dunning runs
     */
    @Query("SELECT * FROM C_DunningRun WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY DunningDate DESC")
    List<DunningRun> findUnprocessed();

    /**
     * Find dunning runs by date range
     */
    @Query("SELECT * FROM C_DunningRun WHERE DunningDate >= :startDate AND DunningDate <= :endDate AND IsActive = 'Y' ORDER BY DunningDate DESC")
    List<DunningRun> findByDateRange(LocalDateTime startDate, LocalDateTime endDate);

    /**
     * Find dunning runs by client
     */
    @Query("SELECT * FROM C_DunningRun WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY DunningDate DESC")
    List<DunningRun> findByClient(Integer clientId);

    /**
     * Find dunning runs by sales representative
     */
    @Query("SELECT * FROM C_DunningRun WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY DunningDate DESC")
    List<DunningRun> findBySalesRep(Integer salesRepId);

    /**
     * Find dunning runs by business partner group
     */
    @Query("SELECT * FROM C_DunningRun WHERE C_BP_Group_ID = :bpGroupId AND IsActive = 'Y' ORDER BY DunningDate DESC")
    List<DunningRun> findByBPGroup(Integer bpGroupId);

    /**
     * Find dunning runs ready to send
     */
    @Query("SELECT * FROM C_DunningRun WHERE SendIt = 'Y' AND Processed = 'N' AND IsActive = 'Y' ORDER BY DunningDate")
    List<DunningRun> findReadyToSend();

    /**
     * Find dunning runs by dunning (via dunning level)
     */
    @Query("SELECT dr.* FROM C_DunningRun dr " +
            "INNER JOIN C_DunningLevel dl ON dr.C_DunningLevel_ID = dl.C_DunningLevel_ID " +
            "WHERE dl.C_Dunning_ID = :dunningId AND dr.IsActive = 'Y' ORDER BY dr.DunningDate DESC")
    List<DunningRun> findByDunning(Integer dunningId);
}
