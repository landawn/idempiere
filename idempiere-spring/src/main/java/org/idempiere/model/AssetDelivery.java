package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Asset Delivery entity.
 * Maps to A_Asset_Delivery table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Delivery")
public class AssetDelivery extends BaseEntity {

    @Id
    @Column("A_Asset_Delivery_ID")
    private Integer aAssetDeliveryId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Description")
    private String description;

    @Column("MessageID")
    private String messageId;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("SerNo")
    private String serNo;

    @Column("Lot")
    private String lot;

    @Column("VersionNo")
    private String versionNo;

    @Column("EMail")
    private String email;

    @Column("DeliveryConfirmation")
    private String deliveryConfirmation;

    @Column("Referrer")
    private String referrer;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("URL")
    private String url;

    @Column("M_ProductDownload_ID")
    private Integer mProductDownloadId;
}
