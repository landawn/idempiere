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
 * AD Issue entity - AD_Issue table.
 * System Issue.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Issue")
public class ADIssue extends BaseEntity {

    @Id
    @Column("AD_Issue_ID")
    private Integer adIssueId;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("Version")
    private String version;

    @Column("Name")
    private String name;

    @Column("UserName")
    private String userName;

    @Column("SupportEMail")
    private String supportEMail;

    @Column("DBAddress")
    private String dbAddress;

    @Column("Local_Host")
    private String localHost;

    @Column("OperatingSystemInfo")
    private String operatingSystemInfo;

    @Column("ReleaseTag")
    private String releaseTag;

    @Column("DatabaseInfo")
    private String databaseInfo;

    @Column("JavaInfo")
    private String javaInfo;

    @Column("Remote_Addr")
    private String remoteAddr;

    @Column("Remote_Host")
    private String remoteHost;

    @Column("IsVanillaSystem")
    private String isVanillaSystem;

    @Column("LoggerName")
    private String loggerName;

    @Column("SourceClassName")
    private String sourceClassName;

    @Column("SourceMethodName")
    private String sourceMethodName;

    @Column("LineNo")
    private Integer lineNo;

    @Column("StackTrace")
    private String stackTrace;

    @Column("ErrorTrace")
    private String errorTrace;

    @Column("Record_ID")
    private Integer recordId;

    @Column("IssueSource")
    private String issueSource;

    @Column("IssueSummary")
    private String issueSummary;

    @Column("Comments")
    private String comments;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("IsReproducible")
    private String isReproducible;

    @Column("KnownIssue_ID")
    private Integer knownIssueId;

    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("R_IssueKnown_ID")
    private Integer rIssueKnownId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("ResponseText")
    private String responseText;

    @Column("StatisticsInfo")
    private String statisticsInfo;

    @Column("ProfileInfo")
    private String profileInfo;

    @Column("SystemStatus")
    private String systemStatus;
}
