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
 * Product BOM Line entity - Bill of Materials line.
 * Maps to PP_Product_BOMLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_Product_BOMLine")
public class PPProductBOMLine extends BaseEntity {

    @Id
    @Column("PP_Product_BOMLine_ID")
    private Integer ppProductBomLineId;

    @Column("PP_Product_BOM_ID")
    private Integer ppProductBomId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("IsQtyPercentage")
    private String isQtyPercentage;

    @Column("QtyBatch")
    private BigDecimal qtyBatch;

    @Column("QtyBOM")
    private BigDecimal qtyBom;

    @Column("IsCritical")
    private String isCritical;

    @Column("LeadTimeOffset")
    private Integer leadTimeOffset;

    @Column("Assay")
    private BigDecimal assay;

    @Column("Scrap")
    private BigDecimal scrap;

    @Column("IssueMethod")
    private String issueMethod;

    @Column("BackflushGroup")
    private String backflushGroup;

    @Column("ValidFrom")
    private LocalDateTime validFrom;

    @Column("ValidTo")
    private LocalDateTime validTo;

    @Column("M_ChangeNotice_ID")
    private Integer mChangeNoticeId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("Forecast")
    private BigDecimal forecast;

    @Column("ComponentType")
    private String componentType;

    @Column("Feature")
    private String feature;

    @Column("VariantGroup")
    private String variantGroup;
}
