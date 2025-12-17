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
 * Cost entity - M_Cost table.
 * Product cost by organization, accounting schema, and cost element.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Cost")
public class MCost extends BaseEntity {

    @Id
    @Column("M_Cost_ID")
    private Integer mCostId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("CumulatedAmt")
    private BigDecimal cumulatedAmt;

    @Column("CumulatedQty")
    private BigDecimal cumulatedQty;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("CurrentCostPriceLL")
    private BigDecimal currentCostPriceLL;

    @Column("CurrentQty")
    private BigDecimal currentQty;

    @Column("Description")
    private String description;

    @Column("FutureCostPrice")
    private BigDecimal futureCostPrice;

    @Column("FutureCostPriceLL")
    private BigDecimal futureCostPriceLL;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("M_CostType_ID")
    private Integer mCostTypeId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("Percent")
    private BigDecimal percent;

    @Column("Processed")
    private String processed;
}
