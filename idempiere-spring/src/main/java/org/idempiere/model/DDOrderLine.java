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
 * Distribution Order Line entity.
 * Maps to DD_OrderLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("DD_OrderLine")
public class DDOrderLine extends BaseEntity {

    @Id
    @Column("DD_OrderLine_ID")
    private Integer ddOrderLineId;

    @Column("DD_Order_ID")
    private Integer ddOrderId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("M_LocatorTo_ID")
    private Integer mLocatorToId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_AttributeSetInstanceTo_ID")
    private Integer mAttributeSetInstanceToId;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("QtyOrdered")
    private BigDecimal qtyOrdered;

    @Column("QtyDelivered")
    private BigDecimal qtyDelivered;

    @Column("QtyInTransit")
    private BigDecimal qtyInTransit;

    @Column("QtyEntered")
    private BigDecimal qtyEntered;

    @Column("TargetQty")
    private BigDecimal targetQty;

    @Column("PickedQty")
    private BigDecimal pickedQty;

    @Column("ConfirmedQty")
    private BigDecimal confirmedQty;

    @Column("ScrappedQty")
    private BigDecimal scrappedQty;

    @Column("IsInvoiced")
    private String isInvoiced;

    @Column("Processed")
    private String processed;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("PP_Order_BOMLine_ID")
    private Integer ppOrderBomLineId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;
}
