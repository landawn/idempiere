package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Chat Entry entity.
 * Maps to CM_ChatEntry table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ChatEntry")
public class CMChatEntry extends BaseEntity {

    @Id
    @Column("CM_ChatEntry_ID")
    private Integer cmChatEntryId;

    @Column("CM_Chat_ID")
    private Integer cmChatId;

    @Column("CharacterData")
    private String characterData;

    @Column("CM_ChatEntryParent_ID")
    private Integer cmChatEntryParentId;

    @Column("CM_ChatEntryGrandParent_ID")
    private Integer cmChatEntryGrandParentId;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("ChatEntryType")
    private String chatEntryType;

    @Column("Subject")
    private String subject;

    @Column("ModeratorStatus")
    private String moderatorStatus;

    @Column("Wiki")
    private String wiki;
}
