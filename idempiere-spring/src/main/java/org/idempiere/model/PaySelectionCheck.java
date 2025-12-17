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
 * Pay Selection Check entity - C_PaySelectionCheck table.
 * Payment selection check/payment instrument.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaySelectionCheck")
public class PaySelectionCheck extends BaseEntity {

    @Id
    @Column("C_PaySelectionCheck_ID")
    private Integer cPaySelectionCheckId;

    @Column("C_PaySelection_ID")
    private Integer cPaySelectionId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_BP_BankAccount_ID")
    private Integer cBpBankAccountId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;

    @Column("Qty")
    private Integer qty;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("IsReceipt")
    private String isReceipt;

    @Column("IsGeneratedDraft")
    private String isGeneratedDraft;

    @Column("Processed")
    private String processed;
}
