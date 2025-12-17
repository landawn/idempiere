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
 * Depreciation Forecast entity.
 * Maps to A_Depreciation_Forecast table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Forecast")
public class DepreciationForecast extends BaseEntity {

    @Id
    @Column("A_Depreciation_Forecast_ID")
    private Integer aDepreciationForecastId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("PostingType")
    private String postingType;

    @Column("A_Period")
    private Integer aPeriod;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Depreciation_Amount")
    private BigDecimal aDepreciationAmount;

    @Column("A_Asset_Remaining")
    private BigDecimal aAssetRemaining;
}
