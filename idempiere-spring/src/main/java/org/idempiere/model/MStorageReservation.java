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
 * Storage Reservation entity - M_StorageReservation table.
 * Product quantity reservation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_StorageReservation")
public class MStorageReservation extends BaseEntity {

    @Id
    @Column("M_StorageReservation_ID")
    private Integer mStorageReservationId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("DateLastInventory")
    private LocalDateTime dateLastInventory;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("Qty")
    private BigDecimal qty;
}
