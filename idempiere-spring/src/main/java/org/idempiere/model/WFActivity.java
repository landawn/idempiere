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
 * Workflow Activity entity - runtime activity instance.
 * Maps to AD_WF_Activity table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WF_Activity")
public class WFActivity extends BaseEntity {

    @Id
    @Column("AD_WF_Activity_ID")
    private Integer adWfActivityId;

    @Column("AD_WF_Process_ID")
    private Integer adWfProcessId;

    @Column("AD_WF_Node_ID")
    private Integer adWfNodeId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("AD_User_ID")
    private Integer adUserId;

    @Column("AD_WF_Responsible_ID")
    private Integer adWfResponsibleId;

    @Column("WFState")
    private String wfState;

    @Column("Priority")
    private Integer priority;

    @Column("DateLastAlert")
    private LocalDateTime dateLastAlert;

    @Column("DynPriorityStart")
    private Integer dynPriorityStart;

    @Column("EndWaitTime")
    private LocalDateTime endWaitTime;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("TextMsg")
    private String textMsg;
}
