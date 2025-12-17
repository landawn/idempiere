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
 * Allocation Line entity.
 * Maps to C_AllocationLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AllocationLine")
public class AllocationLine extends BaseEntity {

    @Id
    @Column("C_AllocationLine_ID")
    private Integer cAllocationLineId;

    @Column("C_AllocationHdr_ID")
    private Integer cAllocationHdrId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_CashLine_ID")
    private Integer cCashLineId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("Amount")
    private BigDecimal amount;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;

    @Column("OverUnderAmt")
    private BigDecimal overUnderAmt;

    @Column("IsManual")
    private String isManual;
}
