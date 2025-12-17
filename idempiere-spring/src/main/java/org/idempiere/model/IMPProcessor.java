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
 * Import Processor entity - IMP_Processor table.
 * Import data processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("IMP_Processor")
public class IMPProcessor extends BaseEntity {

    @Id
    @Column("IMP_Processor_ID")
    private Integer impProcessorId;

    @Column("IMP_Processor_Type_ID")
    private Integer impProcessorTypeId;

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

    @Column("Help")
    private String help;

    @Column("Host")
    private String host;

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("Name")
    private String name;

    @Column("PasswordInfo")
    private String passwordInfo;

    @Column("Port")
    private Integer port;

    @Column("Processing")
    private String processing;

    @Column("UserName")
    private String userName;

    @Column("Value")
    private String value;
}
