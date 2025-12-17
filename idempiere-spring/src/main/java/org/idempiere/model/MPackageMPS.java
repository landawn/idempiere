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
 * Package MPS entity - M_PackageMPS table.
 * Multi-package shipment package.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_PackageMPS")
public class MPackageMPS extends BaseEntity {

    @Id
    @Column("M_PackageMPS_ID")
    private Integer mPackageMpsId;

    @Column("M_ShipperLabels_Cfg_ID")
    private Integer mShipperLabelsCfgId;

    @Column("M_ShipperPackaging_Cfg_ID")
    private Integer mShipperPackagingCfgId;

    @Column("BoxLength")
    private BigDecimal boxLength;

    @Column("BoxWidth")
    private BigDecimal boxWidth;

    @Column("BoxHeight")
    private BigDecimal boxHeight;

    @Column("DateReceived")
    private LocalDateTime dateReceived;

    @Column("Description")
    private String description;

    @Column("EstimatedWeight")
    private BigDecimal estimatedWeight;

    @Column("IsDeliveryConfirmed")
    private String isDeliveryConfirmed;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("Processed")
    private String processed;

    @Column("ReceivedInfo")
    private String receivedInfo;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("ShipDate")
    private LocalDateTime shipDate;

    @Column("TrackingInfo")
    private String trackingInfo;

    @Column("Weight")
    private BigDecimal weight;
}
