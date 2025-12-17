package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

/**
 * Payroll Period entity - HR_Period table.
 * Payroll period definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Period")
public class PayrollPeriod extends BaseEntity {

    @Id
    @Column("HR_Period_ID")
    private Integer hrPeriodId;

    @Column("HR_Payroll_ID")
    private Integer hrPayrollId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("StartDate")
    private LocalDate startDate;

    @Column("EndDate")
    private LocalDate endDate;

    @Column("DateAcct")
    private LocalDate dateAcct;

    @Column("PeriodNo")
    private Integer periodNo;

    @Column("HR_Year_ID")
    private Integer hrYearId;

    @Column("PeriodStatus")
    private String periodStatus;
}
