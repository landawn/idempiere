package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Workflow Node entity.
 * Maps to AD_WF_Node table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WF_Node")
public class WFNode extends BaseEntity {

    @Id
    @Column("AD_WF_Node_ID")
    private Integer adWfNodeId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Action")
    private String action;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Workflow_ID_Direct")
    private Integer adWorkflowIdDirect;

    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Browse_ID")
    private Integer adBrowseId;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;

    @Column("EntityType")
    private String entityType;

    @Column("XPosition")
    private Integer xPosition;

    @Column("YPosition")
    private Integer yPosition;

    @Column("IsCentrallyMaintained")
    private String isCentrallyMaintained;

    @Column("JoinElement")
    private String joinElement;

    @Column("SplitElement")
    private String splitElement;

    @Column("Limit")
    private Integer limit;

    @Column("Duration")
    private Integer duration;

    @Column("Cost")
    private BigDecimal cost;

    @Column("WorkingTime")
    private Integer workingTime;

    @Column("WaitingTime")
    private Integer waitingTime;

    @Column("AD_WF_Responsible_ID")
    private Integer adWfResponsibleId;

    @Column("Priority")
    private Integer priority;

    @Column("StartMode")
    private String startMode;

    @Column("SubflowExecution")
    private String subflowExecution;

    @Column("DocAction")
    private String docAction;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AttributeName")
    private String attributeName;

    @Column("AttributeValue")
    private String attributeValue;

    @Column("DynPriorityUnit")
    private String dynPriorityUnit;

    @Column("DynPriorityChange")
    private BigDecimal dynPriorityChange;

    @Column("EMail")
    private String email;

    @Column("EMailRecipient")
    private String emailRecipient;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("SetupTime")
    private Integer setupTime;

    @Column("MovingTime")
    private Integer movingTime;

    @Column("OverlapUnits")
    private Integer overlapUnits;

    @Column("QueuingTime")
    private Integer queuingTime;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("FinishMode")
    private String finishMode;

    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("AD_View_ID")
    private Integer adViewId;

    @Column("R_MailText_ID")
    private Integer rMailTextId;
}
