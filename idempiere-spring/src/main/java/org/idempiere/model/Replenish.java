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
 * Replenish entity - product replenishment rules.
 * Maps to M_Replenish table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Replenish")
public class Replenish extends BaseEntity {

    @Id
    @Column("M_Replenish_UU")
    private String mReplenishUU;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_WarehouseSource_ID")
    private Integer mWarehouseSourceId;

    @Column("ReplenishType")
    private String replenishType;

    @Column("Level_Min")
    private BigDecimal levelMin;

    @Column("Level_Max")
    private BigDecimal levelMax;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;
}
