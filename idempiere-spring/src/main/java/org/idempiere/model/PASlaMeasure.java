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
 * PA SLA Measure entity - PA_SLA_Measure table.
 * Performance Analysis SLA Measure.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_SLA_Measure")
public class PASlaMeasure extends BaseEntity {

    @Id
    @Column("PA_SLA_Measure_ID")
    private Integer paSlaMeasureId;

    @Column("PA_SLA_Goal_ID")
    private Integer paSlaGoalId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("MeasureActual")
    private BigDecimal measureActual;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;
}
