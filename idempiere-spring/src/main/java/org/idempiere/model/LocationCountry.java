package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Country entity - C_Country table.
 * Country definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Country")
public class LocationCountry extends BaseEntity {

    @Id
    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("CountryCode")
    private String countryCode;

    @Column("C_Region_ID")
    private Integer cRegionId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("HasRegion")
    private String hasRegion;

    @Column("RegionName")
    private String regionName;

    @Column("HasPostal_Add")
    private String hasPostalAdd;

    @Column("IsPostcodeLookup")
    private String isPostcodeLookup;

    @Column("LookupClassName")
    private String lookupClassName;

    @Column("LookupClientID")
    private String lookupClientId;

    @Column("LookupUrl")
    private String lookupUrl;

    @Column("DisplaySequence")
    private String displaySequence;

    @Column("ExpressionPhone")
    private String expressionPhone;

    @Column("MediaSize")
    private String mediaSize;

    @Column("ExpressionPostal")
    private String expressionPostal;

    @Column("ExpressionPostal_Add")
    private String expressionPostalAdd;

    @Column("ExpressionBankAccountNo")
    private String expressionBankAccountNo;

    @Column("ExpressionBankRoutingNo")
    private String expressionBankRoutingNo;

    @Column("AllowCitiesOutOfList")
    private String allowCitiesOutOfList;

    @Column("CaptureSequence")
    private String captureSequence;

    @Column("IsAddressLinesReverse")
    private String isAddressLinesReverse;

    @Column("IsAddressLinesLocalReverse")
    private String isAddressLinesLocalReverse;

    @Column("AD_Language")
    private String adLanguage;
}
