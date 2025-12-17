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
 * Order Pay Schedule entity - C_OrderPaySchedule table.
 * Order payment schedule.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_OrderPaySchedule")
public class OrderPaySchedule extends BaseEntity {

    @Id
    @Column("C_OrderPaySchedule_ID")
    private Integer cOrderPayScheduleId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("DueDate")
    private LocalDateTime dueDate;

    @Column("DueAmt")
    private BigDecimal dueAmt;

    @Column("DiscountDate")
    private LocalDateTime discountDate;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("IsValid")
    private String isValid;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
