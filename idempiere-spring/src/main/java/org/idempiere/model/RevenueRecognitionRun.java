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
 * Revenue Recognition Run entity - C_RevenueRecognition_Run table.
 * Revenue recognition processing run.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RevenueRecognition_Run")
public class RevenueRecognitionRun extends BaseEntity {

    @Id
    @Column("C_RevenueRecognition_Run_ID")
    private Integer cRevenueRecognitionRunId;

    @Column("C_RevenueRecognition_Plan_ID")
    private Integer cRevenueRecognitionPlanId;

    @Column("GL_Journal_ID")
    private Integer glJournalId;

    @Column("RecognizedAmt")
    private BigDecimal recognizedAmt;

    @Column("RecognitionDate")
    private LocalDateTime recognitionDate;
}
