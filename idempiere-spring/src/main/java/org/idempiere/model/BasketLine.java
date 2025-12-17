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
 * Basket Line entity - W_BasketLine table.
 * Web shopping basket line item.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_BasketLine")
public class BasketLine extends BaseEntity {

    @Id
    @Column("W_BasketLine_ID")
    private Integer wBasketLineId;

    @Column("W_Basket_ID")
    private Integer wBasketId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Line")
    private Integer line;

    @Column("Product")
    private String product;

    @Column("Description")
    private String description;

    @Column("Price")
    private BigDecimal price;
}
