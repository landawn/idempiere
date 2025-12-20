package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Manufacturing Order Node entity - workflow node execution.
 * Maps to PP_Order_Node table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_Order_Node")
public class PPOrderNode extends BaseEntity {

    @Id
    @Column("PP_Order_Node_ID")
    private Integer ppOrderNodeId;

    @Column("PP_Order_Workflow_ID")
    private Integer ppOrderWorkflowId;

    @Column("PP_Order_ID")
    private Integer ppOrderId;

    @Column("AD_WF_Node_ID")
    private Integer adWfNodeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Action")
    private String action;

    @Column("EntityType")
    private String entityType;

    @Column("Priority")
    private Integer priority;

    @Column("IsMilestone")
    private String isMilestone;

    @Column("IsSubcontracting")
    private String isSubcontracting;

    @Column("Duration")
    private BigDecimal duration;

    @Column("SetupTime")
    private BigDecimal setupTime;

    @Column("MovingTime")
    private BigDecimal movingTime;

    @Column("WaitingTime")
    private BigDecimal waitingTime;

    @Column("WorkingTime")
    private BigDecimal workingTime;

    @Column("QueuingTime")
    private BigDecimal queuingTime;

    @Column("DurationBaseSec")
    private BigDecimal durationBaseSec;

    @Column("OverlapUnits")
    private BigDecimal overlapUnits;

    @Column("UnitsCycles")
    private BigDecimal unitsCycles;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("DateFinish")
    private LocalDateTime dateFinish;

    @Column("DateStartSchedule")
    private LocalDateTime dateStartSchedule;

    @Column("DateFinishSchedule")
    private LocalDateTime dateFinishSchedule;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("Cost")
    private BigDecimal cost;

    @Column("AD_Image_ID")
    private Integer adImageId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("AttributeName")
    private String attributeName;

    @Column("AttributeValue")
    private String attributeValue;

    @Column("DocAction")
    private String docAction;

    @Column("Value")
    private String value;

    @Column("DynPriorityUnit")
    private String dynPriorityUnit;

    @Column("DynPriorityChange")
    private BigDecimal dynPriorityChange;

    @Column("XPosition")
    private Integer xPosition;

    @Column("YPosition")
    private Integer yPosition;

    @Column("Yield")
    private Integer yield;
}
