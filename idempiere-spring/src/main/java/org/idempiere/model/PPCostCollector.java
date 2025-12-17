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
 * Cost Collector entity - manufacturing transaction.
 * Maps to PP_Cost_Collector table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PP_Cost_Collector")
public class PPCostCollector extends BaseEntity {

    @Id
    @Column("PP_Cost_Collector_ID")
    private Integer ppCostCollectorId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_DocTypeTarget_ID")
    private Integer cDocTypeTargetId;

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

    @Column("PP_Order_ID")
    private Integer ppOrderId;

    @Column("PP_Order_BOMLine_ID")
    private Integer ppOrderBomLineId;

    @Column("PP_Order_Node_ID")
    private Integer ppOrderNodeId;

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

    @Column("S_Resource_ID")
    private Integer sResourceId;

    @Column("MovementType")
    private String movementType;

    @Column("MovementDate")
    private LocalDateTime movementDate;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("MovementQty")
    private BigDecimal movementQty;

    @Column("ScrappedQty")
    private BigDecimal scrappedQty;

    @Column("QtyReject")
    private BigDecimal qtyReject;

    @Column("CostCollectorType")
    private String costCollectorType;

    @Column("SetupTimeReal")
    private BigDecimal setupTimeReal;

    @Column("DurationReal")
    private BigDecimal durationReal;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;

    @Column("NoDurationReported")
    private String noDurationReported;

    @Column("NoSetupTimeReported")
    private String noSetupTimeReported;

    @Column("Reversal_ID")
    private Integer reversalId;

    @Column("IsSubcontracting")
    private String isSubcontracting;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;
}
