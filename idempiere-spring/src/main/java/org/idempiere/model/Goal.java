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
 * Goal entity - PA_Goal table.
 * Performance goals.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_Goal")
public class Goal extends BaseEntity {

    @Id
    @Column("PA_Goal_ID")
    private Integer paGoalId;

    @Column("PA_Measure_ID")
    private Integer paMeasureId;

    @Column("PA_ColorSchema_ID")
    private Integer paColorSchemaId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Note")
    private String note;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("MeasureTarget")
    private BigDecimal measureTarget;

    @Column("MeasureActual")
    private BigDecimal measureActual;

    @Column("MeasureScope")
    private String measureScope;

    @Column("MeasureDisplay")
    private String measureDisplay;

    @Column("GoalPerformance")
    private BigDecimal goalPerformance;

    @Column("RelativeWeight")
    private BigDecimal relativeWeight;

    @Column("DateFrom")
    private LocalDateTime dateFrom;

    @Column("DateTo")
    private LocalDateTime dateTo;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("IsSummary")
    private String isSummary;

    @Column("ChartType")
    private String chartType;
}
