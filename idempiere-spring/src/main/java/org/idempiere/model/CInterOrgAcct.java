package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Inter-Organization Accounting entity - C_InterOrg_Acct table.
 * Inter-organization accounting.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InterOrg_Acct")
public class CInterOrgAcct extends BaseEntity {

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Id
    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Id
    @Column("AD_OrgTo_ID")
    private Integer adOrgToId;

    @Column("IntercompanyDue_Acct")
    private Integer intercompanyDueAcct;

    @Column("IntercompanyDueTo_Acct")
    private Integer intercompanyDueToAcct;
}
