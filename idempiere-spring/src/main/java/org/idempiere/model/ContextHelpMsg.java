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
 * Context help message content.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_CtxHelpMsg")
public class ContextHelpMsg extends BaseEntity {

    @Id
    @Column("AD_CtxHelpMsg_ID")
    private Integer adCtxHelpMsgId;

    @Column("MsgText")
    private String msgText;

    @Column("EntityType")
    private String entityType;
}
