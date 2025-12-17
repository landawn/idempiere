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
 * Product PO Line entity - M_Product_PO_Line table.
 * Product purchase order line info.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_PO_Line")
public class ProductPOLine extends BaseEntity {

    @Id
    @Column("M_Product_PO_Line_ID")
    private Integer mProductPOLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PricePO")
    private BigDecimal pricePO;

    @Column("BreakQty")
    private BigDecimal breakQty;

    @Column("Discount")
    private BigDecimal discount;
}
