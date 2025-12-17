package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Storage Reservation entity - reserved/ordered quantities.
 * Maps to M_StorageReservation table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_StorageReservation")
public class StorageReservation extends BaseEntity {

    @Id
    @Column("M_StorageReservation_UU")
    private String mStorageReservationUU;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("Qty")
    private BigDecimal qty;
}
