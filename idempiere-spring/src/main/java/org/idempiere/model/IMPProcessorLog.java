package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Processor Log entity - IMP_ProcessorLog table.
 * Log for import processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("IMP_ProcessorLog")
public class IMPProcessorLog extends BaseEntity {

    @Id
    @Column("IMP_ProcessorLog_ID")
    private Integer impProcessorLogId;

    @Column("IMP_Processor_ID")
    private Integer impProcessorId;

    @Column("BinaryData")
    private byte[] binaryData;

    @Column("Description")
    private String description;

    @Column("IsError")
    private String isError;

    @Column("Reference")
    private String reference;

    @Column("Summary")
    private String summary;

    @Column("TextMsg")
    private String textMsg;
}
