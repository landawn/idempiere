package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Context Help entity - AD_CtxHelp table.
 * Context help message definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_CtxHelp")
public class ContextHelp extends BaseEntity {

    @Id
    @Column("AD_CtxHelp_ID")
    private Integer adCtxHelpId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("CtxType")
    private String ctxType;

    @Column("AD_CtxHelpMsg_ID")
    private Integer adCtxHelpMsgId;

    @Column("EntityType")
    private String entityType;
}
