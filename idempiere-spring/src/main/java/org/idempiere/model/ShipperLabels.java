package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper Labels entity - M_ShipperLabels table.
 * Shipper label configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperLabels")
public class ShipperLabels extends BaseEntity {

    @Id
    @Column("M_ShipperLabels_ID")
    private Integer mShipperLabelsId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("Name")
    private String name;

    @Column("LabelPrintMethod")
    private String labelPrintMethod;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsLandscape")
    private String isLandscape;

    @Column("Height")
    private Integer height;

    @Column("Width")
    private Integer width;
}
