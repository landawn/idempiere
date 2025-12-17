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
 * House Keeping entity - AD_HouseKeeping table.
 * House keeping maintenance tasks.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_HouseKeeping")
public class ADHouseKeeping extends BaseEntity {

    @Id
    @Column("AD_HouseKeeping_ID")
    private Integer adHouseKeepingId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("BackupFolder")
    private String backupFolder;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsSaveInHistoric")
    private String isSaveInHistoric;

    @Column("IsExportXMLBackup")
    private String isExportXmlBackup;

    @Column("LastDeleted")
    private Integer lastDeleted;

    @Column("LastRun")
    private LocalDateTime lastRun;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;

    @Column("WhereClause")
    private String whereClause;
}
