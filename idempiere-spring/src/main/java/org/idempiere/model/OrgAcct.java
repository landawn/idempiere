package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Organization Accounting entity - AD_OrgInfo_Acct table.
 * Organization accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_OrgInfo_Acct")
public class OrgAcct extends BaseEntity {

    @Id
    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;
}
