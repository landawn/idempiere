package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Inter-Organization Accounting entity.
 * Maps to C_InterOrg_Acct table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InterOrg_Acct")
public class InterOrgAcct extends BaseEntity {

    @Id
    @Column("C_InterOrg_Acct_ID")
    private Integer cInterOrgAcctId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("AD_OrgTo_ID")
    private Integer adOrgToId;

    @Column("IntercompanyDueTo_Acct")
    private Integer intercompanyDueToAcct;

    @Column("IntercompanyDueFrom_Acct")
    private Integer intercompanyDueFromAcct;
}
