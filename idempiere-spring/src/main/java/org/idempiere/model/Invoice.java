package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Invoice entity - represents customer invoices and vendor bills.
 * Maps to C_Invoice table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Invoice")
public class Invoice extends BaseEntity {

    @Id
    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Invoice_UU")
    private String cInvoiceUu;

    @Column("DocumentNo")
    private String documentNo;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private Boolean processing;

    @Column("Processed")
    private Boolean processed;

    @Column("ProcessedOn")
    private BigDecimal processedOn;

    @Column("Posted")
    private Boolean posted;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_DocTypeTarget_ID")
    private Integer cDocTypeTargetId;

    @Column("Description")
    private String description;

    @Column("IsSOTrx")
    private Boolean isSOTrx;

    @Column("IsReturnTrx")
    private Boolean isReturnTrx;

    @Column("DateInvoiced")
    private LocalDateTime dateInvoiced;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("DatePrinted")
    private LocalDateTime datePrinted;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("C_BPartner_ID")
    private Integer cBpartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBpartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("POReference")
    private String poReference;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("M_RMA_ID")
    private Integer mRmaId;

    @Column("IsTransferred")
    private Boolean isTransferred;

    @Column("IsPrinted")
    private Boolean isPrinted;

    @Column("IsSelfService")
    private Boolean isSelfService;

    @Column("SendEMail")
    private Boolean sendEmail;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_ConversionType_ID")
    private Integer cConversionTypeId;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("ChargeAmt")
    private BigDecimal chargeAmt;

    @Column("TotalLines")
    private BigDecimal totalLines;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("M_PriceList_ID")
    private Integer mPriceListId;

    @Column("IsTaxIncluded")
    private Boolean isTaxIncluded;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("IsApproved")
    private Boolean isApproved;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_CashLine_ID")
    private Integer cCashLineId;

    @Column("IsDiscountPrinted")
    private Boolean isDiscountPrinted;

    @Column("IsPaid")
    private Boolean isPaid;

    @Column("IsInDispute")
    private Boolean isInDispute;

    @Column("CopyFrom")
    private String copyFrom;

    @Column("Reversal_ID")
    private Integer reversalId;

    @Column("IsPayScheduleValid")
    private Boolean isPayScheduleValid;

    @Column("C_DunningLevel_ID")
    private Integer cDunningLevelId;

    @Column("RelatedInvoice_ID")
    private Integer relatedInvoiceId;

    @Column("C_CostCenter_ID")
    private Integer cCostCenterId;

    @Column("C_Department_ID")
    private Integer cDepartmentId;

    @Column("ScheduledPaymentExecuted")
    private Boolean scheduledPaymentExecuted;

    @Column("Pay_BPartner_ID")
    private Integer payBpartnerId;

    @Column("Pay_Location_ID")
    private Integer payLocationId;
}
