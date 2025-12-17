package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Scheduler Log entity.
 * Maps to AD_SchedulerLog table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_SchedulerLog")
public class SchedulerLog extends BaseEntity {

    @Id
    @Column("AD_SchedulerLog_ID")
    private Integer adSchedulerLogId;

    @Column("AD_Scheduler_ID")
    private Integer adSchedulerId;

    @Column("Summary")
    private String summary;

    @Column("IsError")
    private String isError;

    @Column("Reference")
    private String reference;

    @Column("TextMsg")
    private String textMsg;

    @Column("Description")
    private String description;

    @Column("BinaryData")
    private byte[] binaryData;
}
