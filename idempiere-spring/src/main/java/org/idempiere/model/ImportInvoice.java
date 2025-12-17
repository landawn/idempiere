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
 * Import Invoice entity.
 * Maps to I_Invoice table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_Invoice")
public class ImportInvoice extends BaseEntity {

    @Id
    @Column("I_Invoice_ID")
    private Integer iInvoiceId;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

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

    @Column("DateInvoiced")
    private LocalDateTime dateInvoiced;

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

    @Column("AD_User_ID")
    private Integer adUserId;

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

    @Column("TaxIndicator")
    private String taxIndicator;

    @Column("TaxAmt")
    private BigDecimal taxAmt;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("PaymentTermValue")
    private String paymentTermValue;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("C_Project_ID")
    private Integer cProjectId;
}
