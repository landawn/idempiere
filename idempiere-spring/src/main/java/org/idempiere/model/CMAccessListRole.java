package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management Access List Role entity - CM_AccessListRole table.
 * Role access for content.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_AccessListRole")
public class CMAccessListRole extends BaseEntity {

    @Id
    @Column("CM_AccessProfile_ID")
    private Integer cmAccessProfileId;

    @Id
    @Column("AD_Role_ID")
    private Integer adRoleId;
}
