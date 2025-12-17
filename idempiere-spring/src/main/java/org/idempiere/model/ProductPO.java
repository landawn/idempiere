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
 * Product Purchasing entity - M_Product_PO table.
 * Product purchasing information by vendor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_PO")
public class ProductPO extends BaseEntity {

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("VendorProductNo")
    private String vendorProductNo;

    @Column("VendorCategory")
    private String vendorCategory;

    @Column("Manufacturer")
    private String manufacturer;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PricePO")
    private BigDecimal pricePO;

    @Column("PriceLastPO")
    private BigDecimal priceLastPO;

    @Column("PriceLastInv")
    private BigDecimal priceLastInv;

    @Column("PriceEffective")
    private LocalDateTime priceEffective;

    @Column("RoyaltyAmt")
    private BigDecimal royaltyAmt;

    @Column("Order_Min")
    private BigDecimal orderMin;

    @Column("Order_Pack")
    private BigDecimal orderPack;

    @Column("CostPerOrder")
    private BigDecimal costPerOrder;

    @Column("DeliveryTime_Promised")
    private Integer deliveryTimePromised;

    @Column("DeliveryTime_Actual")
    private Integer deliveryTimeActual;

    @Column("QualityRating")
    private BigDecimal qualityRating;

    @Column("IsCurrentVendor")
    private String isCurrentVendor;

    @Column("UPC")
    private String upc;

    @Column("DiscontinuedBy")
    private LocalDateTime discontinuedBy;

    @Column("DiscontinuedAt")
    private LocalDateTime discontinuedAt;
}
