package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Warehouse Section entity - M_Warehouse_Section table.
 * Warehouse section definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Warehouse_Section")
public class WarehouseSection extends BaseEntity {

    @Id
    @Column("M_Warehouse_Section_ID")
    private Integer mWarehouseSectionId;

    @Column("M_Warehouse_Area_ID")
    private Integer mWarehouseAreaId;

    @Column("Value")
    private String value;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;
}
