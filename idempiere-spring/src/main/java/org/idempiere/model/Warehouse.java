package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Warehouse entity - storage locations.
 * Maps to M_Warehouse table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Warehouse")
public class Warehouse extends BaseEntity {

    @Id
    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_Location_ID")
    private Integer cLocationId;

    @Column("Separator")
    private String separator;

    @Column("IsInTransit")
    private String isInTransit;

    @Column("IsDisallowNegativeInv")
    private String isDisallowNegativeInv;

    @Column("M_WarehouseSource_ID")
    private Integer mWarehouseSourceId;

    @Column("Replenishment_Class")
    private String replenishmentClass;
}
