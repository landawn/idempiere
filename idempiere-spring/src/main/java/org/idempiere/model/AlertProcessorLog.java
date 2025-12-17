package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Alert Processor Log entity - AD_AlertProcessorLog table.
 * Alert processor execution log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_AlertProcessorLog")
public class AlertProcessorLog extends BaseEntity {

    @Id
    @Column("AD_AlertProcessorLog_ID")
    private Integer adAlertProcessorLogId;

    @Column("AD_Alert_ID")
    private Integer adAlertId;

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
