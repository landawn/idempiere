package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Warehouse Area Type entity - M_Warehouse_AreaType table.
 * Warehouse area type definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Warehouse_AreaType")
public class WarehouseAreaType extends BaseEntity {

    @Id
    @Column("M_Warehouse_AreaType_ID")
    private Integer mWarehouseAreaTypeId;

    @Column("M_Warehouse_Area_ID")
    private Integer mWarehouseAreaId;

    @Column("M_LocatorType_ID")
    private Integer mLocatorTypeId;
}
