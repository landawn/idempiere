package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Foreign Key entity - AD_ForeignKey table.
 * Foreign key constraint definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ForeignKey")
public class ForeignKey extends BaseEntity {

    @Id
    @Column("AD_ForeignKey_ID")
    private Integer adForeignKeyId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("FKConstraintName")
    private String fkConstraintName;

    @Column("FKConstraintType")
    private String fkConstraintType;

    @Column("EntityType")
    private String entityType;
}
