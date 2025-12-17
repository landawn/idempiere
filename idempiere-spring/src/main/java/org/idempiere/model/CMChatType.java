package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Chat Type entity.
 * Maps to CM_ChatType table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_ChatType")
public class CMChatType extends BaseEntity {

    @Id
    @Column("CM_ChatType_ID")
    private Integer cmChatTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("ModerationType")
    private String moderationType;
}
