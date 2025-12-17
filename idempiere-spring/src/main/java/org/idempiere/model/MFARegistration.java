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
 * MFA Registration entity - MFA_Registration table.
 * User MFA registration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("MFA_Registration")
public class MFARegistration extends BaseEntity {

    @Id
    @Column("MFA_Registration_ID")
    private Integer mfaRegistrationId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("IsComplete")
    private String isComplete;

    @Column("IsPreferred")
    private String isPreferred;

    @Column("MFA_Method_ID")
    private Integer mfaMethodId;

    @Column("MFASecret")
    private String mfaSecret;

    @Column("Name")
    private String name;

    @Column("RegistrationDate")
    private LocalDateTime registrationDate;
}
