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
 * Request Processor entity - R_RequestProcessor table.
 * Automated request processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestProcessor")
public class RRequestProcessor extends BaseEntity {

    @Id
    @Column("R_RequestProcessor_ID")
    private Integer rRequestProcessorId;

    @Column("Supervisor_ID")
    private Integer supervisorId;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("DateNextRun")
    private LocalDateTime dateNextRun;

    @Column("Description")
    private String description;

    @Column("Frequency")
    private Integer frequency;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("InactivityAlertDays")
    private Integer inactivityAlertDays;

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("Name")
    private String name;

    @Column("OverdueAlertDays")
    private Integer overdueAlertDays;

    @Column("OverdueAssignDays")
    private Integer overdueAssignDays;

    @Column("Processing")
    private String processing;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;

    @Column("RemindDays")
    private Integer remindDays;
}
