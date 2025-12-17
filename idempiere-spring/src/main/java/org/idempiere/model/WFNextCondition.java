package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Workflow Transition Condition entity.
 * Maps to AD_WF_NextCondition table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WF_NextCondition")
public class WFNextCondition extends BaseEntity {

    @Id
    @Column("AD_WF_NextCondition_ID")
    private Integer adWfNextConditionId;

    @Column("AD_WF_NodeNext_ID")
    private Integer adWfNodeNextId;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("EntityType")
    private String entityType;

    @Column("AndOr")
    private String andOr;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("Operation")
    private String operation;

    @Column("Value")
    private String value;

    @Column("Value2")
    private String value2;
}
