package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Migration Data entity - AD_MigrationData table.
 * Migration step data.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_MigrationData")
public class MigrationData extends BaseEntity {

    @Id
    @Column("AD_MigrationData_ID")
    private Integer adMigrationDataId;

    @Column("AD_MigrationStep_ID")
    private Integer adMigrationStepId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("IsOldNull")
    private String isOldNull;

    @Column("IsNewNull")
    private String isNewNull;

    @Column("OldValue")
    private String oldValue;

    @Column("NewValue")
    private String newValue;

    @Column("BackupValue")
    private String backupValue;

    @Column("IsBackupNull")
    private String isBackupNull;
}
