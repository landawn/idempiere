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
 * Product purchasing information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_PO")
public class MProductPO extends BaseEntity {

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("CostPerOrder")
    private BigDecimal costPerOrder;

    @Column("DeliveryTime_Actual")
    private Integer deliveryTimeActual;

    @Column("DeliveryTime_Promised")
    private Integer deliveryTimePromised;

    @Column("Discontinued")
    private String discontinued;

    @Column("DiscontinuedAt")
    private LocalDateTime discontinuedAt;

    @Column("IsCurrentVendor")
    private String isCurrentVendor;

    @Column("Manufacturer")
    private String manufacturer;

    @Column("Order_Min")
    private BigDecimal orderMin;

    @Column("Order_Pack")
    private BigDecimal orderPack;

    @Column("PriceEffective")
    private LocalDateTime priceEffective;

    @Column("PriceLastInv")
    private BigDecimal priceLastInv;

    @Column("PriceLastPO")
    private BigDecimal priceLastPO;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PricePO")
    private BigDecimal pricePO;

    @Column("QualityRating")
    private BigDecimal qualityRating;

    @Column("RoyaltyAmt")
    private BigDecimal royaltyAmt;

    @Column("UPC")
    private String upc;

    @Column("VendorCategory")
    private String vendorCategory;

    @Column("VendorProductNo")
    private String vendorProductNo;
}
