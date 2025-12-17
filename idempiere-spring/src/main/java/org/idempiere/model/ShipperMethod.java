package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper Method entity - M_ShipperMethod table.
 * Shipper shipping method.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperMethod")
public class ShipperMethod extends BaseEntity {

    @Id
    @Column("M_ShipperMethod_ID")
    private Integer mShipperMethodId;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ServiceCode")
    private String serviceCode;

    @Column("PackagingCode")
    private String packagingCode;

    @Column("IsDefault")
    private String isDefault;
}
