package org.idempiere.dao;

import java.util.List;
import java.util.Optional;

import com.landawn.abacus.jdbc.dao.CrudDao;
import com.landawn.abacus.jdbc.SQLBuilder;
import com.landawn.abacus.jdbc.annotation.Select;

import org.idempiere.model.BPartner;

/**
 * DAO interface for BPartner entity operations.
 * Extends CrudDao for standard CRUD operations.
 */
public interface BPartnerDao extends CrudDao<BPartner, Integer, SQLBuilder.NSC, BPartnerDao> {

    /**
     * Find a business partner by its value (search key)
     */
    @Select("SELECT * FROM C_BPartner WHERE Value = :value AND IsActive = 'Y'")
    Optional<BPartner> findByValue(String value);

    /**
     * Find a business partner by name
     */
    @Select("SELECT * FROM C_BPartner WHERE Name = :name AND IsActive = 'Y'")
    Optional<BPartner> findByName(String name);

    /**
     * Find a business partner by tax ID
     */
    @Select("SELECT * FROM C_BPartner WHERE TaxID = :taxId AND IsActive = 'Y'")
    Optional<BPartner> findByTaxId(String taxId);

    /**
     * Find all customers for a client
     */
    @Select("SELECT * FROM C_BPartner WHERE AD_Client_ID = :clientId AND IsCustomer = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findCustomersByClientId(Integer clientId);

    /**
     * Find all vendors for a client
     */
    @Select("SELECT * FROM C_BPartner WHERE AD_Client_ID = :clientId AND IsVendor = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findVendorsByClientId(Integer clientId);

    /**
     * Find all employees for a client
     */
    @Select("SELECT * FROM C_BPartner WHERE AD_Client_ID = :clientId AND IsEmployee = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findEmployeesByClientId(Integer clientId);

    /**
     * Find all sales representatives for a client
     */
    @Select("SELECT * FROM C_BPartner WHERE AD_Client_ID = :clientId AND IsSalesRep = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findSalesRepsByClientId(Integer clientId);

    /**
     * Find business partners by group
     */
    @Select("SELECT * FROM C_BPartner WHERE C_BP_Group_ID = :groupId AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findByGroupId(Integer groupId);

    /**
     * Search business partners by name pattern
     */
    @Select("SELECT * FROM C_BPartner WHERE UPPER(Name) LIKE UPPER(:namePattern) AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> searchByName(String namePattern);

    /**
     * Find prospects
     */
    @Select("SELECT * FROM C_BPartner WHERE IsProspect = 'Y' AND IsActive = 'Y' ORDER BY Name")
    List<BPartner> findAllProspects();
}
