package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Accounting Schema GL entity.
 * Maps to C_AcctSchema_GL table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctSchema_GL")
public class AcctSchemaGL extends BaseEntity {

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("UseSuspenseBalancing")
    private String useSuspenseBalancing;

    @Column("SuspenseBalancing_Acct")
    private Integer suspenseBalancingAcct;

    @Column("UseSuspenseError")
    private String useSuspenseError;

    @Column("SuspenseError_Acct")
    private Integer suspenseErrorAcct;

    @Column("UseCurrencyBalancing")
    private String useCurrencyBalancing;

    @Column("CurrencyBalancing_Acct")
    private Integer currencyBalancingAcct;

    @Column("RetainedEarning_Acct")
    private Integer retainedEarningAcct;

    @Column("IncomeSummary_Acct")
    private Integer incomeSummaryAcct;

    @Column("IntercompanyDueTo_Acct")
    private Integer intercompanyDueToAcct;

    @Column("IntercompanyDueFrom_Acct")
    private Integer intercompanyDueFromAcct;

    @Column("PPVOffset_Acct")
    private Integer ppvOffsetAcct;

    @Column("CommitmentOffset_Acct")
    private Integer commitmentOffsetAcct;

    @Column("CommitmentOffsetSales_Acct")
    private Integer commitmentOffsetSalesAcct;
}
