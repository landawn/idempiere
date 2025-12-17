package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Store Picking Slot entity - M_StorePickingSlot table.
 * Store picking slot definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_StorePickingSlot")
public class StorePickingSlot extends BaseEntity {

    @Id
    @Column("M_StorePickingSlot_ID")
    private Integer mStorePickingSlotId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("M_Locator_ID")
    private Integer mLocatorId;
}
