package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Cost entity.
 * Maps to M_Cost table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Cost")
public class Cost extends BaseEntity {

    @Id
    @Column("M_Cost_UU")
    private String mCostUU;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("M_CostType_ID")
    private Integer mCostTypeId;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("CurrentCostPriceLL")
    private BigDecimal currentCostPriceLL;

    @Column("FutureCostPrice")
    private BigDecimal futureCostPrice;

    @Column("FutureCostPriceLL")
    private BigDecimal futureCostPriceLL;

    @Column("CurrentQty")
    private BigDecimal currentQty;

    @Column("CumulatedAmt")
    private BigDecimal cumulatedAmt;

    @Column("CumulatedAmtLL")
    private BigDecimal cumulatedAmtLL;

    @Column("CumulatedQty")
    private BigDecimal cumulatedQty;

    @Column("IsCostFrozen")
    private String isCostFrozen;

    @Column("Percent")
    private Integer percent;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;
}
