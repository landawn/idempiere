package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Schedule entity - AD_Schedule table.
 * Schedule definitions (cron pattern).
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Schedule")
public class Schedule extends BaseEntity {

    @Id
    @Column("AD_Schedule_ID")
    private Integer adScheduleId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ScheduleType")
    private String scheduleType;

    @Column("CronPattern")
    private String cronPattern;

    @Column("Frequency")
    private Integer frequency;

    @Column("FrequencyType")
    private String frequencyType;

    @Column("WeekDay")
    private String weekDay;

    @Column("MonthDay")
    private Integer monthDay;

    @Column("RunOnlyOnIP")
    private String runOnlyOnIP;

    @Column("IsIgnoreProcessingTime")
    private String isIgnoreProcessingTime;
}
