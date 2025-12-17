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
 * Content Management Broadcast Server entity - CM_BroadcastServer table.
 * Server for content broadcast.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_BroadcastServer")
public class CMBroadcastServer extends BaseEntity {

    @Id
    @Column("CM_BroadcastServer_ID")
    private Integer cmBroadcastServerId;

    @Column("CM_WebProject_ID")
    private Integer cmWebProjectId;

    @Column("Description")
    private String description;

    @Column("IP_Address")
    private String ipAddress;

    @Column("LastSynchronized")
    private LocalDateTime lastSynchronized;

    @Column("Name")
    private String name;
}
