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
 * PA SLA Goal entity - PA_SLA_Goal table.
 * Performance Analysis SLA Goal.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_SLA_Goal")
public class PASlaGoal extends BaseEntity {

    @Id
    @Column("PA_SLA_Goal_ID")
    private Integer paSlaGoalId;

    @Column("PA_SLA_Criteria_ID")
    private Integer paSlaCriteriaId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("MeasureTarget")
    private BigDecimal measureTarget;

    @Column("MeasureActual")
    private BigDecimal measureActual;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;
}
