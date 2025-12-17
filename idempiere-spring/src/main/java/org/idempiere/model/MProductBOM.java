package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Product BOM entity - M_Product_BOM table.
 * Bill of materials for product.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_BOM")
public class MProductBOM extends BaseEntity {

    @Id
    @Column("M_Product_BOM_ID")
    private Integer mProductBomId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_ProductBOM_ID")
    private Integer mProductBomIdRef;

    @Column("BOMQty")
    private BigDecimal bomQty;

    @Column("BOMType")
    private String bomType;

    @Column("Description")
    private String description;

    @Column("Line")
    private Integer line;
}
