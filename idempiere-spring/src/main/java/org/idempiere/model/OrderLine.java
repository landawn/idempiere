package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;
import com.landawn.abacus.annotation.Column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Order Line entity - represents individual line items on an order.
 * Maps to C_OrderLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_OrderLine")
public class OrderLine extends BaseEntity {

    @Id
    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("C_OrderLine_UU")
    private String cOrderLineUu;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("C_BPartner_ID")
    private Integer cBpartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBpartnerLocationId;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("DateDelivered")
    private LocalDateTime dateDelivered;

    @Column("DateInvoiced")
    private LocalDateTime dateInvoiced;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("QtyOrdered")
    private BigDecimal qtyOrdered;

    @Column("QtyReserved")
    private BigDecimal qtyReserved;

    @Column("QtyDelivered")
    private BigDecimal qtyDelivered;

    @Column("QtyInvoiced")
    private BigDecimal qtyInvoiced;

    @Column("QtyLostSales")
    private BigDecimal qtyLostSales;

    @Column("QtyEntered")
    private BigDecimal qtyEntered;

    @Column("M_Shipper_ID")
    private Integer mShipperId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("PriceList")
    private BigDecimal priceList;

    @Column("PriceLimit")
    private BigDecimal priceLimit;

    @Column("PriceActual")
    private BigDecimal priceActual;

    @Column("PriceEntered")
    private BigDecimal priceEntered;

    @Column("PriceCost")
    private BigDecimal priceCost;

    @Column("Discount")
    private BigDecimal discount;

    @Column("FreightAmt")
    private BigDecimal freightAmt;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("S_ResourceAssignment_ID")
    private Integer sResourceAssignmentId;

    @Column("Ref_OrderLine_ID")
    private Integer refOrderLineId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("IsDescription")
    private Boolean isDescription;

    @Column("Processed")
    private Boolean processed;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_ProjectPhase_ID")
    private Integer cProjectPhaseId;

    @Column("C_ProjectTask_ID")
    private Integer cProjectTaskId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("RRAmt")
    private BigDecimal rrAmt;

    @Column("RRStartDate")
    private LocalDateTime rrStartDate;

    @Column("M_Promotion_ID")
    private Integer mPromotionId;

    @Column("IsQtyPercentage")
    private Boolean isQtyPercentage;

    @Column("QtyBatchs")
    private BigDecimal qtyBatchs;

    @Column("QtyBatchSize")
    private BigDecimal qtyBatchSize;

    @Column("Link_OrderLine_ID")
    private Integer linkOrderLineId;

    @Column("PP_Cost_Collector_ID")
    private Integer ppCostCollectorId;

    @Column("C_CostCenter_ID")
    private Integer cCostCenterId;

    @Column("C_Department_ID")
    private Integer cDepartmentId;
}
