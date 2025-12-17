package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Entity Type entity - AD_EntityType table.
 * System entity type definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_EntityType")
public class EntityType extends BaseEntity {

    @Id
    @Column("AD_EntityType_ID")
    private Integer adEntityTypeId;

    @Column("EntityType")
    private String entityType;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Version")
    private String version;

    @Column("ModelPackage")
    private String modelPackage;

    @Column("Classpath")
    private String classpath;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
