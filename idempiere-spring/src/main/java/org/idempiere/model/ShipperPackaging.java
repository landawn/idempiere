package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Shipper Packaging entity - M_ShipperPackaging table.
 * Shipper packaging configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperPackaging")
public class ShipperPackaging extends BaseEntity {

    @Id
    @Column("M_ShipperPackaging_ID")
    private Integer mShipperPackagingId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Value")
    private String value;

    @Column("Length")
    private BigDecimal length;

    @Column("Width")
    private BigDecimal width;

    @Column("Height")
    private BigDecimal height;

    @Column("Weight")
    private BigDecimal weight;

    @Column("DimensionUnit")
    private String dimensionUnit;

    @Column("WeightUnit")
    private String weightUnit;

    @Column("IsDefault")
    private String isDefault;
}
