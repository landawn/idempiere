package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Broadcast Server entity - CM_BroadcastServer table.
 * Web broadcast server configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_BroadcastServer")
public class BroadcastServer extends BaseEntity {

    @Id
    @Column("CM_BroadcastServer_ID")
    private Integer cmBroadcastServerId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IP_Address")
    private String ipAddress;

    @Column("CM_Media_Server_ID")
    private Integer cmMediaServerId;
}
