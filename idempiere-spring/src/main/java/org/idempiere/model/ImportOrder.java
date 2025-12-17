package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Order entity.
 * Maps to I_Order table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_Order")
public class ImportOrder extends BaseEntity {

    @Id
    @Column("I_Order_ID")
    private Integer iOrderId;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("DocTypeName")
    private String docTypeName;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("IsSOTrx")
    private String isSoTrx;

    @Column("Description")
    private String description;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("POReference")
    private String poReference;

    @Column("BPartnerValue")
    private String bPartnerValue;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Name")
    private String name;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("BillTo_ID")
    private Integer billToId;

    @Column("Address1")
    private String address1;

    @Column("Address2")
    private String address2;

    @Column("City")
    private String city;

    @Column("PostalCode")
    private String postalCode;

    @Column("RegionName")
    private String regionName;

    @Column("CountryCode")
    private String countryCode;

    @Column("ContactName")
    private String contactName;

    @Column("EMail")
    private String email;

    @Column("Phone")
    private String phone;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("ProductValue")
    private String productValue;

    @Column("UPC")
    private String upc;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("QtyOrdered")
    private BigDecimal qtyOrdered;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("LineDescription")
    private String lineDescription;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("FreightAmt")
    private BigDecimal freightAmt;

    @Column("PaymentTermValue")
    private String paymentTermValue;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;
}
