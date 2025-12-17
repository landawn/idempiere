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
 * Package entity - M_Package table.
 * Shipment package.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Package")
public class MPackage extends BaseEntity {

    @Id
    @Column("M_Package_ID")
    private Integer mPackageId;

    @Column("BoxCount")
    private Integer boxCount;

    @Column("DateReceived")
    private LocalDateTime dateReceived;

    @Column("Description")
    private String description;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Height")
    private BigDecimal height;

    @Column("Length")
    private BigDecimal length;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("ReceivedInfo")
    private String receivedInfo;

    @Column("ShipDate")
    private LocalDateTime shipDate;

    @Column("TrackingInfo")
    private String trackingInfo;

    @Column("Weight")
    private BigDecimal weight;

    @Column("Width")
    private BigDecimal width;
}
