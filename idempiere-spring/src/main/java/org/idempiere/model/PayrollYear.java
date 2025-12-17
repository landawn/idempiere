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
 * Payroll Year entity - HR_Year table.
 * Payroll fiscal year.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Year")
public class PayrollYear extends BaseEntity {

    @Id
    @Column("HR_Year_ID")
    private Integer hrYearId;

    @Column("HR_Payroll_ID")
    private Integer hrPayrollId;

    @Column("C_Year_ID")
    private Integer cYearId;

    @Column("Qty")
    private Integer qty;

    @Column("StartDate")
    private LocalDate startDate;

    @Column("EndDate")
    private LocalDate endDate;

    @Column("NetDays")
    private Integer netDays;
}
