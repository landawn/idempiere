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
 * Product Price Vendor Break entity - M_ProductPriceVendorBreak table.
 * Vendor break pricing.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductPriceVendorBreak")
public class ProductPriceVendorBreak extends BaseEntity {

    @Id
    @Column("M_ProductPriceVendorBreak_ID")
    private Integer mProductPriceVendorBreakId;

    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("BreakValue")
    private BigDecimal breakValue;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PriceStd")
    private BigDecimal priceStd;

    @Column("PriceLimit")
    private BigDecimal priceLimit;
}
