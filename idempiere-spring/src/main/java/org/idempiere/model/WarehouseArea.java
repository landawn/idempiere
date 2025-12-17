package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Warehouse Area entity - M_Warehouse_Area table.
 * Warehouse area definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Warehouse_Area")
public class WarehouseArea extends BaseEntity {

    @Id
    @Column("M_Warehouse_Area_ID")
    private Integer mWarehouseAreaId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
