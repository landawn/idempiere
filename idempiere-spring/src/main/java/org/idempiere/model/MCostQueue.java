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
 * Cost Queue entity - M_CostQueue table.
 * Queue for cost calculation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CostQueue")
public class MCostQueue extends BaseEntity {

    @Id
    @Column("M_CostQueue_ID")
    private Integer mCostQueueId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("CurrentCostPriceLL")
    private BigDecimal currentCostPriceLL;

    @Column("CurrentQty")
    private BigDecimal currentQty;

    @Column("DateMaterialPolicy")
    private LocalDateTime dateMaterialPolicy;

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
}
