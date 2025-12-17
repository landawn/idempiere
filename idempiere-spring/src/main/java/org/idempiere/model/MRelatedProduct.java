package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Related Product entity - M_RelatedProduct table.
 * Related products.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_RelatedProduct")
public class MRelatedProduct extends BaseEntity {

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("RelatedProduct_ID")
    private Integer relatedProductId;

    @Id
    @Column("RelatedProductType")
    private String relatedProductType;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;
}
