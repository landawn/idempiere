package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper entity.
 * Maps to M_Shipper table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Shipper")
public class Shipper extends BaseEntity {

    @Id
    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("TrackingURL")
    private String trackingUrl;

    @Column("IsDefault")
    private String isDefault;

    @Column("ShipperType")
    private String shipperType;

    @Column("ShipperAccount")
    private String shipperAccount;
}
