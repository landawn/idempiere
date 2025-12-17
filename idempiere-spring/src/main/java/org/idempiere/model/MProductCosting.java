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
 * Product costing information.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_Costing")
public class MProductCosting extends BaseEntity {

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("CostAverage")
    private BigDecimal costAverage;

    @Column("CostAverageCumAmt")
    private BigDecimal costAverageCumAmt;

    @Column("CostAverageCumQty")
    private BigDecimal costAverageCumQty;

    @Column("CostStandard")
    private BigDecimal costStandard;

    @Column("CostStandardCumAmt")
    private BigDecimal costStandardCumAmt;

    @Column("CostStandardCumQty")
    private BigDecimal costStandardCumQty;

    @Column("CostStandardPOAmt")
    private BigDecimal costStandardPoAmt;

    @Column("CostStandardPOQty")
    private BigDecimal costStandardPoQty;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("CurrentCostPriceLL")
    private BigDecimal currentCostPriceLL;

    @Column("CurrentQty")
    private BigDecimal currentQty;

    @Column("FutureCostPrice")
    private BigDecimal futureCostPrice;

    @Column("FutureCostPriceLL")
    private BigDecimal futureCostPriceLL;

    @Column("PriceLastInv")
    private BigDecimal priceLastInv;

    @Column("PriceLastPO")
    private BigDecimal priceLastPO;

    @Column("TotalInvAmt")
    private BigDecimal totalInvAmt;

    @Column("TotalInvQty")
    private BigDecimal totalInvQty;
}
