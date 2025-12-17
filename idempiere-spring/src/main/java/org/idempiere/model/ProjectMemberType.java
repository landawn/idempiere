package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Project Member Type entity - C_ProjectMemberType table.
 * Project member type definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_ProjectMemberType")
public class ProjectMemberType extends BaseEntity {

    @Id
    @Column("C_ProjectMemberType_ID")
    private Integer cProjectMemberTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Value")
    private String value;
}
