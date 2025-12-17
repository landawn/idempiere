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
 * Bank Account Processor entity - C_BankAcctProcessor table.
 * Payment processor configuration per bank account.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankAcctProcessor")
public class BankAcctProcessor extends BaseEntity {

    @Id
    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Id
    @Column("C_PaymentProcessor_ID")
    private Integer cPaymentProcessorId;

    @Column("IsAcceptAMEX")
    private String isAcceptAMEX;

    @Column("IsAcceptMC")
    private String isAcceptMC;

    @Column("IsAcceptVisa")
    private String isAcceptVisa;

    @Column("IsAcceptDiners")
    private String isAcceptDiners;

    @Column("IsAcceptDiscover")
    private String isAcceptDiscover;

    @Column("IsAcceptCorporate")
    private String isAcceptCorporate;

    @Column("IsAcceptCheck")
    private String isAcceptCheck;

    @Column("IsAcceptDirectDebit")
    private String isAcceptDirectDebit;

    @Column("IsAcceptDirectDeposit")
    private String isAcceptDirectDeposit;

    @Column("MinimumAmt")
    private BigDecimal minimumAmt;

    @Column("RequireVV")
    private String requireVV;
}
