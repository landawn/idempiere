package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Charge Accounting entity - C_Charge_Acct table.
 * Charge accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Charge_Acct")
public class ChargeAcct extends BaseEntity {

    @Id
    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Ch_Expense_Acct")
    private Integer chExpenseAcct;

    @Column("Ch_Revenue_Acct")
    private Integer chRevenueAcct;
}
