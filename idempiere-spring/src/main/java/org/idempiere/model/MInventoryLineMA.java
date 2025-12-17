package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Inventory Line Material Allocation entity - M_InventoryLineMA table.
 * Material allocation for inventory line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InventoryLineMA")
public class MInventoryLineMA extends BaseEntity {

    @Id
    @Column("M_InventoryLineMA_ID")
    private Integer mInventoryLineMaId;

    @Column("M_InventoryLine_ID")
    private Integer mInventoryLineId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;

    @Column("MovementQty")
    private BigDecimal movementQty;
}
