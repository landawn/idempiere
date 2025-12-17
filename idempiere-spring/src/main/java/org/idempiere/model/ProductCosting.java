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
 * Product Costing entity - M_Product_Costing table.
 * Product costing information (legacy).
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_Costing")
public class ProductCosting extends BaseEntity {

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("CurrentCostPriceLL")
    private BigDecimal currentCostPriceLL;

    @Column("FutureCostPrice")
    private BigDecimal futureCostPrice;

    @Column("FutureCostPriceLL")
    private BigDecimal futureCostPriceLL;

    @Column("CostStandard")
    private BigDecimal costStandard;

    @Column("CostStandardPOQty")
    private BigDecimal costStandardPOQty;

    @Column("CostStandardPOAmt")
    private BigDecimal costStandardPOAmt;

    @Column("CostStandardCumQty")
    private BigDecimal costStandardCumQty;

    @Column("CostStandardCumAmt")
    private BigDecimal costStandardCumAmt;

    @Column("CostAverage")
    private BigDecimal costAverage;

    @Column("CostAverageCumQty")
    private BigDecimal costAverageCumQty;

    @Column("CostAverageCumAmt")
    private BigDecimal costAverageCumAmt;

    @Column("PriceLastPO")
    private BigDecimal priceLastPO;

    @Column("PriceLastInv")
    private BigDecimal priceLastInv;

    @Column("TotalInvQty")
    private BigDecimal totalInvQty;

    @Column("TotalInvAmt")
    private BigDecimal totalInvAmt;
}
