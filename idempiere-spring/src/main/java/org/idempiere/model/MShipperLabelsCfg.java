package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper Labels Configuration entity - M_ShipperLabels_Cfg table.
 * Configuration for shipper labels.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperLabels_Cfg")
public class MShipperLabelsCfg extends BaseEntity {

    @Id
    @Column("M_ShipperLabels_Cfg_ID")
    private Integer mShipperLabelsCfgId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("M_ShippingProcessor_ID")
    private Integer mShippingProcessorId;

    @Column("Description")
    private String description;

    @Column("IsDefault")
    private String isDefault;

    @Column("LabelPrintMethod")
    private String labelPrintMethod;

    @Column("Name")
    private String name;
}
