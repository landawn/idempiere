package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replication Role Access entity - AD_Replication_Role_Access table.
 * Replication role access configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Replication_Role_Access")
public class ReplicationRoleAccess extends BaseEntity {

    @Id
    @Column("AD_Replication_ID")
    private Integer adReplicationId;

    @Id
    @Column("AD_Role_ID")
    private Integer adRoleId;
}
