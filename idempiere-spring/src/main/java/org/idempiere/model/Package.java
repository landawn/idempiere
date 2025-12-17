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
 * Package entity - shipping package.
 * Maps to M_Package table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Package")
public class Package extends BaseEntity {

    @Id
    @Column("M_Package_ID")
    private Integer mPackageId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("ShipDate")
    private LocalDateTime shipDate;

    @Column("DateReceived")
    private LocalDateTime dateReceived;

    @Column("TrackingNo")
    private String trackingNo;

    @Column("BoxCount")
    private Integer boxCount;

    @Column("ReceivedInfo")
    private String receivedInfo;

    @Column("Description")
    private String description;

    @Column("Weight")
    private BigDecimal weight;

    @Column("DocumentNo")
    private String documentNo;
}
