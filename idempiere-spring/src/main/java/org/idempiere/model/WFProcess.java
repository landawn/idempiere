package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Workflow Process entity - runtime workflow instance.
 * Maps to AD_WF_Process table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WF_Process")
public class WFProcess extends BaseEntity {

    @Id
    @Column("AD_WF_Process_ID")
    private Integer adWfProcessId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("AD_WF_Responsible_ID")
    private Integer adWfResponsibleId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("WFState")
    private String wfState;

    @Column("Priority")
    private Integer priority;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("TextMsg")
    private String textMsg;

    @Column("AD_Message_ID")
    private Integer adMessageId;
}
