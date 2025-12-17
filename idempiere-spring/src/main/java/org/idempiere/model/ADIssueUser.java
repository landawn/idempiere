package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Issue User entity - R_IssueUser table.
 * Issue User.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_IssueUser")
public class ADIssueUser extends BaseEntity {

    @Id
    @Column("R_IssueUser_ID")
    private Integer rIssueUserId;

    @Column("UserName")
    private String userName;

    @Column("Description")
    private String description;

    @Column("EMail")
    private String eMail;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_User_ID")
    private Integer adUserId;
}
