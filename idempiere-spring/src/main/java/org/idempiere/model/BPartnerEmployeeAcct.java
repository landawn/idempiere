package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner Employee Accounting entity - C_BP_Employee_Acct table.
 * Business partner employee accounting.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_Employee_Acct")
public class BPartnerEmployeeAcct extends BaseEntity {

    @Id
    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("E_Expense_Acct")
    private Integer eExpenseAcct;

    @Column("E_Prepayment_Acct")
    private Integer ePrepaymentAcct;
}
