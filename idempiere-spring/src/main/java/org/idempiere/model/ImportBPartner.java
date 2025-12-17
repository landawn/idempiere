package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Business Partner entity.
 * Maps to I_BPartner table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_BPartner")
public class ImportBPartner extends BaseEntity {

    @Id
    @Column("I_BPartner_ID")
    private Integer iBPartnerId;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Name2")
    private String name2;

    @Column("Description")
    private String description;

    @Column("DUNS")
    private String duns;

    @Column("TaxID")
    private String taxId;

    @Column("NAICS")
    private String naics;

    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;

    @Column("GroupValue")
    private String groupValue;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("IsCustomer")
    private String isCustomer;

    @Column("IsVendor")
    private String isVendor;

    @Column("IsEmployee")
    private String isEmployee;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("PaymentRulePO")
    private String paymentRulePo;

    @Column("Address1")
    private String address1;

    @Column("Address2")
    private String address2;

    @Column("Address3")
    private String address3;

    @Column("Address4")
    private String address4;

    @Column("City")
    private String city;

    @Column("PostalCode")
    private String postalCode;

    @Column("RegionName")
    private String regionName;

    @Column("CountryCode")
    private String countryCode;

    @Column("Phone")
    private String phone;

    @Column("Phone2")
    private String phone2;

    @Column("Fax")
    private String fax;

    @Column("EMail")
    private String email;

    @Column("URL")
    private String url;

    @Column("Title")
    private String title;

    @Column("ContactName")
    private String contactName;

    @Column("ContactDescription")
    private String contactDescription;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;
}
