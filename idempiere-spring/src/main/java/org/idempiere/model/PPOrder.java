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
 * Manufacturing Order entity.
 * Maps to PP_Order table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_Order")
public class PPOrder extends BaseEntity {

    @Id
    @Column("PP_Order_ID")
    private Integer ppOrderId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_DocTypeTarget_ID")
    private Integer cDocTypeTargetId;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("IsApproved")
    private String isApproved;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

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

    @Column("DateFinish")
    private LocalDateTime dateFinish;

    @Column("DateConfirm")
    private LocalDateTime dateConfirm;

    @Column("DateDelivered")
    private LocalDateTime dateDelivered;

    @Column("QtyOrdered")
    private BigDecimal qtyOrdered;

    @Column("QtyDelivered")
    private BigDecimal qtyDelivered;

    @Column("QtyScrap")
    private BigDecimal qtyScrap;

    @Column("QtyReject")
    private BigDecimal qtyReject;

    @Column("QtyReserved")
    private BigDecimal qtyReserved;

    @Column("QtyBatchs")
    private BigDecimal qtyBatchs;

    @Column("QtyBatchSize")
    private BigDecimal qtyBatchSize;

    @Column("QtyEntered")
    private BigDecimal qtyEntered;

    @Column("PP_Product_BOM_ID")
    private Integer ppProductBomId;

    @Column("AD_Workflow_ID")
    private Integer adWorkflowId;

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("Assay")
    private BigDecimal assay;

    @Column("Yield")
    private BigDecimal yield;

    @Column("PriorityRule")
    private String priorityRule;

    @Column("FloatBefore")
    private BigDecimal floatBefore;

    @Column("FloatAfter")
    private BigDecimal floatAfter;

    @Column("Line")
    private Integer line;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("LotNo")
    private String lotNo;

    @Column("SerNo")
    private String serNo;

    @Column("CopyFrom")
    private String copyFrom;

    @Column("OrderType")
    private String orderType;

    @Column("PP_MRP_ID")
    private Integer ppMrpId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;
}
