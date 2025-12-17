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
 * Movement Line Material Allocation entity - M_MovementLineMA table.
 * Material allocation for movement line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_MovementLineMA")
public class MMovementLineMA extends BaseEntity {

    @Id
    @Column("M_MovementLineMA_ID")
    private Integer mMovementLineMaId;

    @Column("M_MovementLine_ID")
    private Integer mMovementLineId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;

    @Column("MovementQty")
    private BigDecimal movementQty;
}
