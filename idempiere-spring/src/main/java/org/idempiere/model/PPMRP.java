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
 * MRP entity - Material Requirements Planning.
 * Maps to PP_MRP table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_MRP")
public class PPMRP extends BaseEntity {

    @Id
    @Column("PP_MRP_ID")
    private Integer ppMrpId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Warehouse_ID")
    private Integer mWarehouseId;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("TypeMRP")
    private String typeMRP;

    @Column("OrderType")
    private String orderType;

    @Column("DocStatus")
    private String docStatus;

    @Column("DateOrdered")
    private LocalDateTime dateOrdered;

    @Column("DatePromised")
    private LocalDateTime datePromised;

    @Column("DateStartSchedule")
    private LocalDateTime dateStartSchedule;

    @Column("DateFinishSchedule")
    private LocalDateTime dateFinishSchedule;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("DateConfirm")
    private LocalDateTime dateConfirm;

    @Column("DateSimulation")
    private LocalDateTime dateSimulation;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Value")
    private String value;

    @Column("Priority")
    private String priority;

    @Column("IsAvailable")
    private String isAvailable;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("M_Requisition_ID")
    private Integer mRequisitionId;

    @Column("M_RequisitionLine_ID")
    private Integer mRequisitionLineId;

    @Column("M_Forecast_ID")
    private Integer mForecastId;

    @Column("M_ForecastLine_ID")
    private Integer mForecastLineId;

    @Column("PP_Order_ID")
    private Integer ppOrderId;

    @Column("PP_Order_BOMLine_ID")
    private Integer ppOrderBomLineId;

    @Column("DD_Order_ID")
    private Integer ddOrderId;

    @Column("DD_OrderLine_ID")
    private Integer ddOrderLineId;

    @Column("Planner_ID")
    private Integer plannerId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;
}
