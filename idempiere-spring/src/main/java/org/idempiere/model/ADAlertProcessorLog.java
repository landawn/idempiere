package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * AD Alert Processor Log entity - AD_AlertProcessorLog table.
 * Alert Processor Log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AlertProcessorLog")
public class ADAlertProcessorLog extends BaseEntity {

    @Id
    @Column("AD_AlertProcessorLog_ID")
    private Integer adAlertProcessorLogId;

    @Column("AD_AlertProcessor_ID")
    private Integer adAlertProcessorId;

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
