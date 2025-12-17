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
 * Cost Detail entity - M_CostDetail table.
 * Detailed cost transaction.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CostDetail")
public class MCostDetail extends BaseEntity {

    @Id
    @Column("M_CostDetail_ID")
    private Integer mCostDetailId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Amt")
    private BigDecimal amt;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_LandedCostAllocation_ID")
    private Integer cLandedCostAllocationId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("C_ProjectIssue_ID")
    private Integer cProjectIssueId;

    @Column("CostAdjustment")
    private BigDecimal costAdjustment;

    @Column("CostAdjustmentDate")
    private LocalDateTime costAdjustmentDate;

    @Column("CostAmt")
    private BigDecimal costAmt;

    @Column("CostAmtLL")
    private BigDecimal costAmtLL;

    @Column("CumulatedAmt")
    private BigDecimal cumulatedAmt;

    @Column("CumulatedQty")
    private BigDecimal cumulatedQty;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("CurrentCostPriceLL")
    private BigDecimal currentCostPriceLL;

    @Column("CurrentQty")
    private BigDecimal currentQty;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("DeltaAmt")
    private BigDecimal deltaAmt;

    @Column("DeltaQty")
    private BigDecimal deltaQty;

    @Column("Description")
    private String description;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_InventoryLine_ID")
    private Integer mInventoryLineId;

    @Column("M_MatchInv_ID")
    private Integer mMatchInvId;

    @Column("M_MatchPO_ID")
    private Integer mMatchPoId;

    @Column("M_MovementLine_ID")
    private Integer mMovementLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_ProductionLine_ID")
    private Integer mProductionLineId;

    @Column("PP_Cost_Collector_ID")
    private Integer ppCostCollectorId;

    @Column("Processed")
    private String processed;

    @Column("Qty")
    private BigDecimal qty;

    @Column("Record_ID")
    private Integer recordId;

    @Column("SeqNo")
    private Integer seqNo;
}
