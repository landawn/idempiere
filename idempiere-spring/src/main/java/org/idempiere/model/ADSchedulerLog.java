package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * AD Scheduler Log entity - AD_SchedulerLog table.
 * Scheduler Log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_SchedulerLog")
public class ADSchedulerLog extends BaseEntity {

    @Id
    @Column("AD_SchedulerLog_ID")
    private Integer adSchedulerLogId;

    @Column("AD_Scheduler_ID")
    private Integer adSchedulerId;

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
