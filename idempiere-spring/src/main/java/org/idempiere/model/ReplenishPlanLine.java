package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Replenish Plan Line entity - M_ReplenishPlanLine table.
 * Material replenishment plan line items.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_ReplenishPlanLine")
public class ReplenishPlanLine extends BaseEntity {

    @Id
    @Column("M_ReplenishPlanLine_ID")
    private Integer mReplenishPlanLineId;

    @Column("M_ReplenishPlan_ID")
    private Integer mReplenishPlanId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("DateRequired")
    private LocalDate dateRequired;

    @Column("Qty")
    private BigDecimal qty;

    @Column("DocumentType")
    private String documentType;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("M_InOut_ID")
    private Integer mInOutId;

    @Column("M_Requisition_ID")
    private Integer mRequisitionId;

    @Column("PP_Order_ID")
    private Integer ppOrderId;

    @Column("DD_Order_ID")
    private Integer ddOrderId;

    @Column("IsSelected")
    private String isSelected;

    @Column("Line")
    private Integer line;
}
