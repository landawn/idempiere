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
 * Scheduler entity - scheduled processes.
 * Maps to AD_Scheduler table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Scheduler")
public class Scheduler extends BaseEntity {

    @Id
    @Column("AD_Scheduler_ID")
    private Integer adSchedulerId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("ScheduleType")
    private String scheduleType;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("Frequency")
    private Integer frequency;

    @Column("DateNextRun")
    private LocalDateTime dateNextRun;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("Supervisor_ID")
    private Integer supervisorId;

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("Processing")
    private String processing;

    @Column("AD_Schedule_ID")
    private Integer adScheduleId;

    @Column("MonthDay")
    private Integer monthDay;

    @Column("WeekDay")
    private String weekDay;

    @Column("CronPattern")
    private String cronPattern;

    @Column("IsIgnoreProcessingTime")
    private String isIgnoreProcessingTime;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("Record_ID")
    private Integer recordId;
}
