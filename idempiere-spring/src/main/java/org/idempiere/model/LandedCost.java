package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Landed Cost entity - C_LandedCost table.
 * Landed cost header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_LandedCost")
public class LandedCost extends BaseEntity {

    @Id
    @Column("C_LandedCost_ID")
    private Integer cLandedCostId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("LandedCostDistribution")
    private String landedCostDistribution;

    @Column("Amt")
    private BigDecimal amt;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
