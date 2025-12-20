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
 * BOM Line entity - represents Bill of Materials line item.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_BOMLine")
public class BOMLine extends BaseEntity {

    @Id
    @Column("M_BOMLine_ID")
    private Integer mBomLineId;

    @Column("M_BOM_ID")
    private Integer mBomId;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("Description")
    private String description;

    @Column("ComponentType")
    private String componentType;

    @Column("QtyBOM")
    private BigDecimal qtyBom;

    @Column("QtyBatch")
    private BigDecimal qtyBatch;

    @Column("IsQtyPercentage")
    private String isQtyPercentage;

    @Column("Scrap")
    private BigDecimal scrap;

    @Column("Assay")
    private BigDecimal assay;

    @Column("IsCritical")
    private String isCritical;

    @Column("LeadTimeOffset")
    private Integer leadTimeOffset;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("CostAllocationPerc")
    private BigDecimal costAllocationPerc;

    @Column("Forecast")
    private BigDecimal forecast;
}
