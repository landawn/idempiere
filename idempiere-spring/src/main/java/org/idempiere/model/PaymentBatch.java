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
 * Payment Batch entity - C_PaymentBatch table.
 * Payment batch for online processing.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_PaymentBatch")
public class PaymentBatch extends BaseEntity {

    @Id
    @Column("C_PaymentBatch_ID")
    private Integer cPaymentBatchId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_PaymentProcessor_ID")
    private Integer cPaymentProcessorId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("ProcessingDate")
    private LocalDateTime processingDate;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
