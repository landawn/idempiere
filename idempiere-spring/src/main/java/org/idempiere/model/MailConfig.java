package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Mail Config entity - AD_MailConfig table.
 * Email server configurations.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_MailConfig")
public class MailConfig extends BaseEntity {

    @Id
    @Column("AD_MailConfig_ID")
    private Integer adMailConfigId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SMTPHost")
    private String smtpHost;

    @Column("SMTPPort")
    private Integer smtpPort;

    @Column("RequestUser")
    private String requestUser;

    @Column("RequestUserPW")
    private String requestUserPW;

    @Column("Protocol")
    private String protocol;

    @Column("IsSmtpAuthorization")
    private String isSmtpAuthorization;

    @Column("IsSecureSMTP")
    private String isSecureSMTP;

    @Column("IsStartTLS")
    private String isStartTLS;

    @Column("AuthMechanism")
    private String authMechanism;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("IsDefault")
    private String isDefault;
}
