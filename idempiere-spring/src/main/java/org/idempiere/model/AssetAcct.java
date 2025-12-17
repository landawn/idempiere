package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Accounting entity.
 * Maps to A_Asset_Acct table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Acct")
public class AssetAcct extends BaseEntity {

    @Id
    @Column("A_Asset_Acct_ID")
    private Integer aAssetAcctId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("A_Asset_Acct")
    private Integer aAssetAcct;

    @Column("A_Depreciation_Acct")
    private Integer aDepreciationAcct;

    @Column("A_Accumdepreciation_Acct")
    private Integer aAccumdepreciationAcct;

    @Column("A_Disposal_Loss_Acct")
    private Integer aDisposalLossAcct;

    @Column("A_Disposal_Gain_Acct")
    private Integer aDisposalGainAcct;

    @Column("A_Disposal_Revenue_Acct")
    private Integer aDisposalRevenueAcct;

    @Column("PostingType")
    private String postingType;

    @Column("A_Depreciation_Manual_Amount")
    private BigDecimal aDepreciationManualAmount;

    @Column("A_Depreciation_Manual_Period")
    private String aDepreciationManualPeriod;

    @Column("A_Depreciation_Variable_Perc")
    private BigDecimal aDepreciationVariablePerc;

    @Column("A_Depreciation_Table_Header_ID")
    private Integer aDepreciationTableHeaderId;

    @Column("A_Asset_Spread_Type")
    private Integer aAssetSpreadType;

    @Column("A_Depreciation_Conv_F_ID")
    private Integer aDepreciationConvFId;

    @Column("A_Depreciation_Method_ID")
    private Integer aDepreciationMethodId;

    @Column("A_Period_Start")
    private Integer aPeriodStart;

    @Column("A_Period_End")
    private Integer aPeriodEnd;

    @Column("A_Split_Percent")
    private BigDecimal aSplitPercent;

    @Column("A_Salvage_Value")
    private BigDecimal aSalvageValue;

    @Column("UseLifeYears")
    private Integer useLifeYears;

    @Column("UseLifeMonths")
    private Integer useLifeMonths;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("Processing")
    private String processing;
}
