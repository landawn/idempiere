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
 * Accounting Processor entity - C_AcctProcessor table.
 * Automatic accounting posting processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctProcessor")
public class CAcctProcessor extends BaseEntity {

    @Id
    @Column("C_AcctProcessor_ID")
    private Integer cAcctProcessorId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

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

    @Column("KeepLogDays")
    private Integer keepLogDays;

    @Column("Name")
    private String name;

    @Column("Processing")
    private String processing;

    @Column("Supervisor_ID")
    private Integer supervisorId;
}
