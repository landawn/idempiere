package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.query.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Query;

import org.idempiere.model.BPartner;

/**
 * DAO interface for BPartner entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface BPartnerDao extends CrudDao<BPartner, Integer, SQLBuilder.PSC, BPartnerDao> {

    /**
     * Find a business partner by its value (search key)
     */
    @Query("SELECT * FROM C_BPartner WHERE Value = :value AND IsActive = 'Y'")
    Optional<BPartner> findByValue(String value);

    /**
     * Find a business partner by name
     */
    @Query("SELECT * FROM C_BPartner WHERE Name = :name AND IsActive = 'Y'")
    Optional<BPartner> findByName(String name);

    /**
     * Find a business partner by tax ID
     */
    @Query("SELECT * FROM C_BPartner WHERE TaxID = :taxId AND IsActive = 'Y'")
    Optional<BPartner> findByTaxId(String taxId);

    /**
     * Find all customers for a client
     */
    @Query("SELECT * FROM C_BPartner WHERE AD_Client_ID = :clientId AND IsCustomer = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findCustomersByClientId(Integer clientId);

    /**
     * Find all vendors for a client
     */
    @Query("SELECT * FROM C_BPartner WHERE AD_Client_ID = :clientId AND IsVendor = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findVendorsByClientId(Integer clientId);

    /**
     * Find all employees for a client
     */
    @Query("SELECT * FROM C_BPartner WHERE AD_Client_ID = :clientId AND IsEmployee = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findEmployeesByClientId(Integer clientId);

    /**
     * Find all sales representatives for a client
     */
    @Query("SELECT * FROM C_BPartner WHERE AD_Client_ID = :clientId AND IsSalesRep = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findSalesRepsByClientId(Integer clientId);

    /**
     * Find business partners by group
     */
    @Query("SELECT * FROM C_BPartner WHERE C_BP_Group_ID = :groupId AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findByGroupId(Integer groupId);

    /**
     * Search business partners by name pattern
     */
    @Query("SELECT * FROM C_BPartner WHERE UPPER(Name) LIKE UPPER(:namePattern) AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> searchByName(String namePattern);

    /**
     * Find prospects
     */
    @Query("SELECT * FROM C_BPartner WHERE IsProspect = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findAllProspects();

    /**
     * Find all active business partners
     */
    @Query("SELECT * FROM C_BPartner WHERE IsActive = 'Y' ORDER BY Name")
    List<BPartner> findAllActive();

    /**
     * Find all customers
     */
    @Query("SELECT * FROM C_BPartner WHERE IsCustomer = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findAllCustomers();

    /**
     * Find all vendors
     */
    @Query("SELECT * FROM C_BPartner WHERE IsVendor = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findAllVendors();

    /**
     * Find all employees
     */
    @Query("SELECT * FROM C_BPartner WHERE IsEmployee = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findAllEmployees();

    /**
     * Find business partners by sales rep
     */
    @Query("SELECT * FROM C_BPartner WHERE SalesRep_ID = :salesRepId AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findBySalesRepId(Integer salesRepId);

    /**
     * Find business partners by group
     */
    @Query("SELECT * FROM C_BPartner WHERE C_BP_Group_ID = :bPartnerGroupId AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findByBPartnerGroupId(Integer bPartnerGroupId);
}
