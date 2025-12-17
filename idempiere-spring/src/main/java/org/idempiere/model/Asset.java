package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Fixed Asset entity.
 * Maps to A_Asset table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset")
public class Asset extends BaseEntity {

    @Id
    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("A_Asset_Group_ID")
    private Integer aAssetGroupId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("SerNo")
    private String serNo;

    @Column("Lot")
    private String lot;

    @Column("VersionNo")
    private String versionNo;

    @Column("GuaranteeDate")
    private LocalDateTime guaranteeDate;

    @Column("AssetServiceDate")
    private LocalDateTime assetServiceDate;

    @Column("AssetActivationDate")
    private LocalDateTime assetActivationDate;

    @Column("AssetDisposalDate")
    private LocalDateTime assetDisposalDate;

    @Column("UseLifeYears")
    private Integer useLifeYears;

    @Column("UseLifeMonths")
    private Integer useLifeMonths;

    @Column("LifeUseUnits")
    private Integer lifeUseUnits;

    @Column("UseUnits")
    private Integer useUnits;

    @Column("A_Asset_RevalDate")
    private LocalDateTime aAssetRevalDate;

    @Column("AssetDepreciationDate")
    private LocalDateTime assetDepreciationDate;

    @Column("A_Depreciation_ID")
    private Integer aDepreciationId;

    @Column("A_Asset_Type_ID")
    private Integer aAssetTypeId;

    @Column("IsOwned")
    private String isOwned;

    @Column("IsInPosession")
    private String isInPosession;

    @Column("IsFullyDepreciated")
    private String isFullyDepreciated;

    @Column("IsDisposed")
    private String isDisposed;

    @Column("IsDepreciated")
    private String isDepreciated;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("LocationComment")
    private String locationComment;

    @Column("Qty")
    private BigDecimal qty;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("A_Parent_Asset_ID")
    private Integer aParentAssetId;

    @Column("A_QTY_Current")
    private BigDecimal aQtyCurrent;

    @Column("A_QTY_Original")
    private BigDecimal aQtyOriginal;
}
