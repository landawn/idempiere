package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Issue System entity - R_IssueSystem table.
 * Systems for issue tracking.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueSystem")
public class IssueSystem extends BaseEntity {

    @Id
    @Column("R_IssueSystem_ID")
    private Integer rIssueSystemId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("StatisticsInfo")
    private String statisticsInfo;

    @Column("ProfileInfo")
    private String profileInfo;

    @Column("SystemStatus")
    private String systemStatus;

    @Column("DBAddress")
    private String dbAddress;
}
