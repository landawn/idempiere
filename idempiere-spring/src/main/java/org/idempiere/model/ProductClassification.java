package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Classification entity - M_ProductClassification table.
 * Product classification definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductClassification")
public class ProductClassification extends BaseEntity {

    @Id
    @Column("M_ProductClassification_ID")
    private Integer mProductClassificationId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
