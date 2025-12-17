package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Warehouse Translation entity - M_Warehouse_Trl table.
 * Warehouse translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Warehouse_Trl")
public class WarehouseTrl extends BaseEntity {

    @Id
    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsTranslated")
    private String isTranslated;
}
