package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Attachment entity - binary file attachments.
 * Maps to AD_Attachment table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Attachment")
public class Attachment extends BaseEntity {

    @Id
    @Column("AD_Attachment_ID")
    private Integer adAttachmentId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Title")
    private String title;

    @Column("TextMsg")
    private String textMsg;

    @Column("BinaryData")
    private byte[] binaryData;
}
