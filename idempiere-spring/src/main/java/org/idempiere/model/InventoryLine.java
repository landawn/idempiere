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
 * Physical Inventory Line entity.
 * Maps to M_InventoryLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_InventoryLine")
public class InventoryLine extends BaseEntity {

    @Id
    @Column("M_InventoryLine_ID")
    private Integer mInventoryLineId;

    @Column("M_Inventory_ID")
    private Integer mInventoryId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("QtyBook")
    private BigDecimal qtyBook;

    @Column("QtyCount")
    private BigDecimal qtyCount;

    @Column("QtyInternalUse")
    private BigDecimal qtyInternalUse;

    @Column("InventoryType")
    private String inventoryType;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("Processed")
    private String processed;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("NewCostPrice")
    private BigDecimal newCostPrice;

    @Column("ReversalLine_ID")
    private Integer reversalLineId;
}
