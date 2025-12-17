package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Access List Role entity - CM_AccessListRole table.
 * Web access list role assignment.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessListRole")
public class AccessListRole extends BaseEntity {

    @Id
    @Column("CM_AccessListRole_ID")
    private Integer cmAccessListRoleId;

    @Column("CM_AccessProfile_ID")
    private Integer cmAccessProfileId;

    @Column("AD_Role_ID")
    private Integer adRoleId;
}
