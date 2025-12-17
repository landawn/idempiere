package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Role Organization Access entity.
 * Maps to AD_Role_OrgAccess table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Role_OrgAccess")
public class OrgAccess extends BaseEntity {

    @Id
    @Column("AD_Role_OrgAccess_UU")
    private String adRoleOrgAccessUU;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("IsReadOnly")
    private String isReadOnly;
}
