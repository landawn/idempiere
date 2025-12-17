package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Role Included entity - AD_Role_Included table.
 * Role Included.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Role_Included")
public class ADRoleIncluded extends BaseEntity {

    @Id
    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Id
    @Column("Included_Role_ID")
    private Integer includedRoleId;

    @Column("SeqNo")
    private Integer seqNo;
}
