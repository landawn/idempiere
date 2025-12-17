package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product entity - represents items, services, and resources.
 * Maps to M_Product table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product")
public class Product extends BaseEntity {

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Product_UU")
    private String mProductUu;

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

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("Classification")
    private String classification;

    @Column("ProductType")
    private String productType;

    @Column("Weight")
    private BigDecimal weight;

    @Column("Volume")
    private BigDecimal volume;

    @Column("IsSummary")
    private Boolean isSummary;

    @Column("IsStocked")
    private Boolean isStocked;

    @Column("IsPurchased")
    private Boolean isPurchased;

    @Column("IsSold")
    private Boolean isSold;

    @Column("IsBOM")
    private Boolean isBom;

    @Column("IsInvoicePrintDetails")
    private Boolean isInvoicePrintDetails;

    @Column("IsPickListPrintDetails")
    private Boolean isPickListPrintDetails;

    @Column("IsVerified")
    private Boolean isVerified;

    @Column("C_RevenueRecognition_ID")
    private Integer cRevenueRecognitionId;

    @Column("M_FreightCategory_ID")
    private Integer mFreightCategoryId;

    @Column("C_SubscriptionType_ID")
    private Integer cSubscriptionTypeId;

    @Column("ImageURL")
    private String imageUrl;

    @Column("DescriptionURL")
    private String descriptionUrl;

    @Column("GuaranteeDays")
    private Integer guaranteeDays;

    @Column("R_MailText_ID")
    private Integer rMailTextId;

    @Column("VersionNo")
    private String versionNo;

    @Column("M_AttributeSet_ID")
    private Integer mAttributeSetId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("DiscontinuedBy")
    private LocalDate discontinuedBy;

    @Column("Discontinued")
    private Boolean discontinued;

    @Column("IsDropShip")
    private Boolean isDropShip;

    @Column("IsSelfService")
    private Boolean isSelfService;

    @Column("IsExcludeAutoDelivery")
    private Boolean isExcludeAutoDelivery;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("Processing")
    private Boolean processing;

    @Column("S_ExpenseType_ID")
    private Integer sExpenseTypeId;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("C_TaxCategory_ID")
    private Integer cTaxCategoryId;

    @Column("M_PartType_ID")
    private Integer mPartTypeId;

    @Column("Group1")
    private String group1;

    @Column("Group2")
    private String group2;

    @Column("IsWebStoreFeatured")
    private Boolean isWebStoreFeatured;

    @Column("IsOwnBox")
    private Boolean isOwnBox;

    @Column("UnitsPerPallet")
    private BigDecimal unitsPerPallet;

    @Column("UnitsPerPack")
    private Integer unitsPerPack;

    @Column("LowLevel")
    private Integer lowLevel;

    @Column("ShelfWidth")
    private Integer shelfWidth;

    @Column("ShelfHeight")
    private Integer shelfHeight;

    @Column("ShelfDepth")
    private Integer shelfDepth;

    @Column("IsKanban")
    private Boolean isKanban;

    @Column("IsManufactured")
    private Boolean isManufactured;

    @Column("IsPhantom")
    private Boolean isPhantom;
}
