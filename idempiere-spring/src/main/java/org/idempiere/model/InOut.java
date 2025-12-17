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
 * InOut (Material Receipt/Shipment) entity.
 * Maps to M_InOut table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOut")
public class InOut extends BaseEntity {

    @Id
    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("MovementType")
    private String movementType;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("POReference")
    private String poReference;

    @Column("DeliveryRule")
    private String deliveryRule;

    @Column("FreightCostRule")
    private String freightCostRule;

    @Column("FreightAmt")
    private BigDecimal freightAmt;

    @Column("DeliveryViaRule")
    private String deliveryViaRule;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("ChargeAmt")
    private BigDecimal chargeAmt;

    @Column("PriorityRule")
    private String priorityRule;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("DatePrinted")
    private LocalDateTime datePrinted;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsInDispute")
    private String isInDispute;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("SendEMail")
    private String sendEmail;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("NoPackages")
    private Integer noPackages;

    @Column("PickDate")
    private LocalDateTime pickDate;

    @Column("ShipDate")
    private LocalDateTime shipDate;

    @Column("TrackingNo")
    private String trackingNo;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("Volume")
    private BigDecimal volume;

    @Column("Weight")
    private BigDecimal weight;

    @Column("CreateFrom")
    private String createFrom;

    @Column("GenerateTo")
    private String generateTo;

    @Column("IsInTransit")
    private String isInTransit;

    @Column("CreateConfirm")
    private String createConfirm;

    @Column("IsDropShip")
    private String isDropShip;

    @Column("DropShip_BPartner_ID")
    private Integer dropShipBPartnerId;

    @Column("DropShip_Location_ID")
    private Integer dropShipLocationId;

    @Column("DropShip_User_ID")
    private Integer dropShipUserId;

    @Column("M_RMA_ID")
    private Integer mRmaId;

    @Column("Reversal_ID")
    private Integer reversalId;

    @Column("C_DocTypeTarget_ID")
    private Integer cDocTypeTargetId;
}
