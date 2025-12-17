package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Issue User entity - R_IssueUser table.
 * Users reporting issues.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueUser")
public class IssueUser extends BaseEntity {

    @Id
    @Column("R_IssueUser_ID")
    private Integer rIssueUserId;

    @Column("UserName")
    private String userName;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Description")
    private String description;
}
