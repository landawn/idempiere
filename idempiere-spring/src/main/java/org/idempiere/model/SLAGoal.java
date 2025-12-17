package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * SLA Goal entity - PA_SLA_Goal table.
 * Service Level Agreement goals.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_SLA_Goal")
public class SLAGoal extends BaseEntity {

    @Id
    @Column("PA_SLA_Goal_ID")
    private Integer paSlaGoalId;

    @Column("PA_SLA_Criteria_ID")
    private Integer paSlaCriteriaId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;

    @Column("MeasureTarget")
    private BigDecimal measureTarget;

    @Column("MeasureActual")
    private BigDecimal measureActual;

    @Column("DateLastRun")
    private java.time.LocalDateTime dateLastRun;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
