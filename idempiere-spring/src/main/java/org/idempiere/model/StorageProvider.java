package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Storage Provider entity - AD_StorageProvider table.
 * Storage provider configuration for attachments and archive.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_StorageProvider")
public class StorageProvider extends BaseEntity {

    @Id
    @Column("AD_StorageProvider_ID")
    private Integer adStorageProviderId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Method")
    private String method;

    @Column("Folder")
    private String folder;

    @Column("URL")
    private String url;

    @Column("UserName")
    private String userName;

    @Column("Password")
    private String password;

    @Column("IsDefault")
    private String isDefault;
}
