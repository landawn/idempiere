package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * R Group Update entity - R_GroupUpdates table.
 * Request Group Update.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("R_GroupUpdates")
public class RGroupUpdate extends BaseEntity {

    @Id
    @Column("R_Group_ID")
    private Integer rGroupId;

    @Id
    @Column("AD_User_ID")
    private Integer adUserId;
}
