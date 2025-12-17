package org.idempiere.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * User entity - represents a system user or business partner contact.
 * Maps to AD_User table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_User")
public class User extends BaseEntity {

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_User_UU")
    private String adUserUu;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Password")
    private String password;

    @Column("Email")
    private String email;

    @Column("Supervisor_ID")
    private Integer supervisorId;

    @Column("C_BPartner_ID")
    private Integer cBpartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBpartnerLocationId;

    @Column("C_Greeting_ID")
    private Integer cGreetingId;

    @Column("Title")
    private String title;

    @Column("Comments")
    private String comments;

    @Column("Phone")
    private String phone;

    @Column("Phone2")
    private String phone2;

    @Column("Fax")
    private String fax;

    @Column("LastContact")
    private LocalDateTime lastContact;

    @Column("LastResult")
    private String lastResult;

    @Column("Birthday")
    private LocalDate birthday;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("EmailUser")
    private String emailUser;

    @Column("EmailUserPW")
    private String emailUserPw;

    @Column("EmailVerify")
    private String emailVerify;

    @Column("EmailVerifyDate")
    private LocalDateTime emailVerifyDate;

    @Column("NotificationType")
    private String notificationType;

    @Column("IsFullBPAccess")
    private Boolean isFullBpAccess;

    @Column("R_DefaultMailText_ID")
    private Integer rDefaultMailTextId;

    @Column("ConnectionProfile")
    private String connectionProfile;

    @Column("Value")
    private String value;

    @Column("UserPIN")
    private String userPin;

    @Column("IsLocked")
    private Boolean isLocked;

    @Column("DateAccountLocked")
    private LocalDateTime dateAccountLocked;

    @Column("FailedLoginCount")
    private Integer failedLoginCount;

    @Column("DateLastLogin")
    private LocalDateTime dateLastLogin;

    @Column("IsNoPasswordReset")
    private Boolean isNoPasswordReset;

    @Column("IsExpired")
    private Boolean isExpired;

    @Column("SecurityQuestion")
    private String securityQuestion;

    @Column("Answer")
    private String answer;

    @Column("IsSalesLead")
    private Boolean isSalesLead;

    @Column("IsInPayroll")
    private Boolean isInPayroll;

    @Column("Salt")
    private String salt;

    @Column("DatePasswordChanged")
    private LocalDateTime datePasswordChanged;

    @Column("IsSystemAccess")
    private Boolean isSystemAccess;
}
