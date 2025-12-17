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
 * Shipment/Receipt Line Material Allocation entity - M_InOutLineMA table.
 * Material allocation for shipment/receipt line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InOutLineMA")
public class MInOutLineMA extends BaseEntity {

    @Id
    @Column("M_InOutLineMA_ID")
    private Integer mInOutLineMaId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;

    @Column("MovementQty")
    private BigDecimal movementQty;
}
