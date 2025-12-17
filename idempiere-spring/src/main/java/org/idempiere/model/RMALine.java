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
 * RMA Line entity.
 * Maps to M_RMALine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_RMALine")
public class RMALine extends BaseEntity {

    @Id
    @Column("M_RMALine_ID")
    private Integer mRmaLineId;

    @Column("M_RMA_ID")
    private Integer mRmaId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("QtyDelivered")
    private BigDecimal qtyDelivered;

    @Column("QtyInvoiced")
    private BigDecimal qtyInvoiced;

    @Column("Amt")
    private BigDecimal amt;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("Processed")
    private String processed;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("Ref_RMALine_ID")
    private Integer refRmaLineId;
}
