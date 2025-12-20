package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product BOM entity - represents product-level Bill of Materials.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_BOM")
public class ProductBOM extends BaseEntity {

    @Id
    @Column("M_Product_BOM_ID")
    private Integer mProductBomId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_ProductBOM_ID")
    private Integer mProductBomId2;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("BOMType")
    private String bomType;

    @Column("BOMQty")
    private BigDecimal bomQty;
}
