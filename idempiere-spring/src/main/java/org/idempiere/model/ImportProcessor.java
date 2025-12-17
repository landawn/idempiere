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
 * Import processor configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("IMP_Processor")
public class ImportProcessor extends BaseEntity {

    @Id
    @Column("IMP_Processor_ID")
    private Integer impProcessorId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IMP_Processor_Type_ID")
    private Integer impProcessorTypeId;

    @Column("AD_Schedule_ID")
    private Integer adScheduleId;

    @Column("Host")
    private String host;

    @Column("Port")
    private Integer port;

    @Column("Account")
    private String account;

    @Column("PasswordInfo")
    private String passwordInfo;

    @Column("Folder")
    private String folder;

    @Column("FileName")
    private String fileName;

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("DateNextRun")
    private LocalDateTime dateNextRun;

    @Column("Processing")
    private String processing;
}
