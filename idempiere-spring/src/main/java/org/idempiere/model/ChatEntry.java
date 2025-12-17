package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Chat Entry entity - CM_ChatEntry table.
 * Chat message entry.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ChatEntry")
public class ChatEntry extends BaseEntity {

    @Id
    @Column("CM_ChatEntry_ID")
    private Integer cmChatEntryId;

    @Column("CM_Chat_ID")
    private Integer cmChatId;

    @Column("CM_ChatEntryParent_ID")
    private Integer cmChatEntryParentId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("CharacterData")
    private String characterData;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("ModeratorStatus")
    private String moderatorStatus;

    @Column("Subject")
    private String subject;

    @Column("ChatEntryType")
    private String chatEntryType;

    @Column("CM_ChatEntryGrandparent_ID")
    private Integer cmChatEntryGrandparentId;
}
