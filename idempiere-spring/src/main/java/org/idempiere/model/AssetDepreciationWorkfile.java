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
 * Asset Depreciation Workfile entity - A_Depreciation_Workfile table.
 * Asset depreciation workfile for calculation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Workfile")
public class AssetDepreciationWorkfile extends BaseEntity {

    @Id
    @Column("A_Depreciation_Workfile_ID")
    private Integer aDepreciationWorkfileId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("PostingType")
    private String postingType;

    @Column("A_QTY_Current")
    private BigDecimal aQtyCurrent;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Period_Forecast")
    private BigDecimal aPeriodForecast;

    @Column("A_Period_Posted")
    private BigDecimal aPeriodPosted;

    @Column("A_Current_Period")
    private Integer aCurrentPeriod;

    @Column("A_Life_Period")
    private Integer aLifePeriod;

    @Column("A_Salvage_Value")
    private BigDecimal aSalvageValue;

    @Column("A_Asset_Life_Years")
    private Integer aAssetLifeYears;

    @Column("A_Base_Amount")
    private BigDecimal aBaseAmount;

    @Column("A_Calc_Accumulated_Depr")
    private BigDecimal aCalcAccumulatedDepr;

    @Column("A_Depreciation_Workfile_UU")
    private String aDepreciationWorkfileUU;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("IsDepreciated")
    private String isDepreciated;
}
