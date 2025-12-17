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
 * RMA Line entity - M_RMALine table.
 * Return Material Authorization line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_RMALine")
public class MRMALine extends BaseEntity {

    @Id
    @Column("M_RMALine_ID")
    private Integer mRmaLineId;

    @Column("M_RMA_ID")
    private Integer mRmaId;

    @Column("Amt")
    private BigDecimal amt;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("Description")
    private String description;

    @Column("Line")
    private Integer line;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Processed")
    private String processed;

    @Column("Qty")
    private BigDecimal qty;

    @Column("QtyDelivered")
    private BigDecimal qtyDelivered;

    @Column("QtyInvoiced")
    private BigDecimal qtyInvoiced;

    @Column("Ref_RMALine_ID")
    private Integer refRmaLineId;
}
