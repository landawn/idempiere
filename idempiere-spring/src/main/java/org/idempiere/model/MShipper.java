package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper entity - M_Shipper table.
 * Shipping method/carrier.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Shipper")
public class MShipper extends BaseEntity {

    @Id
    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Description")
    private String description;

    @Column("IsDefault")
    private String isDefault;

    @Column("M_ShipperFacade_ID")
    private Integer mShipperFacadeId;

    @Column("M_ShippingProcessor_ID")
    private Integer mShippingProcessorId;

    @Column("Name")
    private String name;

    @Column("TrackingURL")
    private String trackingURL;
}
