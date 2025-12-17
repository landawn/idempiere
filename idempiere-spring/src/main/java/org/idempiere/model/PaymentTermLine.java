package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Payment Term Line entity - C_PaySchedule table.
 * Payment term schedule line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaySchedule")
public class PaymentTermLine extends BaseEntity {

    @Id
    @Column("C_PaySchedule_ID")
    private Integer cPayScheduleId;

    @Column("C_PaymentTerm_ID")
    private Integer cPaymentTermId;

    @Column("NetDays")
    private Integer netDays;

    @Column("Percentage")
    private BigDecimal percentage;

    @Column("Discount")
    private BigDecimal discount;

    @Column("DiscountDays")
    private Integer discountDays;

    @Column("IsValid")
    private String isValid;
}
