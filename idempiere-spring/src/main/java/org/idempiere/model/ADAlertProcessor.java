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
 * AD Alert Processor entity - AD_AlertProcessor table.
 * Alert Processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AlertProcessor")
public class ADAlertProcessor extends BaseEntity {

    @Id
    @Column("AD_AlertProcessor_ID")
    private Integer adAlertProcessorId;

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
}
