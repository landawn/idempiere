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
 * Product Price entity.
 * Maps to M_ProductPrice table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductPrice")
public class ProductPrice extends BaseEntity {

    @Id
    @Column("M_ProductPrice_UU")
    private String mProductPriceUU;

    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PriceStd")
    private BigDecimal priceStd;

    @Column("PriceLimit")
    private BigDecimal priceLimit;
}
