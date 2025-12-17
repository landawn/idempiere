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
 * Commission Line entity.
 * Maps to C_CommissionLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CommissionLine")
public class CommissionLine extends BaseEntity {

    @Id
    @Column("C_CommissionLine_ID")
    private Integer cCommissionLineId;

    @Column("C_Commission_ID")
    private Integer cCommissionId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("CommissionOrders")
    private String commissionOrders;

    @Column("IsPositiveOnly")
    private String isPositiveOnly;

    @Column("QtyMultiplier")
    private BigDecimal qtyMultiplier;

    @Column("QtySubtract")
    private BigDecimal qtySubtract;

    @Column("AmtMultiplier")
    private BigDecimal amtMultiplier;

    @Column("AmtSubtract")
    private BigDecimal amtSubtract;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("Org_ID")
    private Integer orgId;
}
