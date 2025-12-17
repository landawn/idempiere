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
 * Forecast Line entity.
 * Maps to M_ForecastLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ForecastLine")
public class ForecastLine extends BaseEntity {

    @Id
    @Column("M_ForecastLine_ID")
    private Integer mForecastLineId;

    @Column("M_Forecast_ID")
    private Integer mForecastId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("Qty")
    private BigDecimal qty;

    @Column("QtyCalculated")
    private BigDecimal qtyCalculated;

    @Column("SalesRep_ID")
    private Integer salesRepId;
}
