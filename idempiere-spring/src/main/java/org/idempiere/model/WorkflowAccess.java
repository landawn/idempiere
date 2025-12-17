package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Workflow Access entity - AD_Workflow_Access table.
 * Role access to workflows.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Workflow_Access")
public class WorkflowAccess extends BaseEntity {

    @Id
    @Column("AD_Workflow_Access_ID")
    private Integer adWorkflowAccessId;

    @Column("AD_Role_ID")
    private Integer adRoleId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("IsReadWrite")
    private String isReadWrite;
}
