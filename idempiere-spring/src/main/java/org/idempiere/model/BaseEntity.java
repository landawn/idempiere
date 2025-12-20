package org.idempiere.model;

import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Base entity class containing common audit fields for all iDempiere entities.
 * All entities extend this class to inherit common properties.
 */
@Data
@SuperBuilder
@NoArgsConstructor
public abstract class BaseEntity {

    /**
     * Tenant ID - Multi-tenant support
     */
    @Column("AD_Client_ID")
    private Integer adClientId;

    /**
     * Organization ID - Organizational entity within tenant
     */
    @Column("AD_Org_ID")
    private Integer adOrgId;

    /**
     * Active flag - Indicates if the record is active
     */
    @Column("IsActive")
    private Boolean isActive;

    /**
     * Created timestamp
     */
    @Column("Created")
    private LocalDateTime created;

    /**
     * User who created this record
     */
    @Column("CreatedBy")
    private Integer createdBy;

    /**
     * Updated timestamp
     */
    @Column("Updated")
    private LocalDateTime updated;

    /**
     * User who last updated this record
     */
    @Column("UpdatedBy")
    private Integer updatedBy;
}
