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
 * Bank Statement Line entity - individual bank statement transactions.
 * Maps to C_BankStatementLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankStatementLine")
public class BankStatementLine extends BaseEntity {

    @Id
    @Column("C_BankStatementLine_ID")
    private Integer cBankStatementLineId;

    @Column("C_BankStatement_ID")
    private Integer cBankStatementId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("ValutaDate")
    private LocalDateTime valutaDate;

    @Column("IsReversal")
    private String isReversal;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("TrxAmt")
    private BigDecimal trxAmt;

    @Column("StmtAmt")
    private BigDecimal stmtAmt;

    @Column("ChargeAmt")
    private BigDecimal chargeAmt;

    @Column("InterestAmt")
    private BigDecimal interestAmt;

    @Column("Memo")
    private String memo;

    @Column("ReferenceNo")
    private String referenceNo;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("IsManual")
    private String isManual;

    @Column("IsReconciled")
    private String isReconciled;

    @Column("EftTrxID")
    private String eftTrxId;

    @Column("EftTrxType")
    private String eftTrxType;

    @Column("EftCheckNo")
    private String eftCheckNo;

    @Column("EftReference")
    private String eftReference;

    @Column("EftMemo")
    private String eftMemo;

    @Column("EftPayee")
    private String eftPayee;

    @Column("EftPayeeAccount")
    private String eftPayeeAccount;

    @Column("EftStatementLineDate")
    private LocalDateTime eftStatementLineDate;

    @Column("EftValutaDate")
    private LocalDateTime eftValutaDate;

    @Column("EftCurrency")
    private String eftCurrency;

    @Column("EftAmt")
    private BigDecimal eftAmt;

    @Column("MatchStatement")
    private String matchStatement;

    @Column("CreatePayment")
    private String createPayment;
}
