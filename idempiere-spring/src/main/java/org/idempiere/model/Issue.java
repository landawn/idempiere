package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Issue entity - AD_Issue table.
 * System issues and errors.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Issue")
public class Issue extends BaseEntity {

    @Id
    @Column("AD_Issue_ID")
    private Integer adIssueId;

    @Column("R_IssueProject_ID")
    private Integer rIssueProjectId;

    @Column("R_IssueSystem_ID")
    private Integer rIssueSystemId;

    @Column("R_IssueUser_ID")
    private Integer rIssueUserId;

    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("Name")
    private String name;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("Version")
    private String version;

    @Column("DatabaseInfo")
    private String databaseInfo;

    @Column("JavaInfo")
    private String javaInfo;

    @Column("OSInfo")
    private String osInfo;

    @Column("StackTrace")
    private String stackTrace;

    @Column("ErrorTrace")
    private String errorTrace;

    @Column("SourceClassName")
    private String sourceClassName;

    @Column("SourceMethodName")
    private String sourceMethodName;

    @Column("LoggerName")
    private String loggerName;

    @Column("ResponseText")
    private String responseText;

    @Column("Comments")
    private String comments;

    @Column("IsReproducible")
    private String isReproducible;

    @Column("IsVanillaSystem")
    private String isVanillaSystem;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Local_Host")
    private String localHost;

    @Column("LineNo")
    private Integer lineNo;

    @Column("SystemStatus")
    private String systemStatus;

    @Column("StatisticsInfo")
    private String statisticsInfo;

    @Column("ProfileInfo")
    private String profileInfo;

    @Column("IssueSummary")
    private String issueSummary;

    @Column("IssueSource")
    private String issueSource;
}
