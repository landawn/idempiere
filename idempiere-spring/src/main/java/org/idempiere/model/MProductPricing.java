package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Product Pricing entity - M_ProductPricing table.
 * Product pricing information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductPricing")
public class MProductPricing extends BaseEntity {

    @Id
    @Column("M_ProductPricing_ID")
    private Integer mProductPricingId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("PriceDate")
    private LocalDateTime priceDate;

    @Column("PriceLimit")
    private BigDecimal priceLimit;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PriceStd")
    private BigDecimal priceStd;

    @Column("Qty")
    private BigDecimal qty;
}
