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
 * Workflow Node entity - represents workflow node.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WF_Node")
public class WorkflowNode extends BaseEntity {

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

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("AD_WF_Responsible_ID")
    private Integer adWfResponsibleId;

    @Column("AD_WF_Block_ID")
    private Integer adWfBlockId;

    @Column("DocAction")
    private String docAction;

    @Column("Priority")
    private Integer priority;

    @Column("Duration")
    private Integer duration;

    @Column("DurationLimit")
    private Integer durationLimit;

    @Column("Cost")
    private BigDecimal cost;

    @Column("WorkingTime")
    private Integer workingTime;

    @Column("WaitingTime")
    private Integer waitingTime;

    @Column("JoinElement")
    private String joinElement;

    @Column("SplitElement")
    private String splitElement;

    @Column("XPosition")
    private Integer xPosition;

    @Column("YPosition")
    private Integer yPosition;

    @Column("IsCentrallyMaintained")
    private String isCentrallyMaintained;

    @Column("EntityType")
    private String entityType;

    @Column("SubflowExecution")
    private String subflowExecution;

    @Column("StartMode")
    private String startMode;

    @Column("FinishMode")
    private String finishMode;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AttributeValue")
    private String attributeValue;

    @Column("AttributeName")
    private String attributeName;

    @Column("AD_InfoWindow_ID")
    private Integer adInfoWindowId;
}
