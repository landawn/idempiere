package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replication Table entity - AD_ReplicationTable table.
 * Tables to replicate.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ReplicationTable")
public class ReplicationTable extends BaseEntity {

    @Id
    @Column("AD_ReplicationTable_ID")
    private Integer adReplicationTableId;

    @Column("AD_ReplicationStrategy_ID")
    private Integer adReplicationStrategyId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("EntityType")
    private String entityType;

    @Column("ReplicationType")
    private String replicationType;
}
