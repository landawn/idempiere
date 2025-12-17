package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Context Help Message entity - AD_CtxHelpMsg table.
 * Context-sensitive help message.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_CtxHelpMsg")
public class CtxHelpMsg extends BaseEntity {

    @Id
    @Column("AD_CtxHelpMsg_ID")
    private Integer adCtxHelpMsgId;

    @Column("AD_CtxHelp_ID")
    private Integer adCtxHelpId;

    @Column("MsgText")
    private String msgText;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("AD_Style_ID")
    private Integer adStyleId;
}
