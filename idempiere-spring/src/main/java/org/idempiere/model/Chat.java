package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Chat entity - CM_Chat table.
 * Chat/discussion thread.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Chat")
public class Chat extends BaseEntity {

    @Id
    @Column("CM_Chat_ID")
    private Integer cmChatId;

    @Column("CM_ChatType_ID")
    private Integer cmChatTypeId;

    @Column("Description")
    private String description;

    @Column("ConfidentialType")
    private String confidentialType;

    @Column("ModeratorStatus")
    private String moderatorStatus;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;
}
