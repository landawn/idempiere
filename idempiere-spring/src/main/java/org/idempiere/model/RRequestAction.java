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
 * R Request Action entity - R_RequestAction table.
 * Request Action.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestAction")
public class RRequestAction extends BaseEntity {

    @Id
    @Column("R_RequestAction_ID")
    private Integer rRequestActionId;

    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("R_Group_ID")
    private Integer rGroupId;

    @Column("R_Category_ID")
    private Integer rCategoryId;

    @Column("R_Status_ID")
    private Integer rStatusId;

    @Column("R_Resolution_ID")
    private Integer rResolutionId;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("Priority")
    private String priority;

    @Column("PriorityUser")
    private String priorityUser;

    @Column("Summary")
    private String summary;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("NullColumns")
    private String nullColumns;
}
