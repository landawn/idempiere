package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * GL Category entity - journal category.
 * Maps to GL_Category table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_Category")
public class GLCategory extends BaseEntity {

    @Id
    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("CategoryType")
    private String categoryType;

    @Column("IsDefault")
    private String isDefault;
}
