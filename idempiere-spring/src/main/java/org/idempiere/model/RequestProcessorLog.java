package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Request Processor Log entity - R_RequestProcessor_Log table.
 * Log entries for request processor runs.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestProcessor_Log")
public class RequestProcessorLog extends BaseEntity {

    @Id
    @Column("R_RequestProcessor_Log_ID")
    private Integer rRequestProcessorLogId;

    @Column("R_RequestProcessor_ID")
    private Integer rRequestProcessorId;

    @Column("Summary")
    private String summary;

    @Column("Description")
    private String description;

    @Column("IsError")
    private String isError;

    @Column("Reference")
    private String reference;

    @Column("TextMsg")
    private String textMsg;

    @Column("BinaryData")
    private byte[] binaryData;
}
