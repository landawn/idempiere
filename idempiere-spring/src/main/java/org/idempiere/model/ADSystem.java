package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD System entity - AD_System table.
 * System.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_System")
public class ADSystem extends BaseEntity {

    @Id
    @Column("AD_System_ID")
    private Integer adSystemId;

    @Column("Name")
    private String name;

    @Column("UserName")
    private String userName;

    @Column("Password")
    private String password;

    @Column("Info")
    private String info;

    @Column("Version")
    private String version;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("DateVersion")
    private String dateVersion;

    @Column("ReplicationType")
    private String replicationType;

    @Column("IDRangeStart")
    private Integer idRangeStart;

    @Column("IDRangeEnd")
    private Integer idRangeEnd;

    @Column("CustomPrefix")
    private String customPrefix;

    @Column("EncryptionKey")
    private String encryptionKey;

    @Column("IsAutoErrorReport")
    private String isAutoErrorReport;

    @Column("IsJustMigrated")
    private String isJustMigrated;

    @Column("SupportEMail")
    private String supportEMail;

    @Column("SupportUnits")
    private Integer supportUnits;

    @Column("DBInstance")
    private String dbInstance;

    @Column("DBAddress")
    private String dbAddress;

    @Column("NoProcessors")
    private Integer noProcessors;

    @Column("Summary")
    private String summary;

    @Column("ProfileInfo")
    private String profileInfo;

    @Column("OldName")
    private String oldName;

    @Column("StatisticsInfo")
    private String statisticsInfo;

    @Column("IsFailOnBuildDiffer")
    private String isFailOnBuildDiffer;

    @Column("IsFailOnMissingModelValidator")
    private String isFailOnMissingModelValidator;

    @Column("SystemStatus")
    private String systemStatus;

    @Column("Processing")
    private String processing;

    @Column("LastBuildInfo")
    private String lastBuildInfo;
}
