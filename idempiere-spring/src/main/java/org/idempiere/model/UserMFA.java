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
 * User MFA entity - AD_User_MFA table.
 * Multi-factor authentication for user.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_User_MFA")
public class UserMFA extends BaseEntity {

    @Id
    @Column("AD_User_MFA_ID")
    private Integer adUserMFAId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_MFAMethod_ID")
    private Integer adMFAMethodId;

    @Column("IsValid")
    private String isValid;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("MFASecret")
    private String mfaSecret;

    @Column("MFARegistrationMsg")
    private String mfaRegistrationMsg;

    @Column("IsUserMFAPreferred")
    private String isUserMFAPreferred;
}
