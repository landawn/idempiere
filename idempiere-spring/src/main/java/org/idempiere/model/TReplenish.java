package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Replenish Temporary entity - T_Replenish table.
 * Temporary table for replenishment report.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Replenish")
public class TReplenish extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("Level_Max")
    private BigDecimal levelMax;

    @Column("Level_Min")
    private BigDecimal levelMin;

    @Column("Order_Max")
    private Integer orderMax;

    @Column("Order_Min")
    private Integer orderMin;

    @Column("Order_Pack")
    private Integer orderPack;

    @Column("QtyOnHand")
    private BigDecimal qtyOnHand;

    @Column("QtyOrdered")
    private BigDecimal qtyOrdered;

    @Column("QtyReserved")
    private BigDecimal qtyReserved;

    @Column("QtyToOrder")
    private BigDecimal qtyToOrder;

    @Column("ReplenishType")
    private String replenishType;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_WarehouseSource_ID")
    private Integer mWarehouseSourceId;
}
