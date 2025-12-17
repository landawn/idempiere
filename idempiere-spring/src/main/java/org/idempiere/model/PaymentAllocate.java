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
 * Payment Allocate entity - C_PaymentAllocate table.
 * Payment allocation to invoices.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaymentAllocate")
public class PaymentAllocate extends BaseEntity {

    @Id
    @Column("C_PaymentAllocate_ID")
    private Integer cPaymentAllocateId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

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

    @Column("InvoiceAmt")
    private BigDecimal invoiceAmt;
}
