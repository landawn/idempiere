package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Workflow Processor Log entity - AD_WorkflowProcessorLog table.
 * Workflow Processor Log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_WorkflowProcessorLog")
public class ADWorkflowProcessorLog extends BaseEntity {

    @Id
    @Column("AD_WorkflowProcessorLog_ID")
    private Integer adWorkflowProcessorLogId;

    @Column("AD_WorkflowProcessor_ID")
    private Integer adWorkflowProcessorId;

    @Column("IsError")
    private String isError;

    @Column("Summary")
    private String summary;

    @Column("Description")
    private String description;

    @Column("Reference")
    private String reference;

    @Column("TextMsg")
    private String textMsg;

    @Column("BinaryData")
    private byte[] binaryData;
}
