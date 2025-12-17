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
 * Shipping Transaction entity - M_ShippingTransaction table.
 * Shipping transaction record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShippingTransaction")
public class ShippingTransaction extends BaseEntity {

    @Id
    @Column("M_ShippingTransaction_ID")
    private Integer mShippingTransactionId;

    @Column("M_ShipperFacade_ID")
    private Integer mShipperFacadeId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("M_Package_ID")
    private Integer mPackageId;

    @Column("Action")
    private String action;

    @Column("IsPriviledgedRate")
    private String isPriviledgedRate;

    @Column("IsSaturdayDelivery")
    private String isSaturdayDelivery;

    @Column("IsResidential")
    private String isResidential;

    @Column("ShipDate")
    private LocalDateTime shipDate;

    @Column("DeliveryConfirmation")
    private String deliveryConfirmation;

    @Column("DeliveryConfirmationType")
    private String deliveryConfirmationType;

    @Column("NotificationType")
    private String notificationType;

    @Column("NotificationMessage")
    private String notificationMessage;

    @Column("TrackingNo")
    private String trackingNo;

    @Column("MasterTrackingNo")
    private String masterTrackingNo;

    @Column("BoxCount")
    private Integer boxCount;

    @Column("Price")
    private BigDecimal price;

    @Column("SurchargeAmt")
    private BigDecimal surchargeAmt;

    @Column("CODAmt")
    private BigDecimal codAmt;

    @Column("InsuredAmt")
    private BigDecimal insuredAmt;

    @Column("ShippingRespMessage")
    private String shippingRespMessage;

    @Column("LabelImage")
    private byte[] labelImage;

    @Column("Processed")
    private String processed;

    @Column("ProcessedOn")
    private LocalDateTime processedOn;

    @Column("IsActive")
    private String isActive;
}
