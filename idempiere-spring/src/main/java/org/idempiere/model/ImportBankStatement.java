package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Import Bank Statement entity - I_BankStatement table.
 * Bank statement import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_BankStatement")
public class ImportBankStatement extends BaseEntity {

    @Id
    @Column("I_BankStatement_ID")
    private Integer iBankStatementId;

    @Column("C_BankStatement_ID")
    private Integer cBankStatementId;

    @Column("C_BankStatementLine_ID")
    private Integer cBankStatementLineId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("BankAccountNo")
    private String bankAccountNo;

    @Column("RoutingNo")
    private String routingNo;

    @Column("StatementDate")
    private LocalDateTime statementDate;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("ValutaDate")
    private LocalDateTime valutaDate;

    @Column("Line")
    private Integer line;

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

    @Column("EftTrxID")
    private String eftTrxID;

    @Column("EftTrxType")
    private String eftTrxType;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("Processed")
    private String processed;
}
