package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Field Group entity.
 * Maps to AD_FieldGroup table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_FieldGroup")
public class FieldGroup extends BaseEntity {

    @Id
    @Column("AD_FieldGroup_ID")
    private Integer adFieldGroupId;

    @Column("Name")
    private String name;

    @Column("EntityType")
    private String entityType;

    @Column("FieldGroupType")
    private String fieldGroupType;

    @Column("IsCollapsedByDefault")
    private String isCollapsedByDefault;
}
