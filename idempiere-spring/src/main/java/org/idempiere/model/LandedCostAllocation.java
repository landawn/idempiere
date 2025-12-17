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
 * Landed Cost Allocation entity - C_LandedCostAllocation table.
 * Landed cost allocation detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_LandedCostAllocation")
public class LandedCostAllocation extends BaseEntity {

    @Id
    @Column("C_LandedCostAllocation_ID")
    private Integer cLandedCostAllocationId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Amt")
    private BigDecimal amt;

    @Column("Base")
    private BigDecimal base;
}
