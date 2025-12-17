package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Sales Region Accounting entity - C_SalesRegion_Acct table.
 * Sales region accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_SalesRegion_Acct")
public class SalesRegionAcct extends BaseEntity {

    @Id
    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("SR_Revenue_Acct")
    private Integer srRevenueAcct;

    @Column("SR_Expense_Acct")
    private Integer srExpenseAcct;
}
