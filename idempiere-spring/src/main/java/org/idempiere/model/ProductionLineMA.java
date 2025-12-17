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
 * Production Line Material Allocation entity - M_ProductionLineMA table.
 * Production line attribute set instance allocation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductionLineMA")
public class ProductionLineMA extends BaseEntity {

    @Id
    @Column("M_ProductionLineMA_ID")
    private Integer mProductionLineMaId;

    @Column("M_ProductionLine_ID")
    private Integer mProductionLineId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;
}
