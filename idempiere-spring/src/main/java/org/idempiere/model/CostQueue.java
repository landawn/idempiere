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
 * Cost Queue entity - M_CostQueue table.
 * FIFO/LIFO cost queue for costing.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CostQueue")
public class CostQueue extends BaseEntity {

    @Id
    @Column("M_CostQueue_ID")
    private Integer mCostQueueId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("M_CostType_ID")
    private Integer mCostTypeId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("CurrentQty")
    private BigDecimal currentQty;
}
