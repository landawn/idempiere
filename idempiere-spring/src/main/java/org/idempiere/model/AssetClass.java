package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Class entity - A_Asset_Class table.
 * Asset class definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Class")
public class AssetClass extends BaseEntity {

    @Id
    @Column("A_Asset_Class_ID")
    private Integer aAssetClassId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsDefault")
    private String isDefault;
}
