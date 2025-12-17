package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replication Log entity - AD_Replication_Log table.
 * Replication execution log.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Replication_Log")
public class ReplicationLog extends BaseEntity {

    @Id
    @Column("AD_Replication_Log_ID")
    private Integer adReplicationLogId;

    @Column("AD_Replication_Run_ID")
    private Integer adReplicationRunId;

    @Column("AD_ReplicationTable_ID")
    private Integer adReplicationTableId;

    @Column("P_Msg")
    private String pMsg;

    @Column("IsReplicated")
    private String isReplicated;
}
