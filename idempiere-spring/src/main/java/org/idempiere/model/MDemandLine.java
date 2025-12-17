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
 * Demand Line entity - M_DemandLine table.
 * Material demand line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_DemandLine")
public class MDemandLine extends BaseEntity {

    @Id
    @Column("M_DemandLine_ID")
    private Integer mDemandLineId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("M_Demand_ID")
    private Integer mDemandId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Processed")
    private String processed;

    @Column("Qty")
    private BigDecimal qty;

    @Column("QtyCalculated")
    private BigDecimal qtyCalculated;
}
