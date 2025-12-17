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
 * Media Deploy entity - CM_Media_Deploy table.
 * Web media deployment.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("CM_Media_Deploy")
public class MediaDeploy extends BaseEntity {

    @Id
    @Column("CM_Media_Deploy_ID")
    private Integer cmMediaDeployId;

    @Column("CM_Media_ID")
    private Integer cmMediaId;

    @Column("CM_Media_Server_ID")
    private Integer cmMediaServerId;

    @Column("Description")
    private String description;

    @Column("LastSynchronized")
    private LocalDateTime lastSynchronized;

    @Column("IsDeployed")
    private String isDeployed;
}
