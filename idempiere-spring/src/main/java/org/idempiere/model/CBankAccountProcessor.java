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
 * Bank Account Processor entity - C_BankAccount_Processor table.
 * Payment processor association with bank account.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankAccount_Processor")
public class CBankAccountProcessor extends BaseEntity {

    @Id
    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Id
    @Column("C_PaymentProcessor_ID")
    private Integer cPaymentProcessorId;

    @Column("AcceptAMEX")
    private String acceptAMEX;

    @Column("AcceptCheck")
    private String acceptCheck;

    @Column("AcceptCorporate")
    private String acceptCorporate;

    @Column("AcceptDiners")
    private String acceptDiners;

    @Column("AcceptDirectDebit")
    private String acceptDirectDebit;

    @Column("AcceptDirectDeposit")
    private String acceptDirectDeposit;

    @Column("AcceptDiscover")
    private String acceptDiscover;

    @Column("AcceptMC")
    private String acceptMC;

    @Column("AcceptVisa")
    private String acceptVisa;

    @Column("MinimumAmt")
    private BigDecimal minimumAmt;

    @Column("RequireVV")
    private String requireVV;

    @Column("Sequence")
    private Integer sequence;
}
