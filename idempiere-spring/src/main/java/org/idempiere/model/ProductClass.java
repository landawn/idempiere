package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Class entity - M_ProductClass table.
 * Product class definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductClass")
public class ProductClass extends BaseEntity {

    @Id
    @Column("M_ProductClass_ID")
    private Integer mProductClassId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
