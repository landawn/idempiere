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
 * Issue Known entity - R_IssueKnown table.
 * Known issues in the system.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueKnown")
public class IssueKnown extends BaseEntity {

    @Id
    @Column("R_IssueKnown_ID")
    private Integer rIssueKnownId;

    @Column("R_IssueProject_ID")
    private Integer rIssueProjectId;

    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("Name")
    private String name;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("SourceClassName")
    private String sourceClassName;

    @Column("SourceMethodName")
    private String sourceMethodName;

    @Column("LoggerName")
    private String loggerName;

    @Column("LineNo")
    private Integer lineNo;

    @Column("IssueSummary")
    private String issueSummary;

    @Column("IssueStatus")
    private String issueStatus;

    @Column("KnownType")
    private String knownType;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;
}
