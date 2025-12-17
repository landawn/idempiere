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
 * Distribution Order entity.
 * Maps to DD_Order table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("DD_Order")
public class DDOrder extends BaseEntity {

    @Id
    @Column("DD_Order_ID")
    private Integer ddOrderId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("Posted")
    private String posted;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsInTransit")
    private String isInTransit;

    @Column("IsInDispute")
    private String isInDispute;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("DateReceived")
    private LocalDateTime dateReceived;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("ChargeAmt")
    private BigDecimal chargeAmt;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("FreightCostRule")
    private String freightCostRule;

    @Column("FreightAmt")
    private BigDecimal freightAmt;

    @Column("DeliveryRule")
    private String deliveryRule;

    @Column("DeliveryViaRule")
    private String deliveryViaRule;

    @Column("PriorityRule")
    private String priorityRule;

    @Column("POReference")
    private String poReference;

    @Column("Volume")
    private BigDecimal volume;

    @Column("Weight")
    private BigDecimal weight;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("PP_Order_ID")
    private Integer ppOrderId;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("NoPackages")
    private Integer noPackages;

    @Column("PickDate")
    private LocalDateTime pickDate;

    @Column("ShipDate")
    private LocalDateTime shipDate;

    @Column("TrackingNo")
    private String trackingNo;
}
