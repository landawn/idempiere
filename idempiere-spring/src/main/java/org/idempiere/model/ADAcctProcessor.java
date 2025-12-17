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
 * AD Acct Processor entity - C_AcctProcessor table.
 * Accounting Processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctProcessor")
public class ADAcctProcessor extends BaseEntity {

    @Id
    @Column("C_AcctProcessor_ID")
    private Integer cAcctProcessorId;

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

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;
}
