package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Activity Accounting entity - C_Activity_Acct table.
 * Activity accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Activity_Acct")
public class ActivityAcct extends BaseEntity {

    @Id
    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Act_Revenue_Acct")
    private Integer actRevenueAcct;

    @Column("Act_Expense_Acct")
    private Integer actExpenseAcct;
}
