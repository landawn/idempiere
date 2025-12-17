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
 * Cost detail transactions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_CostDetail")
public class CostDetail extends BaseEntity {

    @Id
    @Column("M_CostDetail_ID")
    private Integer mCostDetailId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_CostElement_ID")
    private Integer mCostElementId;

    @Column("M_CostType_ID")
    private Integer mCostTypeId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Amt")
    private BigDecimal amt;

    @Column("Qty")
    private BigDecimal qty;

    @Column("CurrentCostPrice")
    private BigDecimal currentCostPrice;

    @Column("CurrentQty")
    private BigDecimal currentQty;

    @Column("CumulatedAmt")
    private BigDecimal cumulatedAmt;

    @Column("CumulatedQty")
    private BigDecimal cumulatedQty;

    @Column("DeltaAmt")
    private BigDecimal deltaAmt;

    @Column("DeltaQty")
    private BigDecimal deltaQty;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_MovementLine_ID")
    private Integer mMovementLineId;

    @Column("M_InventoryLine_ID")
    private Integer mInventoryLineId;

    @Column("M_ProductionLine_ID")
    private Integer mProductionLineId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_OrderLine_ID")
    private Integer cOrderLineId;

    @Column("PP_Cost_Collector_ID")
    private Integer ppCostCollectorId;

    @Column("C_ProjectIssue_ID")
    private Integer cProjectIssueId;

    @Column("C_LandedCostAllocation_ID")
    private Integer cLandedCostAllocationId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("Description")
    private String description;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("Processed")
    private String processed;
}
