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
 * Line item in pay selection.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaySelectionLine")
public class CPaySelectionLine extends BaseEntity {

    @Id
    @Column("C_PaySelectionLine_ID")
    private Integer cPaySelectionLineId;

    @Column("C_PaySelection_ID")
    private Integer cPaySelectionId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_PaySelectionCheck_ID")
    private Integer cPaySelectionCheckId;

    @Column("Description")
    private String description;

    @Column("DifferenceAmt")
    private BigDecimal differenceAmt;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("IsManual")
    private String isManual;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("Line")
    private Integer line;

    @Column("OpenAmt")
    private BigDecimal openAmt;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("Processed")
    private String processed;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;
}
