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
 * AD Workflow Processor entity - AD_WorkflowProcessor table.
 * Workflow Processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WorkflowProcessor")
public class ADWorkflowProcessor extends BaseEntity {

    @Id
    @Column("AD_WorkflowProcessor_ID")
    private Integer adWorkflowProcessorId;

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

    @Column("AlertOverPriority")
    private Integer alertOverPriority;
}
