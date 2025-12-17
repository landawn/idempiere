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
 * Invoice Line Landed Cost entity - C_InvoiceLine_LandedCost table.
 * Invoice line landed cost allocation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InvoiceLine_LandedCost")
public class InvoiceLineLandedCost extends BaseEntity {

    @Id
    @Column("C_InvoiceLine_LandedCost_ID")
    private Integer cInvoiceLineLandedCostId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_LandedCostDistribution")
    private String mLandedCostDistribution;

    @Column("LandedCostAmt")
    private BigDecimal landedCostAmt;

    @Column("Base")
    private BigDecimal base;
}
