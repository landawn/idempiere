package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Role Included entity - AD_Role_Included table.
 * Included roles for inheritance.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Role_Included")
public class RoleIncluded extends BaseEntity {

    @Id
    @Column("AD_Role_Included_ID")
    private Integer adRoleIncludedId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("Included_Role_ID")
    private Integer includedRoleId;

    @Column("SeqNo")
    private Integer seqNo;
}
