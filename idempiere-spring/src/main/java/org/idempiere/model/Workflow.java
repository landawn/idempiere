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
 * Workflow entity.
 * Maps to AD_Workflow table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Workflow")
public class Workflow extends BaseEntity {

    @Id
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

    @Column("AccessLevel")
    private String accessLevel;

    @Column("Author")
    private String author;

    @Column("Version")
    private Integer version;

    @Column("ValidFrom")
    private java.time.LocalDateTime validFrom;

    @Column("ValidTo")
    private java.time.LocalDateTime validTo;

    @Column("Priority")
    private Integer priority;

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

    @Column("AD_WF_Node_ID")
    private Integer adWfNodeId;

    @Column("AD_WF_Responsible_ID")
    private Integer adWfResponsibleId;

    @Column("PublishStatus")
    private String publishStatus;

    @Column("WorkflowType")
    private String workflowType;

    @Column("DocValueLogic")
    private String docValueLogic;

    @Column("IsValid")
    private String isValid;

    @Column("EntityType")
    private String entityType;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("SetupTime")
    private Integer setupTime;

    @Column("MovingTime")
    private Integer movingTime;

    @Column("ProcessType")
    private String processType;

    @Column("DocumentNo")
    private String documentNo;

    @Column("QtyBatchSize")
    private BigDecimal qtyBatchSize;

    @Column("QueuingTime")
    private Integer queuingTime;

    @Column("IsBetaFunctionality")
    private String isBetaFunctionality;

    @Column("IsDefault")
    private String isDefault;

    @Column("AD_CtxHelp_ID")
    private Integer adCtxHelpId;
}
