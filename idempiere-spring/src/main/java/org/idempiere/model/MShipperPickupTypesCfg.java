package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper Pickup Types Configuration entity - M_ShipperPickupTypes_Cfg table.
 * Configuration for shipper pickup types.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperPickupTypes_Cfg")
public class MShipperPickupTypesCfg extends BaseEntity {

    @Id
    @Column("M_ShipperPickupTypes_Cfg_ID")
    private Integer mShipperPickupTypesCfgId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("M_ShippingProcessor_ID")
    private Integer mShippingProcessorId;

    @Column("Description")
    private String description;

    @Column("IsDefault")
    private String isDefault;

    @Column("Name")
    private String name;

    @Column("PickupType")
    private String pickupType;
}
