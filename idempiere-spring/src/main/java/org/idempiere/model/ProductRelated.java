package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Related entity - M_RelatedProduct table.
 * Related product definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_RelatedProduct")
public class ProductRelated extends BaseEntity {

    @Id
    @Column("M_RelatedProduct_ID")
    private Integer mRelatedProductId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("RelatedProduct_ID")
    private Integer relatedProductId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("RelatedProductType")
    private String relatedProductType;
}
