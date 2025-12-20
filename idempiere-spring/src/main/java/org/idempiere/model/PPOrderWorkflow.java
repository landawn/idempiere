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
 * Manufacturing Order Workflow entity - workflow execution.
 * Maps to PP_Order_Workflow table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_Order_Workflow")
public class PPOrderWorkflow extends BaseEntity {

    @Id
    @Column("PP_Order_Workflow_ID")
    private Integer ppOrderWorkflowId;

    @Column("PP_Order_ID")
    private Integer ppOrderId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Value")
    private String value;

    @Column("DocumentNo")
    private String documentNo;

    @Column("IsValid")
    private String isValid;

    @Column("Priority")
    private Integer priority;

    @Column("WorkflowType")
    private String workflowType;

    @Column("DocValueLogic")
    private String docValueLogic;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("AD_WF_Node_ID")
    private Integer adWfNodeId;

    @Column("AD_WF_Responsible_ID")
    private Integer adWfResponsibleId;

    @Column("EntityType")
    private String entityType;

    @Column("DurationUnit")
    private String durationUnit;

    @Column("Duration")
    private BigDecimal duration;

    @Column("Cost")
    private BigDecimal cost;

    @Column("WorkingTime")
    private BigDecimal workingTime;

    @Column("WaitingTime")
    private BigDecimal waitingTime;

    @Column("QtyBatchSize")
    private BigDecimal qtyBatchSize;

    @Column("QueuingTime")
    private BigDecimal queuingTime;

    @Column("SetupTime")
    private BigDecimal setupTime;

    @Column("MovingTime")
    private BigDecimal movingTime;

    @Column("IsBetaFunctionality")
    private String isBetaFunctionality;

    @Column("Yield")
    private Integer yield;
}
