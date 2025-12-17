package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Category entity.
 * Maps to M_Product_Category table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_Category")
public class ProductCategory extends BaseEntity {

    @Id
    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsSelfService")
    private String isSelfService;

    @Column("IsDefault")
    private String isDefault;

    @Column("PlannedMargin")
    private java.math.BigDecimal plannedMargin;

    @Column("A_Asset_Group_ID")
    private Integer aAssetGroupId;

    @Column("M_Product_Category_Parent_ID")
    private Integer mProductCategoryParentId;

    @Column("MMPolicy")
    private String mmPolicy;
}
