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
 * Quantity Reservation entity - M_QtyReservation table.
 * Stock quantity reservation record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_QtyReservation")
public class QtyReservation extends BaseEntity {

    @Id
    @Column("M_QtyReservation_ID")
    private Integer mQtyReservationId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;
}
