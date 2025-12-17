package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Recurring Run entity.
 * Maps to C_Recurring_Run table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Recurring_Run")
public class RecurringRun extends BaseEntity {

    @Id
    @Column("C_Recurring_Run_ID")
    private Integer cRecurringRunId;

    @Column("C_Recurring_ID")
    private Integer cRecurringId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("GL_JournalBatch_ID")
    private Integer glJournalBatchId;
}
