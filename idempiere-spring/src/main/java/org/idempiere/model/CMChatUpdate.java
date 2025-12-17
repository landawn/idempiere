package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Content Management Chat Update entity - CM_ChatUpdate table.
 * Users to notify for chat updates.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ChatUpdate")
public class CMChatUpdate extends BaseEntity {

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;

    @Id
    @Column("CM_Chat_ID")
    private Integer cmChatId;

    @Column("IsSelfService")
    private String isSelfService;
}
