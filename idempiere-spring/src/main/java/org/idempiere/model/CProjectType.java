package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Project Type entity - C_ProjectType table.
 * Type of project with standard phases.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectType")
public class CProjectType extends BaseEntity {

    @Id
    @Column("C_ProjectType_ID")
    private Integer cProjectTypeId;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("ProjectCategory")
    private String projectCategory;
}
