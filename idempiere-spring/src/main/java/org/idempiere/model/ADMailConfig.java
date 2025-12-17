package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Mail Config entity - AD_MailConfig table.
 * Mail Configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_MailConfig")
public class ADMailConfig extends BaseEntity {

    @Id
    @Column("AD_MailConfig_ID")
    private Integer adMailConfigId;

    @Column("AD_Client_ID")
    private Integer adClientId;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("RequestDocType")
    private String requestDocType;

    @Column("CustomType")
    private String customType;

    @Column("Protocol")
    private String protocol;

    @Column("SMTPHost")
    private String smtpHost;

    @Column("SMTPPort")
    private Integer smtpPort;

    @Column("StartTLS")
    private String startTls;

    @Column("IMAPHost")
    private String imapHost;

    @Column("IMAPPort")
    private Integer imapPort;

    @Column("AuthMechanism")
    private String authMechanism;

    @Column("EMailUser")
    private String eMailUser;

    @Column("EMailUserPW")
    private String eMailUserPW;

    @Column("LDAPUser")
    private String ldapUser;

    @Column("IsSmtpAuthorization")
    private String isSmtpAuthorization;

    @Column("IsSSL")
    private String isSsl;

    @Column("IsDebug")
    private String isDebug;
}
