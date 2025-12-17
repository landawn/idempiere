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
 * Accounting Period entity - C_Period table.
 * Accounting period for fiscal year.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Period")
public class AccountingPeriod extends BaseEntity {

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
}
