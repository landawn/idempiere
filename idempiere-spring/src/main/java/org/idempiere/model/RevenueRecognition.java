package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Revenue Recognition entity.
 * Maps to C_RevenueRecognition table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RevenueRecognition")
public class RevenueRecognition extends BaseEntity {

    @Id
    @Column("C_RevenueRecognition_ID")
    private Integer cRevenueRecognitionId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("RecognitionFrequency")
    private String recognitionFrequency;

    @Column("NoMonths")
    private Integer noMonths;

    @Column("IsTimeBased")
    private String isTimeBased;
}
