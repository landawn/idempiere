package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Acct Processor Log entity - C_AcctProcessorLog table.
 * Accounting Processor Log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctProcessorLog")
public class ADAcctProcessorLog extends BaseEntity {

    @Id
    @Column("C_AcctProcessorLog_ID")
    private Integer cAcctProcessorLogId;

    @Column("C_AcctProcessor_ID")
    private Integer cAcctProcessorId;

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
