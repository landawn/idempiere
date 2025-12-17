package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Toolbar Button entity.
 * Maps to AD_ToolBarButton table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ToolBarButton")
public class ToolBarButton extends BaseEntity {

    @Id
    @Column("AD_ToolBarButton_ID")
    private Integer adToolBarButtonId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("ComponentName")
    private String componentName;

    @Column("EntityType")
    private String entityType;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("Action")
    private String action;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("IsCustomization")
    private String isCustomization;

    @Column("DisplayLogic")
    private String displayLogic;

    @Column("ReadOnlyLogic")
    private String readOnlyLogic;

    @Column("KeyStroke")
    private String keyStroke;

    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("IsAddSeparator")
    private String isAddSeparator;

    @Column("ActionClassName")
    private String actionClassName;
}
