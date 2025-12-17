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
 * Production Line entity.
 * Maps to M_ProductionLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductionLine")
public class ProductionLine extends BaseEntity {

    @Id
    @Column("M_ProductionLine_ID")
    private Integer mProductionLineId;

    @Column("M_Production_ID")
    private Integer mProductionId;

    @Column("M_ProductionPlan_ID")
    private Integer mProductionPlanId;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("Description")
    private String description;

    @Column("PlannedQty")
    private BigDecimal plannedQty;

    @Column("QtyUsed")
    private BigDecimal qtyUsed;

    @Column("IsEndProduct")
    private String isEndProduct;

    @Column("Processed")
    private String processed;
}
