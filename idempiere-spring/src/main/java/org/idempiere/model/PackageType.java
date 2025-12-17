package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Package Type entity - AD_PackageType table.
 * Package type definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PackageType")
public class PackageType extends BaseEntity {

    @Id
    @Column("AD_PackageType_ID")
    private Integer adPackageTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Classname")
    private String classname;
}
