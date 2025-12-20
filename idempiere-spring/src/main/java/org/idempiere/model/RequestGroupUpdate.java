package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Request Group Update entity - R_GroupUpdates table.
 * Group update notifications.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_GroupUpdates")
public class RequestGroupUpdate extends BaseEntity {

    @Id
    @Column("R_GroupUpdates_ID")
    private Integer rGroupUpdatesId;

    @Column("R_Group_ID")
    private Integer rGroupId;

    @Column("AD_User_ID")
    private Integer adUserId;
}
