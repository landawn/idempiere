package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Role Org Access entity - AD_Role_OrgAccess table.
 * Role Org Access.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Role_OrgAccess")
public class ADRoleOrgAccess extends BaseEntity {

    @Id
    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Id
    @Column("AD_Org_ID")
    private Integer adOrgAccessId;

    @Column("IsReadOnly")
    private String isReadOnly;
}
