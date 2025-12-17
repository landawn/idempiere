package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Accounting Processor Log entity - C_AcctProcessorLog table.
 * Log entries for accounting processor.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctProcessorLog")
public class CAcctProcessorLog extends BaseEntity {

    @Id
    @Column("C_AcctProcessorLog_ID")
    private Integer cAcctProcessorLogId;

    @Column("BinaryData")
    private byte[] binaryData;

    @Column("C_AcctProcessor_ID")
    private Integer cAcctProcessorId;

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
