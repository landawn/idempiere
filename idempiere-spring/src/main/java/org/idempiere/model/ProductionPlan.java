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
 * Production Plan entity - M_ProductionPlan table.
 * Production plan for production header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductionPlan")
public class ProductionPlan extends BaseEntity {

    @Id
    @Column("M_ProductionPlan_ID")
    private Integer mProductionPlanId;

    @Column("M_Production_ID")
    private Integer mProductionId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("ProductionQty")
    private BigDecimal productionQty;

    @Column("M_ProductionBatch_ID")
    private Integer mProductionBatchId;

    @Column("Processed")
    private String processed;
}
