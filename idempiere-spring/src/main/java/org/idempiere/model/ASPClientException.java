package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * ASP Client Exception entity - ASP_ClientException table.
 * ASP client-specific exceptions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("ASP_ClientException")
public class ASPClientException extends BaseEntity {

    @Id
    @Column("ASP_ClientException_ID")
    private Integer aspClientExceptionId;

    @Column("AD_Field_ID")
    private Integer adFieldId;

    @Column("AD_Form_ID")
    private Integer adFormId;

    @Column("AD_Process_ID")
    private Integer adProcessId;

    @Column("AD_Process_Para_ID")
    private Integer adProcessParaId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Task_ID")
    private Integer adTaskId;

    @Column("AD_WF_Node_ID")
    private Integer adWfNodeId;

    @Column("AD_Window_ID")
    private Integer adWindowId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("ASP_Status")
    private String aspStatus;
}
