package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Campaign Accounting entity - C_Campaign_Acct table.
 * Campaign accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Campaign_Acct")
public class CampaignAcct extends BaseEntity {

    @Id
    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Cam_Revenue_Acct")
    private Integer camRevenueAcct;

    @Column("Cam_Expense_Acct")
    private Integer camExpenseAcct;
}
