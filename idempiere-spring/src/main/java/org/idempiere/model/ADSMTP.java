package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * SMTP entity - AD_SMTP table.
 * SMTP mail server configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_SMTP")
public class ADSMTP extends BaseEntity {

    @Id
    @Column("AD_SMTP_ID")
    private Integer adSmtpId;

    @Column("ConnectionTimeout")
    private Integer connectionTimeout;

    @Column("Description")
    private String description;

    @Column("EMailTest")
    private String emailTest;

    @Column("EncryptionType")
    private String encryptionType;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsSmtpAuthorization")
    private String isSmtpAuthorization;

    @Column("Name")
    private String name;

    @Column("Port")
    private Integer port;

    @Column("RequestPassword")
    private String requestPassword;

    @Column("RequestUser")
    private String requestUser;

    @Column("SMTPHost")
    private String smtpHost;

    @Column("Timeout")
    private Integer timeout;
}
