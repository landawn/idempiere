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
 * W Basket Line entity - W_BasketLine table.
 * Web Basket Line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("W_BasketLine")
public class WBasketLine extends BaseEntity {

    @Id
    @Column("W_BasketLine_ID")
    private Integer wBasketLineId;

    @Column("W_Basket_ID")
    private Integer wBasketId;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Price")
    private BigDecimal price;

    @Column("Description")
    private String description;
}
