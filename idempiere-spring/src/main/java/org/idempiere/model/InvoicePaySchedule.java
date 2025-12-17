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
 * Invoice Pay Schedule entity - C_InvoicePaySchedule table.
 * Invoice payment schedule.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InvoicePaySchedule")
public class InvoicePaySchedule extends BaseEntity {

    @Id
    @Column("C_InvoicePaySchedule_ID")
    private Integer cInvoicePayScheduleId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

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
