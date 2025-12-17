package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Line entity - M_ProductLine table.
 * Product line definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductLine")
public class ProductLine extends BaseEntity {

    @Id
    @Column("M_ProductLine_ID")
    private Integer mProductLineId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
