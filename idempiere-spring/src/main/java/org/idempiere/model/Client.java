package org.idempiere.model;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Client/Tenant entity - represents a tenant in the multi-tenant iDempiere system.
 * Maps to AD_Client table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Client")
public class Client extends BaseEntity {

    @Id
    @Column("AD_Client_ID")
    private Integer adClientId;

    @Column("AD_Client_UU")
    private String adClientUu;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SMTPHost")
    private String smtpHost;

    @Column("RequestEMail")
    private String requestEmail;

    @Column("RequestUser")
    private String requestUser;

    @Column("RequestUserPW")
    private String requestUserPw;

    @Column("RequestFolder")
    private String requestFolder;

    @Column("DocumentDir")
    private String documentDir;

    @Column("IsMultiLingualDocument")
    private Boolean isMultiLingualDocument;

    @Column("IsSmtpAuthorization")
    private Boolean isSmtpAuthorization;

    @Column("IsUseBetaFunctions")
    private Boolean isUseBetaFunctions;

    @Column("IsServerEMail")
    private Boolean isServerEmail;

    @Column("AD_Language")
    private String adLanguage;

    @Column("AutoArchive")
    private String autoArchive;

    @Column("MMPolicy")
    private String mmPolicy;

    @Column("EmailTest")
    private String emailTest;

    @Column("IsPostImmediate")
    private Boolean isPostImmediate;

    @Column("IsCostImmediate")
    private Boolean isCostImmediate;

    @Column("IsStoreAttachmentsOnFileSystem")
    private Boolean isStoreAttachmentsOnFileSystem;

    @Column("WindowsAttachmentPath")
    private String windowsAttachmentPath;

    @Column("UnixAttachmentPath")
    private String unixAttachmentPath;

    @Column("StoreArchiveOnFileSystem")
    private Boolean storeArchiveOnFileSystem;

    @Column("WindowsArchivePath")
    private String windowsArchivePath;

    @Column("UnixArchivePath")
    private String unixArchivePath;
}
