package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Bank Account Accounting entity - C_BankAccount_Acct table.
 * Bank account accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankAccount_Acct")
public class BankAccountAcct extends BaseEntity {

    @Id
    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("B_Asset_Acct")
    private Integer bAssetAcct;

    @Column("B_InTransit_Acct")
    private Integer bInTransitAcct;

    @Column("B_UnallocatedCash_Acct")
    private Integer bUnallocatedCashAcct;

    @Column("B_Expense_Acct")
    private Integer bExpenseAcct;

    @Column("B_InterestRev_Acct")
    private Integer bInterestRevAcct;

    @Column("B_InterestExp_Acct")
    private Integer bInterestExpAcct;

    @Column("B_PaymentSelect_Acct")
    private Integer bPaymentSelectAcct;

    @Column("B_SettlementGain_Acct")
    private Integer bSettlementGainAcct;

    @Column("B_SettlementLoss_Acct")
    private Integer bSettlementLossAcct;

    @Column("B_RevaluationGain_Acct")
    private Integer bRevaluationGainAcct;

    @Column("B_RevaluationLoss_Acct")
    private Integer bRevaluationLossAcct;
}
