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
import java.time.LocalDateTime;

/**
 * Attendance entity - HR_Attendance table.
 * Employee attendance record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_Attendance")
public class Attendance extends BaseEntity {

    @Id
    @Column("HR_Attendance_ID")
    private Integer hrAttendanceId;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("HR_WorkShift_ID")
    private Integer hrWorkShiftId;

    @Column("AttendanceDate")
    private LocalDate attendanceDate;

    @Column("CheckInTime")
    private LocalDateTime checkInTime;

    @Column("CheckOutTime")
    private LocalDateTime checkOutTime;

    @Column("WorkedHours")
    private BigDecimal workedHours;

    @Column("OvertimeHours")
    private BigDecimal overtimeHours;

    @Column("LateMinutes")
    private Integer lateMinutes;

    @Column("EarlyLeaveMinutes")
    private Integer earlyLeaveMinutes;

    @Column("AttendanceStatus")
    private String attendanceStatus;

    @Column("Remarks")
    private String remarks;

    @Column("Processed")
    private String processed;
}
