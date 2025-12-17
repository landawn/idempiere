package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attachment Note entity.
 * Maps to AD_AttachmentNote table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AttachmentNote")
public class AttachmentNote extends BaseEntity {

    @Id
    @Column("AD_AttachmentNote_ID")
    private Integer adAttachmentNoteId;

    @Column("AD_Attachment_ID")
    private Integer adAttachmentId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("Title")
    private String title;

    @Column("TextMsg")
    private String textMsg;
}
