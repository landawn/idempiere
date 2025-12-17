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
 * Order entity - represents sales orders and purchase orders.
 * Maps to C_Order table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Order")
public class Order extends BaseEntity {

    @Id
    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Order_UU")
    private String cOrderUu;

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

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_DocTypeTarget_ID")
    private Integer cDocTypeTargetId;

    @Column("Description")
    private String description;

    @Column("IsSOTrx")
    private Boolean isSOTrx;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

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

    @Column("IsDropShip")
    private Boolean isDropShip;

    @Column("DropShip_BPartner_ID")
    private Integer dropShipBpartnerId;

    @Column("DropShip_Location_ID")
    private Integer dropShipLocationId;

    @Column("DropShip_User_ID")
    private Integer dropShipUserId;

    @Column("Bill_BPartner_ID")
    private Integer billBpartnerId;

    @Column("Bill_Location_ID")
    private Integer billLocationId;

    @Column("Bill_User_ID")
    private Integer billUserId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_ConversionType_ID")
    private Integer cConversionTypeId;

    @Column("PaymentRule")
    private String paymentRule;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("InvoiceRule")
    private String invoiceRule;

    @Column("DeliveryRule")
    private String deliveryRule;

    @Column("DeliveryViaRule")
    private String deliveryViaRule;

    @Column("FreightCostRule")
    private String freightCostRule;

    @Column("FreightAmt")
    private BigDecimal freightAmt;

    @Column("PriorityRule")
    private String priorityRule;

    @Column("TotalLines")
    private BigDecimal totalLines;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

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

    @Column("IsCreditApproved")
    private Boolean isCreditApproved;

    @Column("IsDelivered")
    private Boolean isDelivered;

    @Column("IsInvoiced")
    private Boolean isInvoiced;

    @Column("IsPrinted")
    private Boolean isPrinted;

    @Column("IsSelected")
    private Boolean isSelected;

    @Column("IsSelfService")
    private Boolean isSelfService;

    @Column("IsTransferred")
    private Boolean isTransferred;

    @Column("SendEMail")
    private Boolean sendEmail;

    @Column("DatePrinted")
    private LocalDateTime datePrinted;

    @Column("ChargeAmt")
    private BigDecimal chargeAmt;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("CopyFrom")
    private String copyFrom;

    @Column("Posted")
    private Boolean posted;

    @Column("IsDiscountPrinted")
    private Boolean isDiscountPrinted;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_CashLine_ID")
    private Integer cCashLineId;

    @Column("Ref_Order_ID")
    private Integer refOrderId;

    @Column("Link_Order_ID")
    private Integer linkOrderId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("M_FreightCategory_ID")
    private Integer mFreightCategoryId;

    @Column("IsPayScheduleValid")
    private Boolean isPayScheduleValid;

    @Column("C_POS_ID")
    private Integer cPosId;

    @Column("C_OrderSource_ID")
    private Integer cOrderSourceId;

    @Column("PromotionCode")
    private String promotionCode;

    @Column("AmountTendered")
    private BigDecimal amountTendered;

    @Column("AmountRefunded")
    private BigDecimal amountRefunded;

    @Column("C_Opportunity_ID")
    private Integer cOpportunityId;

    @Column("QuotationOrder_ID")
    private Integer quotationOrderId;

    @Column("IsPriviledgedRate")
    private Boolean isPriviledgedRate;

    @Column("Volume")
    private BigDecimal volume;

    @Column("Weight")
    private BigDecimal weight;

    @Column("Pay_BPartner_ID")
    private Integer payBpartnerId;

    @Column("Pay_Location_ID")
    private Integer payLocationId;

    @Column("C_CashPlanLine_ID")
    private Integer cCashPlanLineId;

    @Column("C_CostCenter_ID")
    private Integer cCostCenterId;

    @Column("C_Department_ID")
    private Integer cDepartmentId;

    @Column("ShippingRateInquiry")
    private String shippingRateInquiry;
}
