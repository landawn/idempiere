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
 * Replication entity - AD_Replication table.
 * Data replication definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_Replication")
public class Replication extends BaseEntity {

    @Id
    @Column("AD_Replication_ID")
    private Integer adReplicationId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("HostAddress")
    private String hostAddress;

    @Column("HostPort")
    private Integer hostPort;

    @Column("AD_ReplicationStrategy_ID")
    private Integer adReplicationStrategyId;

    @Column("Remote_Client_ID")
    private Integer remoteClientId;

    @Column("Remote_Org_ID")
    private Integer remoteOrgId;

    @Column("DateLastRun")
    private LocalDateTime dateLastRun;

    @Column("IsRMIoverHTTP")
    private String isRMIoverHTTP;

    @Column("Prefix")
    private String prefix;

    @Column("Suffix")
    private String suffix;
}
