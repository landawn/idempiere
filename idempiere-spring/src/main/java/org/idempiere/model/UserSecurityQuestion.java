package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User Security Question entity - AD_UserSecurityQuestion table.
 * User security question for password recovery.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_UserSecurityQuestion")
public class UserSecurityQuestion extends BaseEntity {

    @Id
    @Column("AD_UserSecurityQuestion_ID")
    private Integer adUserSecurityQuestionId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_SecurityQuestion_ID")
    private Integer adSecurityQuestionId;

    @Column("SecurityAnswer")
    private String securityAnswer;

    @Column("SeqNo")
    private Integer seqNo;
}
