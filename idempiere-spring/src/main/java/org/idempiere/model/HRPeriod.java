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
 * HR Period entity - payroll period.
 * Maps to HR_Period table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Period")
public class HRPeriod extends BaseEntity {

    @Id
    @Column("HR_Period_ID")
    private Integer hrPeriodId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("HR_Year_ID")
    private Integer hrYearId;

    @Column("HR_Payroll_ID")
    private Integer hrPayrollId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("StartDate")
    private LocalDateTime startDate;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("PeriodNo")
    private Integer periodNo;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("PeriodStatus")
    private String periodStatus;
}
