package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * CM Chat Type Update entity - CM_ChatTypeUpdate table.
 * Content Management Chat Type Update.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ChatTypeUpdate")
public class CMChatTypeUpdate extends BaseEntity {

    @Id
    @Column("CM_ChatType_ID")
    private Integer cmChatTypeId;

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("IsSelfService")
    private String isSelfService;
}
