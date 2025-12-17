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
 * Import processor execution log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("IMP_ProcessorLog")
public class ImportProcessorLog extends BaseEntity {

    @Id
    @Column("IMP_ProcessorLog_ID")
    private Integer impProcessorLogId;

    @Column("IMP_Processor_ID")
    private Integer impProcessorId;

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

    @Column("IsError")
    private String isError;
}
