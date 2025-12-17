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
 * Context-sensitive help definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_CtxHelp")
public class CtxHelp extends BaseEntity {

    @Id
    @Column("AD_CtxHelp_ID")
    private Integer adCtxHelpId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("CtxType")
    private String ctxType;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;
}
