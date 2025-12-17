package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Client Info 2 entity - AD_ClientInfo2 table.
 * Additional client configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ClientInfo2")
public class ClientInfo2 extends BaseEntity {

    @Id
    @Column("AD_Client_ID")
    private Integer adClientId;

    @Column("AD_StorageProvider_ID")
    private Integer adStorageProviderId;

    @Column("StorageArchive_ID")
    private Integer storageArchiveId;

    @Column("StorageImage_ID")
    private Integer storageImageId;
}
