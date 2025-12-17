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
 * Time Off Request entity - HR_LeaveRequest table.
 * Employee leave/time off request.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("HR_LeaveRequest")
public class TimeOffRequest extends BaseEntity {

    @Id
    @Column("HR_LeaveRequest_ID")
    private Integer hrLeaveRequestId;

    @Column("HR_Employee_ID")
    private Integer hrEmployeeId;

    @Column("HR_LeaveType_ID")
    private Integer hrLeaveTypeId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("StartDate")
    private LocalDate startDate;

    @Column("EndDate")
    private LocalDate endDate;

    @Column("Days")
    private BigDecimal days;

    @Column("RequestedBy")
    private Integer requestedBy;

    @Column("ApprovedBy")
    private Integer approvedBy;

    @Column("DateRequested")
    private LocalDateTime dateRequested;

    @Column("DateApproved")
    private LocalDateTime dateApproved;

    @Column("Status")
    private String status;

    @Column("Comments")
    private String comments;

    @Column("Processed")
    private String processed;
}
