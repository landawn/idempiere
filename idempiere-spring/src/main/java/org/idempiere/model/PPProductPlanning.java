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
 * Product Planning entity - MRP planning data.
 * Maps to PP_Product_Planning table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_Product_Planning")
public class PPProductPlanning extends BaseEntity {

    @Id
    @Column("PP_Product_Planning_ID")
    private Integer ppProductPlanningId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("DD_NetworkDistribution_ID")
    private Integer ddNetworkDistributionId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("PP_Product_BOM_ID")
    private Integer ppProductBomId;

    @Column("IsRequiredMRP")
    private String isRequiredMRP;

    @Column("IsRequiredDRP")
    private String isRequiredDRP;

    @Column("IsCreatePlan")
    private String isCreatePlan;

    @Column("Planner_ID")
    private Integer plannerId;

    @Column("DeliveryTime_Promised")
    private BigDecimal deliveryTimePromised;

    @Column("Order_Policy")
    private String orderPolicy;

    @Column("Order_Period")
    private BigDecimal orderPeriod;

    @Column("Order_Qty")
    private BigDecimal orderQty;

    @Column("Order_Min")
    private BigDecimal orderMin;

    @Column("Order_Max")
    private BigDecimal orderMax;

    @Column("Order_Pack")
    private BigDecimal orderPack;

    @Column("SafetyStock")
    private BigDecimal safetyStock;

    @Column("TimeFence")
    private BigDecimal timeFence;

    @Column("TransferTime")
    private BigDecimal transferTime;

    @Column("WorkingTime")
    private BigDecimal workingTime;

    @Column("Yield")
    private Integer yield;

    @Column("IsPhantom")
    private String isPhantom;

    @Column("IsMPS")
    private String isMPS;
}
