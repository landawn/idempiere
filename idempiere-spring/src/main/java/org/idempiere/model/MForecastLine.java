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
 * Forecast Line entity - M_ForecastLine table.
 * Material forecast line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ForecastLine")
public class MForecastLine extends BaseEntity {

    @Id
    @Column("M_ForecastLine_ID")
    private Integer mForecastLineId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("M_Forecast_ID")
    private Integer mForecastId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Processed")
    private String processed;

    @Column("Qty")
    private BigDecimal qty;

    @Column("QtyCalculated")
    private BigDecimal qtyCalculated;

    @Column("SalesRep_ID")
    private Integer salesRepId;
}
