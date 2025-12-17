package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Menu entity.
 * Maps to AD_Menu table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Menu")
public class Menu extends BaseEntity {

    @Id
    @Column("AD_Menu_ID")
    private Integer adMenuId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("IsReadOnly")
    private String isReadOnly;

    @Column("Action")
    private String action;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Workbench_ID")
    private Integer adWorkbenchId;

    @Column("EntityType")
    private String entityType;

    @Column("AD_Browse_ID")
    private Integer adBrowseId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("ISCENTRALLYMAINTAINED")
    private String isCentrallyMaintained;
}
