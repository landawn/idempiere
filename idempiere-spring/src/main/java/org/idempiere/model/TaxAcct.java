package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Accounting entity - C_Tax_Acct table.
 * Tax accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Tax_Acct")
public class TaxAcct extends BaseEntity {

    @Id
    @Column("C_Tax_Acct_ID")
    private Integer cTaxAcctId;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("T_Due_Acct")
    private Integer tDueAcct;

    @Column("T_Liability_Acct")
    private Integer tLiabilityAcct;

    @Column("T_Credit_Acct")
    private Integer tCreditAcct;

    @Column("T_Receivables_Acct")
    private Integer tReceivablesAcct;

    @Column("T_Expense_Acct")
    private Integer tExpenseAcct;
}
