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
 * Allocation Line entity - C_AllocationLine table.
 * Payment allocation line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AllocationLine")
public class CAllocationLine extends BaseEntity {

    @Id
    @Column("C_AllocationLine_ID")
    private Integer cAllocationLineId;

    @Column("C_AllocationHdr_ID")
    private Integer cAllocationHdrId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_CashLine_ID")
    private Integer cCashLineId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("Amount")
    private BigDecimal amount;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("OverUnderAmt")
    private BigDecimal overUnderAmt;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;
}
