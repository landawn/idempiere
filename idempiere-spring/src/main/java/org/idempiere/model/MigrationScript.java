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
 * Migration Script entity - AD_MigrationScript table.
 * Migration Script.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_MigrationScript")
public class MigrationScript extends BaseEntity {

    @Id
    @Column("AD_MigrationScript_ID")
    private Integer adMigrationScriptId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("Script")
    private byte[] script;

    @Column("FileName")
    private String fileName;

    @Column("ProjectName")
    private String projectName;

    @Column("Reference")
    private String reference;

    @Column("URL")
    private String url;

    @Column("DeveloperName")
    private String developerName;

    @Column("ScriptRoll")
    private String scriptRoll;

    @Column("Status")
    private String status;

    @Column("IsApply")
    private String isApply;

    @Column("isRollback")
    private String isRollback;
}
