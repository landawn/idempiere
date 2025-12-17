package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Label Category entity - AD_LabelCategory table.
 * Category of a record label.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LabelCategory")
public class ADLabelCategory extends BaseEntity {

    @Id
    @Column("AD_LabelCategory_ID")
    private Integer adLabelCategoryId;

    @Column("AD_LabelStyle_ID")
    private Integer adLabelStyleId;

    @Column("Description")
    private String description;

    @Column("IsCanBeUsedInAllTables")
    private String isCanBeUsedInAllTables;

    @Column("Name")
    private String name;
}
