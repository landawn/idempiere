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
 * PA Achievement entity - PA_Achievement table.
 * Performance Analysis Achievement.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_Achievement")
public class PAAchievement extends BaseEntity {

    @Id
    @Column("PA_Achievement_ID")
    private Integer paAchievementId;

    @Column("PA_Measure_ID")
    private Integer paMeasureId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Note")
    private String note;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("ManualActual")
    private BigDecimal manualActual;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("IsAchieved")
    private String isAchieved;
}
