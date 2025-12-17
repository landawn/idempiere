package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.Organization;

/**
 * DAO interface for Organization entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface OrganizationDao extends CrudDao<Organization, Integer, SQLBuilder.NSC, OrganizationDao> {

    /**
     * Find an organization by its value (short name/code)
     */
    @Select("SELECT * FROM AD_Org WHERE Value = :value AND IsActive = 'Y'")
    Optional<Organization> findByValue(String value);

    /**
     * Find all active organizations for a specific client
     */
    @Select("SELECT * FROM AD_Org WHERE AD_Client_ID = :clientId AND IsActive = 'Y' ORDER BY Name")
    List<Organization> findByClientId(Integer clientId);

    /**
     * Find organization by name within a client
     */
    @Select("SELECT * FROM AD_Org WHERE Name = :name AND AD_Client_ID = :clientId AND IsActive = 'Y'")
    Optional<Organization> findByNameAndClientId(String name, Integer clientId);

    /**
     * Find all non-summary organizations
     */
    @Select("SELECT * FROM AD_Org WHERE IsSummary = 'N' AND IsActive = 'Y' ORDER BY Name")
    List<Organization> findAllTransactional();
}
