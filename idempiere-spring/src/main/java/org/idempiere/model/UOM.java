package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Unit of Measure entity.
 * Maps to C_UOM table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_UOM")
public class UOM extends BaseEntity {

    @Id
    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("X12DE355")
    private String x12DE355;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("UOMSymbol")
    private String uomSymbol;

    @Column("IsDefault")
    private String isDefault;

    @Column("StdPrecision")
    private Integer stdPrecision;

    @Column("CostingPrecision")
    private Integer costingPrecision;
}
