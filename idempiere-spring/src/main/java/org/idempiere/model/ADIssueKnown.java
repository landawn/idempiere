package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Issue Known entity - R_IssueKnown table.
 * Known Issue.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueKnown")
public class ADIssueKnown extends BaseEntity {

    @Id
    @Column("R_IssueKnown_ID")
    private Integer rIssueKnownId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("R_IssueProject_ID")
    private Integer rIssueProjectId;

    @Column("R_IssueStatus_ID")
    private Integer rIssueStatusId;

    @Column("R_IssueSystem_ID")
    private Integer rIssueSystemId;

    @Column("R_IssueUser_ID")
    private Integer rIssueUserId;

    @Column("ReleaseNo")
    private String releaseNo;

    @Column("IssueSource")
    private String issueSource;

    @Column("SourceClassName")
    private String sourceClassName;

    @Column("SourceMethodName")
    private String sourceMethodName;

    @Column("LineNo")
    private Integer lineNo;

    @Column("LoggerName")
    private String loggerName;

    @Column("IssueSummary")
    private String issueSummary;

    @Column("Processing")
    private String processing;
}
