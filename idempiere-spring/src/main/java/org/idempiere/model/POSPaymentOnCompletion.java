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
 * POS Payment On Completion entity - C_POSPaymentOnCompletion table.
 * Payment generated on order completion from POS.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSPaymentOnCompletion")
public class POSPaymentOnCompletion extends BaseEntity {

    @Id
    @Column("C_POSPaymentOnCompletion_ID")
    private Integer cPOSPaymentOnCompletionId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_POSTerminal_ID")
    private Integer cPOSTerminalId;

    @Column("TenderType")
    private String tenderType;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("C_CashBook_ID")
    private Integer cCashBookId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("CreditCardType")
    private String creditCardType;

    @Column("CreditCardNumber")
    private String creditCardNumber;

    @Column("A_Name")
    private String aName;

    @Column("RoutingNo")
    private String routingNo;

    @Column("AccountNo")
    private String accountNo;

    @Column("CheckNo")
    private String checkNo;

    @Column("Micr")
    private String micr;

    @Column("IsPostDated")
    private String isPostDated;

    @Column("VoiceAuthCode")
    private String voiceAuthCode;
}
