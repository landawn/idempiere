package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Inventory Movement Line entity.
 * Maps to M_MovementLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_MovementLine")
public class MovementLine extends BaseEntity {

    @Id
    @Column("M_MovementLine_ID")
    private Integer mMovementLineId;

    @Column("M_Movement_ID")
    private Integer mMovementId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_LocatorTo_ID")
    private Integer mLocatorToId;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("TargetQty")
    private BigDecimal targetQty;

    @Column("ScrappedQty")
    private BigDecimal scrappedQty;

    @Column("ConfirmedQty")
    private BigDecimal confirmedQty;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_AttributeSetInstanceTo_ID")
    private Integer mAttributeSetInstanceToId;

    @Column("Processed")
    private String processed;

    @Column("DD_OrderLine_ID")
    private Integer ddOrderLineId;

    @Column("ReversalLine_ID")
    private Integer reversalLineId;
}
