package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Accounting Period entity.
 * Maps to C_Period table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Period")
public class Period extends BaseEntity {

    @Id
    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("C_Year_ID")
    private Integer cYearId;

    @Column("PeriodNo")
    private Integer periodNo;

    @Column("Name")
    private String name;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("PeriodType")
    private String periodType;

    @Column("Processing")
    private String processing;
}
