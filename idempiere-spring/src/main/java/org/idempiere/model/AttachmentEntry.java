package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attachment Entry entity - AD_AttachmentEntry table.
 * Attachment entry for binary storage.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AttachmentEntry")
public class AttachmentEntry extends BaseEntity {

    @Id
    @Column("AD_AttachmentEntry_ID")
    private Integer adAttachmentEntryId;

    @Column("AD_Attachment_ID")
    private Integer adAttachmentId;

    @Column("Name")
    private String name;

    @Column("ContentType")
    private String contentType;

    @Column("AD_StorageProvider_ID")
    private Integer adStorageProviderId;

    @Column("StorageKey")
    private String storageKey;

    @Column("SeqNo")
    private Integer seqNo;
}
