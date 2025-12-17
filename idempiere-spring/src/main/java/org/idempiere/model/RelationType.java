package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Relation Type entity - AD_RelationType table.
 * Relation type definition for related records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_RelationType")
public class RelationType extends BaseEntity {

    @Id
    @Column("AD_RelationType_ID")
    private Integer adRelationTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Type")
    private String type;

    @Column("Role_Source")
    private String roleSource;

    @Column("Role_Target")
    private String roleTarget;

    @Column("IsDirected")
    private String isDirected;

    @Column("AD_Reference_Source_ID")
    private Integer adReferenceSourceId;

    @Column("AD_Reference_Target_ID")
    private Integer adReferenceTargetId;
}
