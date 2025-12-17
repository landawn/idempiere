package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replication Run entity - AD_Replication_Run table.
 * Replication execution records.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Replication_Run")
public class ReplicationRun extends BaseEntity {

    @Id
    @Column("AD_Replication_Run_ID")
    private Integer adReplicationRunId;

    @Column("AD_ReplicationStrategy_ID")
    private Integer adReplicationStrategyId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsReplicated")
    private String isReplicated;

    @Column("DateReplicated")
    private LocalDateTime dateReplicated;
}
