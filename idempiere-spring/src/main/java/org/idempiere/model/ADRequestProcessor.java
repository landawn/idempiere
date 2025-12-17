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
 * AD Request Processor entity - R_RequestProcessor table.
 * Request Processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestProcessor")
public class ADRequestProcessor extends BaseEntity {

    @Id
    @Column("R_RequestProcessor_ID")
    private Integer rRequestProcessorId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("Frequency")
    private Integer frequency;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("DateNextRun")
    private LocalDateTime dateNextRun;

    @Column("Processing")
    private String processing;

    @Column("Supervisor_ID")
    private Integer supervisorId;

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("InactivityAlertDays")
    private Integer inactivityAlertDays;

    @Column("RemindDays")
    private Integer remindDays;

    @Column("OverdueAlertDays")
    private Integer overdueAlertDays;

    @Column("OverdueAssignDays")
    private Integer overdueAssignDays;

    @Column("R_RequestType_ID")
    private Integer rRequestTypeId;
}
