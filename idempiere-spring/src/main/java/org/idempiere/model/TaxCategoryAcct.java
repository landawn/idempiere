package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Tax Category Accounting entity - C_TaxCategory_Acct table.
 * Tax category accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxCategory_Acct")
public class TaxCategoryAcct extends BaseEntity {

    @Id
    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("T_Due_Acct")
    private Integer tDueAcct;

    @Column("T_Credit_Acct")
    private Integer tCreditAcct;

    @Column("T_Expense_Acct")
    private Integer tExpenseAcct;

    @Column("T_Liability_Acct")
    private Integer tLiabilityAcct;

    @Column("T_Receivables_Acct")
    private Integer tReceivablesAcct;
}
