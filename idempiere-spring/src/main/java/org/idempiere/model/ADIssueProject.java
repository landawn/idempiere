package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Issue Project entity - R_IssueProject table.
 * Issue Project.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueProject")
public class ADIssueProject extends BaseEntity {

    @Id
    @Column("R_IssueProject_ID")
    private Integer rIssueProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("ProjectCategory")
    private String projectCategory;

    @Column("StatisticsInfo")
    private String statisticsInfo;

    @Column("ProfileInfo")
    private String profileInfo;

    @Column("SystemStatus")
    private String systemStatus;
}
