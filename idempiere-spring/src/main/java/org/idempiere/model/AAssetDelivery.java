package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Asset Delivery entity - A_Asset_Delivery table.
 * Delivery of asset to customer.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Delivery")
public class AAssetDelivery extends BaseEntity {

    @Id
    @Column("A_Asset_Delivery_ID")
    private Integer aAssetDeliveryId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("DeliveryConfirmation")
    private String deliveryConfirmation;

    @Column("EMail")
    private String email;

    @Column("MessageID")
    private String messageId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("Referrer")
    private String referrer;

    @Column("RemoteAddr")
    private String remoteAddr;

    @Column("RemoteHost")
    private String remoteHost;

    @Column("URL")
    private String url;
}
