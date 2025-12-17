package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Import Fixed Asset entity - I_FixedAsset table.
 * Fixed asset import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_FixedAsset")
public class ImportFixedAsset extends BaseEntity {

    @Id
    @Column("I_FixedAsset_ID")
    private Integer iFixedAssetId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Asset_Group_ID")
    private Integer aAssetGroupId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AssetServiceDate")
    private LocalDateTime assetServiceDate;

    @Column("AssetDisposalDate")
    private LocalDateTime assetDisposalDate;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("UseLifeYears")
    private Integer useLifeYears;

    @Column("UseLifeMonths")
    private Integer useLifeMonths;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("Processed")
    private String processed;
}
