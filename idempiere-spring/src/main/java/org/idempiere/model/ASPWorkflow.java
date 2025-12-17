package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Workflow entity - ASP_Workflow table.
 * ASP workflow configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_Workflow")
public class ASPWorkflow extends BaseEntity {

    @Id
    @Column("ASP_Workflow_ID")
    private Integer aspWorkflowId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("ASP_Level_ID")
    private Integer aspLevelId;

    @Column("ASP_Status")
    private String aspStatus;
}
