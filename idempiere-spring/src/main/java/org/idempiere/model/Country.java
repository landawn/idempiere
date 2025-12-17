package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Country entity.
 * Maps to C_Country table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Country")
public class Country extends BaseEntity {

    @Id
    @Column("C_Country_ID")
    private Integer cCountryId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("CountryCode")
    private String countryCode;

    @Column("AD_Language")
    private String adLanguage;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("HasRegion")
    private String hasRegion;

    @Column("RegionName")
    private String regionName;

    @Column("DisplaySequence")
    private String displaySequence;

    @Column("DisplaySequenceLocal")
    private String displaySequenceLocal;

    @Column("ExpressionPhone")
    private String expressionPhone;

    @Column("ExpressionPostal")
    private String expressionPostal;

    @Column("ExpressionPostal_Add")
    private String expressionPostalAdd;

    @Column("ExpressionBankRoutingNo")
    private String expressionBankRoutingNo;

    @Column("ExpressionBankAccountNo")
    private String expressionBankAccountNo;

    @Column("MediaSize")
    private String mediaSize;

    @Column("IsPostcodeLookup")
    private String isPostcodeLookup;

    @Column("LookupClassName")
    private String lookupClassName;

    @Column("LookupClientID")
    private String lookupClientID;

    @Column("LookupUrl")
    private String lookupUrl;

    @Column("IsAddressLinesLocalReverse")
    private String isAddressLinesLocalReverse;

    @Column("IsAddressLinesReverse")
    private String isAddressLinesReverse;

    @Column("CaptureSequence")
    private String captureSequence;

    @Column("AllowCitiesOutOfList")
    private String allowCitiesOutOfList;

    @Column("IsPostalCodeMandatory")
    private String isPostalCodeMandatory;
}
