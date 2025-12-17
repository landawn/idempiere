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
 * Asset Change entity - A_Asset_Change table.
 * Asset change history.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Change")
public class AssetChange extends BaseEntity {

    @Id
    @Column("A_Asset_Change_ID")
    private Integer aAssetChangeId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("ChangeType")
    private String changeType;

    @Column("ChangeDate")
    private LocalDateTime changeDate;

    @Column("TextDetails")
    private String textDetails;

    @Column("A_Parent_Asset_ID")
    private Integer aParentAssetId;

    @Column("AssetValueAmt")
    private BigDecimal assetValueAmt;

    @Column("AssetServiceDate")
    private LocalDateTime assetServiceDate;

    @Column("A_Depreciation_ID")
    private Integer aDepreciationId;

    @Column("A_Depreciation_Method_ID")
    private Integer aDepreciationMethodId;

    @Column("A_Depreciation_Conv_ID")
    private Integer aDepreciationConvId;

    @Column("UseLifeYears")
    private Integer useLifeYears;

    @Column("UseLifeMonths")
    private Integer useLifeMonths;

    @Column("A_Salvage_Value")
    private BigDecimal aSalvageValue;

    @Column("A_Asset_Acct_ID")
    private Integer aAssetAcctId;

    @Column("PostingType")
    private String postingType;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Processed")
    private String processed;
}
