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
 * Recurring Document entity.
 * Maps to C_Recurring table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Recurring")
public class Recurring extends BaseEntity {

    @Id
    @Column("C_Recurring_ID")
    private Integer cRecurringId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("RecurringType")
    private String recurringType;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("Frequency")
    private Integer frequency;

    @Column("RunsMax")
    private Integer runsMax;

    @Column("RunsRemaining")
    private Integer runsRemaining;

    @Column("DateNextRun")
    private LocalDateTime dateNextRun;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

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

    @Column("Processing")
    private String processing;
}
