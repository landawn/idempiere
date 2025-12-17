package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Shipper Facade entity - M_ShipperFacade table.
 * Shipper integration facade.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ShipperFacade")
public class ShipperFacade extends BaseEntity {

    @Id
    @Column("M_ShipperFacade_ID")
    private Integer mShipperFacadeId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Classname")
    private String classname;

    @Column("IsTrackingEnabled")
    private String isTrackingEnabled;

    @Column("IsOnlineRateEnabled")
    private String isOnlineRateEnabled;

    @Column("IsShippingLabelEnabled")
    private String isShippingLabelEnabled;
}
