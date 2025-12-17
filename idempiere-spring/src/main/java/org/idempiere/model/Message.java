package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Message entity - system messages.
 * Maps to AD_Message table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Message")
public class Message extends BaseEntity {

    @Id
    @Column("AD_Message_ID")
    private Integer adMessageId;

    @Column("Value")
    private String value;

    @Column("MsgText")
    private String msgText;

    @Column("MsgTip")
    private String msgTip;

    @Column("MsgType")
    private String msgType;

    @Column("EntityType")
    private String entityType;
}
