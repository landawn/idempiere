package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Issue Recommendation entity - R_IssueRecommendation table.
 * Issue Recommendation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueRecommendation")
public class ADIssueRecommendation extends BaseEntity {

    @Id
    @Column("R_IssueRecommendation_ID")
    private Integer rIssueRecommendationId;

    @Column("R_IssueKnown_ID")
    private Integer rIssueKnownId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;
}
