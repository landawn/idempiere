package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD User Roles entity - AD_User_Roles table.
 * User Roles.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_User_Roles")
public class ADUserRoles extends BaseEntity {

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;

    @Id
    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("IsDefault")
    private String isDefault;
}
