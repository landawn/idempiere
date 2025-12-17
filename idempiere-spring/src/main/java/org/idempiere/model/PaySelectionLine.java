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
 * Pay Selection Line entity - C_PaySelectionLine table.
 * Payment selection line item.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaySelectionLine")
public class PaySelectionLine extends BaseEntity {

    @Id
    @Column("C_PaySelectionLine_ID")
    private Integer cPaySelectionLineId;

    @Column("C_PaySelection_ID")
    private Integer cPaySelectionId;

    @Column("C_PaySelectionCheck_ID")
    private Integer cPaySelectionCheckId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;

    @Column("DifferenceAmt")
    private BigDecimal differenceAmt;

    @Column("OpenAmt")
    private BigDecimal openAmt;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("IsManual")
    private String isManual;

    @Column("Processed")
    private String processed;
}
