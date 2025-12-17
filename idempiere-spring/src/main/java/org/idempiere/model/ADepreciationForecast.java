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
 * A Depreciation Forecast entity - A_Depreciation_Forecast table.
 * Depreciation Forecast.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Forecast")
public class ADepreciationForecast extends BaseEntity {

    @Id
    @Column("A_Depreciation_Forecast_ID")
    private Integer aDepreciationForecastId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Asset_Acct_ID")
    private Integer aAssetAcctId;

    @Column("A_Period")
    private Integer aPeriod;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("PostingType")
    private String postingType;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Asset_Remaining")
    private BigDecimal aAssetRemaining;

    @Column("A_Calc_Accumulated_Depr")
    private BigDecimal aCalcAccumulatedDepr;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
