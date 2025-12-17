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
 * Order Line MA entity - C_OrderLine_MA table.
 * Order line material allocation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_OrderLine_MA")
public class OrderLineMA extends BaseEntity {

    @Id
    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Id
    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Id
    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;

    @Column("MovementQty")
    private BigDecimal movementQty;
}
