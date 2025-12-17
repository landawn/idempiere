package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Business Partner entity - represents customers, vendors, and employees.
 * Maps to C_BPartner table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BPartner")
public class BPartner extends BaseEntity {

    @Id
    @Column("C_BPartner_ID")
    private Integer cBpartnerId;

    @Column("C_BPartner_UU")
    private String cBpartnerUu;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Name2")
    private String name2;

    @Column("Description")
    private String description;

    @Column("IsSummary")
    private Boolean isSummary;

    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;

    @Column("IsOneTime")
    private Boolean isOneTime;

    @Column("IsProspect")
    private Boolean isProspect;

    @Column("IsVendor")
    private Boolean isVendor;

    @Column("IsCustomer")
    private Boolean isCustomer;

    @Column("IsEmployee")
    private Boolean isEmployee;

    @Column("IsSalesRep")
    private Boolean isSalesRep;

    @Column("ReferenceNo")
    private String referenceNo;

    @Column("DUNS")
    private String duns;

    @Column("URL")
    private String url;

    @Column("AD_Language")
    private String adLanguage;

    @Column("TaxID")
    private String taxId;

    @Column("IsTaxExempt")
    private Boolean isTaxExempt;

    @Column("C_InvoiceSchedule_ID")
    private Integer cInvoiceScheduleId;

    @Column("Rating")
    private String rating;

    @Column("SalesVolume")
    private Integer salesVolume;

    @Column("NumberEmployees")
    private Integer numberEmployees;

    @Column("NAICS")
    private String naics;

    @Column("FirstSale")
    private LocalDate firstSale;

    @Column("AcqusitionCost")
    private BigDecimal acquisitionCost;

    @Column("PotentialLifeTimeValue")
    private BigDecimal potentialLifeTimeValue;

    @Column("ActualLifeTimeValue")
    private BigDecimal actualLifeTimeValue;

    @Column("ShareOfCustomer")
    private Integer shareOfCustomer;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("SO_CreditLimit")
    private BigDecimal soCreditLimit;

    @Column("SO_CreditUsed")
    private BigDecimal soCreditUsed;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("M_DiscountSchema_ID")
    private Integer mDiscountSchemaId;

    @Column("C_Dunning_ID")
    private Integer cDunningId;

    @Column("InvoicePrintFormat_ID")
    private Integer invoicePrintFormatId;

    @Column("Invoice_PrintFormat_ID")
    private Integer invoicePrintFormatId2;

    @Column("PO_PaymentTerm_ID")
    private Integer poPaymentTermId;

    @Column("PO_PriceList_ID")
    private Integer poPriceListId;

    @Column("PO_DiscountSchema_ID")
    private Integer poDiscountSchemaId;

    @Column("SO_Description")
    private String soDescription;

    @Column("IsDiscountPrinted")
    private Boolean isDiscountPrinted;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("SendEMail")
    private Boolean sendEmail;

    @Column("BPartner_Parent_ID")
    private Integer bpartnerParentId;

    @Column("DeliveryRule")
    private String deliveryRule;

    @Column("DeliveryViaRule")
    private String deliveryViaRule;

    @Column("FreightCostRule")
    private String freightCostRule;

    @Column("InvoiceRule")
    private String invoiceRule;

    @Column("PaymentRulePO")
    private String paymentRulePo;

    @Column("FlatDiscount")
    private BigDecimal flatDiscount;

    @Column("TotalOpenBalance")
    private BigDecimal totalOpenBalance;

    @Column("SOCreditStatus")
    private String soCreditStatus;

    @Column("ShelfLifeMinPct")
    private Integer shelfLifeMinPct;

    @Column("DocumentCopies")
    private Integer documentCopies;

    @Column("C_Greeting_ID")
    private Integer cGreetingId;

    @Column("DunningGrace")
    private LocalDate dunningGrace;

    @Column("IsManufacturer")
    private Boolean isManufacturer;

    @Column("Logo_ID")
    private Integer logoId;

    @Column("AD_OrgBP_ID")
    private String adOrgBpId;
}
