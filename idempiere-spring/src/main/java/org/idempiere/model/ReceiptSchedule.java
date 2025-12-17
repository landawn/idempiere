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
 * Receipt Schedule entity - M_ReceiptSchedule table.
 * Receipt schedule definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ReceiptSchedule")
public class ReceiptSchedule extends BaseEntity {

    @Id
    @Column("M_ReceiptSchedule_ID")
    private Integer mReceiptScheduleId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("QtyOrdered")
    private BigDecimal qtyOrdered;

    @Column("QtyDelivered")
    private BigDecimal qtyDelivered;

    @Column("QtyToDeliver")
    private BigDecimal qtyToDeliver;

    @Column("Processed")
    private String processed;
}
