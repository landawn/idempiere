package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Campaign;

/**
 * DAO interface for Campaign entity operations.
 */
public interface CampaignDao extends CrudDao<Campaign, Integer, SQLBuilder.PSC, CampaignDao> {

    @Query("SELECT * FROM C_Campaign WHERE Value = :value AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Campaign> findByValueAndClient(String value, Integer clientId);

    @Query("SELECT * FROM C_Campaign WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Campaign> findByNameAndClient(String name, Integer clientId);

    @Query("SELECT * FROM C_Campaign WHERE StartDate <= :currentDate AND (EndDate IS NULL OR EndDate >= :currentDate) AND IsActive = 'Y' ORDER BY Name")
    List<Campaign> findActiveCampaigns(java.time.LocalDateTime currentDate);

    @Query("SELECT * FROM C_Campaign WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Campaign> findByClient(Integer clientId);

    @Query("SELECT * FROM C_Campaign WHERE IsActive = 'Y' ORDER BY Name")
    List<Campaign> findAllActive();
}
