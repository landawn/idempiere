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
 * Plan for product production.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ProductionPlan")
public class MProductionPlan extends BaseEntity {

    @Id
    @Column("M_ProductionPlan_ID")
    private Integer mProductionPlanId;

    @Column("Description")
    private String description;

    @Column("Line")
    private Integer line;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Production_ID")
    private Integer mProductionId;

    @Column("Processed")
    private String processed;

    @Column("ProductionQty")
    private BigDecimal productionQty;
}
