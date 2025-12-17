package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Chat Update entity - CM_ChatUpdate table.
 * Chat subscription/update notification.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ChatUpdate")
public class ChatUpdate extends BaseEntity {

    @Id
    @Column("CM_ChatUpdate_ID")
    private Integer cmChatUpdateId;

    @Column("CM_Chat_ID")
    private Integer cmChatId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("IsSelfService")
    private String isSelfService;
}
