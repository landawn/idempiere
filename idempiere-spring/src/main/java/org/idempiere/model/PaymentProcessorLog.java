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
 * Payment Processor Log entity - C_PaymentProcessorLog table.
 * Payment processing transaction log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaymentProcessorLog")
public class PaymentProcessorLog extends BaseEntity {

    @Id
    @Column("C_PaymentProcessorLog_ID")
    private Integer cPaymentProcessorLogId;

    @Column("C_PaymentProcessor_ID")
    private Integer cPaymentProcessorId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("TransactionDate")
    private LocalDateTime transactionDate;

    @Column("TrxType")
    private String trxType;

    @Column("TenderType")
    private String tenderType;

    @Column("CreditCardType")
    private String creditCardType;

    @Column("R_PnRef")
    private String rPnRef;

    @Column("R_Result")
    private String rResult;

    @Column("R_RespMsg")
    private String rRespMsg;

    @Column("R_AuthCode")
    private String rAuthCode;

    @Column("R_AvsAddr")
    private String rAvsAddr;

    @Column("R_AvsZip")
    private String rAvsZip;

    @Column("R_CVV2Match")
    private String rCvv2Match;

    @Column("Amt")
    private BigDecimal amt;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsVoided")
    private String isVoided;
}
