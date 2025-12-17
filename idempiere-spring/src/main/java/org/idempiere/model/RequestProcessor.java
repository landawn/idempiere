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
 * Request Processor entity - R_RequestProcessor table.
 * Processes requests (scheduler).
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestProcessor")
public class RequestProcessor extends BaseEntity {

    @Id
    @Column("R_RequestProcessor_ID")
    private Integer rRequestProcessorId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("Supervisor_ID")
    private Integer supervisorId;

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("OverdueAlertDays")
    private Integer overdueAlertDays;

    @Column("OverdueAssignDays")
    private Integer overdueAssignDays;

    @Column("RemindDays")
    private Integer remindDays;

    @Column("AlertOverPriority")
    private Integer alertOverPriority;

    @Column("InactivityAlertDays")
    private Integer inactivityAlertDays;

    @Column("Frequency")
    private Integer frequency;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("Processing")
    private String processing;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("DateNextRun")
    private LocalDateTime dateNextRun;
}
