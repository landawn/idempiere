package org.idempiere.model;

import java.time.LocalDateTime;

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
    private Integer adClientId;

    /**
     * Organization ID - Organizational entity within tenant
     */
    private Integer adOrgId;

    /**
     * Active flag - Indicates if the record is active
     */
    private Boolean isActive;

    /**
     * Created timestamp
     */
    private LocalDateTime created;

    /**
     * User who created this record
     */
    private Integer createdBy;

    /**
     * Updated timestamp
     */
    private LocalDateTime updated;

    /**
     * User who last updated this record
     */
    private Integer updatedBy;
}
