package org.idempiere.dao;

import java.util.List;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.DunningRunEntry;

/**
 * DAO interface for DunningRunEntry entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface DunningRunEntryDao extends CrudDao<DunningRunEntry, Integer, SQLBuilder.PSC, DunningRunEntryDao> {

    /**
     * Find all dunning run entries for a dunning run
     */
    @Query("SELECT * FROM C_DunningRunEntry WHERE C_DunningRun_ID = :dunningRunId AND IsActive = 'Y' ORDER BY C_BPartner_ID")
    List<DunningRunEntry> findByDunningRun(Integer dunningRunId);

    /**
     * Find dunning run entries by business partner
     */
    @Query("SELECT * FROM C_DunningRunEntry WHERE C_BPartner_ID = :bpartnerId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunEntry> findByBPartner(Integer bpartnerId);

    /**
     * Find dunning run entries by dunning level
     */
    @Query("SELECT * FROM C_DunningRunEntry WHERE C_DunningLevel_ID = :dunningLevelId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunEntry> findByDunningLevel(Integer dunningLevelId);

    /**
     * Find processed dunning run entries
     */
    @Query("SELECT * FROM C_DunningRunEntry WHERE Processed = 'Y' AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunEntry> findProcessed();

    /**
     * Find unprocessed dunning run entries
     */
    @Query("SELECT * FROM C_DunningRunEntry WHERE Processed = 'N' AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunEntry> findUnprocessed();

    /**
     * Find dunning run entries by business partner location
     */
    @Query("SELECT * FROM C_DunningRunEntry WHERE C_BPartner_Location_ID = :locationId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunEntry> findByBPartnerLocation(Integer locationId);

    /**
     * Find dunning run entries by sales representative
     */
    @Query("SELECT * FROM C_DunningRunEntry WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunEntry> findBySalesRep(Integer salesRepId);

    /**
     * Find dunning run entries by currency
     */
    @Query("SELECT * FROM C_DunningRunEntry WHERE C_Currency_ID = :currencyId AND IsActive = 'Y' ORDER BY Created DESC")
    List<DunningRunEntry> findByCurrency(Integer currencyId);
}
