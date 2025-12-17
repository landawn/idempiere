package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Time Off Balance entity - HR_LeaveBalance table.
 * Employee leave/time off balance.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_LeaveBalance")
public class TimeOffBalance extends BaseEntity {

    @Id
    @Column("HR_LeaveBalance_ID")
    private Integer hrLeaveBalanceId;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("HR_LeaveType_ID")
    private Integer hrLeaveTypeId;

    @Column("HR_Year_ID")
    private Integer hrYearId;

    @Column("Entitled")
    private BigDecimal entitled;

    @Column("Used")
    private BigDecimal used;

    @Column("Balance")
    private BigDecimal balance;

    @Column("CarriedOver")
    private BigDecimal carriedOver;

    @Column("ValidFrom")
    private LocalDate validFrom;

    @Column("ValidTo")
    private LocalDate validTo;
}
