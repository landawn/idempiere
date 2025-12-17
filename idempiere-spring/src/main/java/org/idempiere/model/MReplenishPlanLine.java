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
 * Replenish Plan Line entity - M_ReplenishPlanLine table.
 * Line item in replenishment plan.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ReplenishPlanLine")
public class MReplenishPlanLine extends BaseEntity {

    @Id
    @Column("M_ReplenishPlanLine_ID")
    private Integer mReplenishPlanLineId;

    @Column("M_ReplenishPlan_ID")
    private Integer mReplenishPlanId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("IsConfirmed")
    private String isConfirmed;

    @Column("IsPlanned")
    private String isPlanned;

    @Column("Line")
    private Integer line;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Requisition_ID")
    private Integer mRequisitionId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("OrderType")
    private String orderType;

    @Column("PlannedDate")
    private LocalDateTime plannedDate;

    @Column("PlannedQty")
    private BigDecimal plannedQty;

    @Column("PP_MRP_ID")
    private Integer ppMrpId;

    @Column("QtyOnHand")
    private BigDecimal qtyOnHand;

    @Column("QtyPurchaseOrdered")
    private BigDecimal qtyPurchaseOrdered;

    @Column("QtyRequired")
    private BigDecimal qtyRequired;

    @Column("QtySalesOrdered")
    private BigDecimal qtySalesOrdered;

    @Column("RecordType")
    private String recordType;
}
