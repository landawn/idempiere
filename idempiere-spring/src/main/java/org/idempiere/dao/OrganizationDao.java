package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.Organization;

/**
 * DAO interface for Organization entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface OrganizationDao extends CrudDao<Organization, Integer, SQLBuilder.PSC, OrganizationDao> {

    /**
     * Find an organization by its value (short name/code)
     */
    @Query("SELECT * FROM AD_Org WHERE Value = :value AND IsActive = 'Y'")
    Optional<Organization> findByValue(String value);

    /**
     * Find all active organizations for a specific client
     */
    @Query("SELECT * FROM AD_Org WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Organization> findByClientId(Integer clientId);

    /**
     * Find organization by name within a client
     */
    @Query("SELECT * FROM AD_Org WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Organization> findByNameAndClientId(String name, Integer clientId);

    /**
     * Find all non-summary organizations
     */
    @Query("SELECT * FROM AD_Org WHERE IsSummary = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<Organization> findAllTransactional();

    /**
     * Find all active organizations
     */
    @Query("SELECT * FROM AD_Org WHERE IsActive = 'Y' ORDER BY Name")
    List<Organization> findAllActive();

    /**
     * Find all organizations including inactive
     */
    @Query("SELECT * FROM AD_Org ORDER BY Name")
    List<Organization> findAll();

    /**
     * Find all summary organizations
     */
    @Query("SELECT * FROM AD_Org WHERE IsSummary = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<Organization> findSummaryOrganizations();
}
