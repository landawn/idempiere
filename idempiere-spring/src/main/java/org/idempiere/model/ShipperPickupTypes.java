package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper Pickup Types entity - M_ShipperPickupTypes table.
 * Shipper pickup type configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperPickupTypes")
public class ShipperPickupTypes extends BaseEntity {

    @Id
    @Column("M_ShipperPickupTypes_ID")
    private Integer mShipperPickupTypesId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("Name")
    private String name;

    @Column("Value")
    private String value;

    @Column("IsDefault")
    private String isDefault;
}
