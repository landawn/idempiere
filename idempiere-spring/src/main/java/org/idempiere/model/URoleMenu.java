package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Role Menu entity - U_RoleMenu table.
 * User-defined role menu configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("U_RoleMenu")
public class URoleMenu extends BaseEntity {

    @Id
    @Column("U_RoleMenu_ID")
    private Integer uRoleMenuId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Tree_ID")
    private Integer adTreeId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
