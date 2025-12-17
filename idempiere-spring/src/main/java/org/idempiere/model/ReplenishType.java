package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Replenish Type entity - M_ReplenishType table.
 * Replenish type definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ReplenishType")
public class ReplenishType extends BaseEntity {

    @Id
    @Column("M_ReplenishType_ID")
    private Integer mReplenishTypeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
