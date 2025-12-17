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
 * Web Basket Line entity.
 * Maps to W_BasketLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_BasketLine")
public class WebBasketLine extends BaseEntity {

    @Id
    @Column("W_BasketLine_ID")
    private Integer wBasketLineId;

    @Column("W_Basket_ID")
    private Integer wBasketId;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Description")
    private String description;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Price")
    private BigDecimal price;

    @Column("C_UOM_ID")
    private Integer cUomId;
}
