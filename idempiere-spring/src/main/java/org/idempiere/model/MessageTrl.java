package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Message Translation entity - AD_Message_Trl table.
 * Message translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Message_Trl")
public class MessageTrl extends BaseEntity {

    @Id
    @Column("AD_Message_Trl_ID")
    private Integer adMessageTrlId;

    @Column("AD_Message_ID")
    private Integer adMessageId;

    @Column("AD_Language")
    private String adLanguage;

    @Column("MsgText")
    private String msgText;

    @Column("MsgTip")
    private String msgTip;

    @Column("IsTranslated")
    private String isTranslated;
}
