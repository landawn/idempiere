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
 * Payment Allocation Line entity - C_PaymentAllocateLine table.
 * Payment allocation line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaymentAllocateLine")
public class PaymentAllocationLine extends BaseEntity {

    @Id
    @Column("C_PaymentAllocateLine_ID")
    private Integer cPaymentAllocateLineId;

    @Column("C_PaymentAllocateHdr_ID")
    private Integer cPaymentAllocateHdrId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("Amount")
    private BigDecimal amount;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;

    @Column("OverUnderAmt")
    private BigDecimal overUnderAmt;

    @Column("Line")
    private Integer line;
}
