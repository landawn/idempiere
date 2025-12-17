package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Issue System entity - R_IssueSystem table.
 * Issue System.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueSystem")
public class ADIssueSystem extends BaseEntity {

    @Id
    @Column("R_IssueSystem_ID")
    private Integer rIssueSystemId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("DBAddress")
    private String dbAddress;

    @Column("StatisticsInfo")
    private String statisticsInfo;

    @Column("ProfileInfo")
    private String profileInfo;

    @Column("SystemStatus")
    private String systemStatus;
}
