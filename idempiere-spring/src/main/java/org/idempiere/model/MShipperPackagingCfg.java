package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper Packaging Configuration entity - M_ShipperPackaging_Cfg table.
 * Configuration for shipper packaging.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperPackaging_Cfg")
public class MShipperPackagingCfg extends BaseEntity {

    @Id
    @Column("M_ShipperPackaging_Cfg_ID")
    private Integer mShipperPackagingCfgId;

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

    @Column("PackagingType")
    private String packagingType;
}
