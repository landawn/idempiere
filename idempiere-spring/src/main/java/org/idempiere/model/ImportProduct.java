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
 * Import Product entity.
 * Maps to I_Product table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_Product")
public class ImportProduct extends BaseEntity {

    @Id
    @Column("I_Product_ID")
    private Integer iProductId;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DocumentNote")
    private String documentNote;

    @Column("Help")
    private String help;

    @Column("UPC")
    private String upc;

    @Column("SKU")
    private String sku;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("ProductType")
    private String productType;

    @Column("ProductCategory_Value")
    private String productCategoryValue;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("X12DE355")
    private String x12de355;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("Classification")
    private String classification;

    @Column("Volume")
    private BigDecimal volume;

    @Column("Weight")
    private BigDecimal weight;

    @Column("ShelfWidth")
    private Integer shelfWidth;

    @Column("ShelfHeight")
    private Integer shelfHeight;

    @Column("ShelfDepth")
    private Integer shelfDepth;

    @Column("UnitsPerPallet")
    private Integer unitsPerPallet;

    @Column("Discontinued")
    private String discontinued;

    @Column("DiscontinuedBy")
    private java.time.LocalDateTime discontinuedBy;

    @Column("BPartner_Value")
    private String bPartnerValue;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("VendorProductNo")
    private String vendorProductNo;

    @Column("VendorCategory")
    private String vendorCategory;

    @Column("Manufacturer")
    private String manufacturer;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PriceStd")
    private BigDecimal priceStd;

    @Column("PricePO")
    private BigDecimal pricePO;

    @Column("PriceLimit")
    private BigDecimal priceLimit;

    @Column("PriceEffective")
    private java.time.LocalDateTime priceEffective;

    @Column("M_PriceList_Version_ID")
    private Integer mPriceListVersionId;

    @Column("ISO_Code")
    private String isoCode;

    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Column("TaxCategory_Name")
    private String taxCategoryName;

    @Column("Royaltyamt")
    private BigDecimal royaltyAmt;
}
