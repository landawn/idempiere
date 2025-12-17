package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replication Strategy entity - AD_ReplicationStrategy table.
 * Data replication strategy definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ReplicationStrategy")
public class ReplicationStrategy extends BaseEntity {

    @Id
    @Column("AD_ReplicationStrategy_ID")
    private Integer adReplicationStrategyId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("EntityType")
    private String entityType;

    @Column("EXP_Processor_ID")
    private Integer expProcessorId;
}
