package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Recurring Run entity - C_Recurring_Run table.
 * Recurring document run log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Recurring_Run")
public class CRecurringRun extends BaseEntity {

    @Id
    @Column("C_Recurring_Run_ID")
    private Integer cRecurringRunId;

    @Column("C_Recurring_ID")
    private Integer cRecurringId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("GL_Journal_ID")
    private Integer glJournalId;
}
