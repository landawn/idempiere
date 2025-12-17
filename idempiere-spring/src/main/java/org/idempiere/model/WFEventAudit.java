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
 * Workflow Event Audit entity.
 * Maps to AD_WF_EventAudit table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WF_EventAudit")
public class WFEventAudit extends BaseEntity {

    @Id
    @Column("AD_WF_EventAudit_ID")
    private Integer adWfEventAuditId;

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

    @Column("EventType")
    private String eventType;

    @Column("ElapsedTimeMS")
    private Long elapsedTimeMs;

    @Column("AttributeName")
    private String attributeName;

    @Column("OldValue")
    private String oldValue;

    @Column("NewValue")
    private String newValue;

    @Column("Description")
    private String description;

    @Column("TextMsg")
    private String textMsg;
}
