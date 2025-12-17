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
 * Inventory Value Temporary entity - T_InventoryValue table.
 * Temporary table for inventory valuation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_InventoryValue")
public class TInventoryValue extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("CostAmt")
    private BigDecimal costAmt;

    @Column("CostValue")
    private BigDecimal costValue;

    @Column("DateValue")
    private LocalDateTime dateValue;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("PricePO")
    private BigDecimal pricePO;

    @Column("QtyOnHand")
    private BigDecimal qtyOnHand;
}
