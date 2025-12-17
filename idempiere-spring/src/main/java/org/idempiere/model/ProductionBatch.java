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
 * Production Batch entity - M_ProductionBatch table.
 * Production batch grouping.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductionBatch")
public class ProductionBatch extends BaseEntity {

    @Id
    @Column("M_ProductionBatch_ID")
    private Integer mProductionBatchId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
