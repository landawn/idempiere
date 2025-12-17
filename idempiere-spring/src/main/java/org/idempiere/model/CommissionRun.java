package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Commission Run entity.
 * Maps to C_CommissionRun table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CommissionRun")
public class CommissionRun extends BaseEntity {

    @Id
    @Column("C_CommissionRun_ID")
    private Integer cCommissionRunId;

    @Column("C_Commission_ID")
    private Integer cCommissionId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
