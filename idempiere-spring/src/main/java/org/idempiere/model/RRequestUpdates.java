package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Request Updates entity - R_RequestUpdates table.
 * Users to notify for request updates.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_RequestUpdates")
public class RRequestUpdates extends BaseEntity {

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;

    @Id
    @Column("R_Request_ID")
    private Integer rRequestId;

    @Column("IsSelfService")
    private String isSelfService;
}
