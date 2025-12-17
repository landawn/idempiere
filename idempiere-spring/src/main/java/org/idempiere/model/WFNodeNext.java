package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Workflow Node Transition entity.
 * Maps to AD_WF_NodeNext table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WF_NodeNext")
public class WFNodeNext extends BaseEntity {

    @Id
    @Column("AD_WF_NodeNext_ID")
    private Integer adWfNodeNextId;

    @Column("AD_WF_Node_ID")
    private Integer adWfNodeId;

    @Column("AD_WF_Next_ID")
    private Integer adWfNextId;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("TransitionCode")
    private String transitionCode;

    @Column("IsStdUserWorkflow")
    private String isStdUserWorkflow;

    @Column("EntityType")
    private String entityType;
}
