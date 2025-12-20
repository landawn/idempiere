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
 * Manufacturing Order Line entity (alias for BOM Line).
 * Maps to PP_Order_BOMLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_Order_BOMLine")
public class PPOrderLine extends BaseEntity {

    @Id
    @Column("PP_Order_BOMLine_ID")
    private Integer ppOrderBomLineId;

    @Column("PP_Order_BOM_ID")
    private Integer ppOrderBomId;

    @Column("PP_Order_ID")
    private Integer ppOrderId;

    @Column("PP_Product_BOMLine_ID")
    private Integer ppProductBomLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("IsQtyPercentage")
    private String isQtyPercentage;

    @Column("QtyBatch")
    private BigDecimal qtyBatch;

    @Column("QtyBOM")
    private BigDecimal qtyBom;

    @Column("QtyRequired")
    private BigDecimal qtyRequired;

    @Column("QtyReserved")
    private BigDecimal qtyReserved;

    @Column("QtyDelivered")
    private BigDecimal qtyDelivered;

    @Column("QtyScrap")
    private BigDecimal qtyScrap;

    @Column("QtyReject")
    private BigDecimal qtyReject;

    @Column("QtyPost")
    private BigDecimal qtyPost;

    @Column("DateRequired")
    private LocalDateTime dateRequired;

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

    @Column("ComponentType")
    private String componentType;

    @Column("Feature")
    private String feature;

    @Column("VariantGroup")
    private String variantGroup;

    @Column("M_ChangeNotice_ID")
    private Integer mChangeNoticeId;
}
