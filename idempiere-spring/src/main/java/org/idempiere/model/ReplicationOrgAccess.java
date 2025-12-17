package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replication Org Access entity - AD_ReplicationOrgAccess table.
 * Replication organization access configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ReplicationOrgAccess")
public class ReplicationOrgAccess extends BaseEntity {

    @Id
    @Column("AD_ReplicationOrgAccess_ID")
    private Integer adReplicationOrgAccessId;

    @Column("AD_ReplicationStrategy_ID")
    private Integer adReplicationStrategyId;

    @Column("AD_Org_ID")
    private Integer adOrgId;

    @Column("IsReadOnly")
    private String isReadOnly;
}
