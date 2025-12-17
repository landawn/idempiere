package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Migration Step entity - AD_MigrationStep table.
 * Individual migration step.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_MigrationStep")
public class MigrationStep extends BaseEntity {

    @Id
    @Column("AD_MigrationStep_ID")
    private Integer adMigrationStepId;

    @Column("AD_Migration_ID")
    private Integer adMigrationId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("StepType")
    private String stepType;

    @Column("StatusCode")
    private String statusCode;

    @Column("Comments")
    private String comments;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Action")
    private String action;

    @Column("DBType")
    private String dbType;

    @Column("SQLStatement")
    private String sqlStatement;

    @Column("RollbackStatement")
    private String rollbackStatement;

    @Column("ErrorMsg")
    private String errorMsg;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Parse")
    private String parse;
}
