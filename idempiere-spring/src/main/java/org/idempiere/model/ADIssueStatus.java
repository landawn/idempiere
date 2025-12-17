package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Issue Status entity - R_IssueStatus table.
 * Issue Status.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueStatus")
public class ADIssueStatus extends BaseEntity {

    @Id
    @Column("R_IssueStatus_ID")
    private Integer rIssueStatusId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
