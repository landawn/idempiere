package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Notice/Note entity.
 * Maps to AD_Note table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Note")
public class Note extends BaseEntity {

    @Id
    @Column("AD_Note_ID")
    private Integer adNoteId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Message_ID")
    private Integer adMessageId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Reference")
    private String reference;

    @Column("TextMsg")
    private String textMsg;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("AD_WF_Activity_ID")
    private Integer adWfActivityId;
}
