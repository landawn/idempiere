package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Accounting entity - M_Product_Acct table.
 * Product accounting settings.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_Acct")
public class MProductAcct extends BaseEntity {

    @Id
    @Column("M_Product_ID")
    private Integer mProductId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("P_Asset_Acct")
    private Integer pAssetAcct;

    @Column("P_Burden_Acct")
    private Integer pBurdenAcct;

    @Column("P_COGS_Acct")
    private Integer pCogsAcct;

    @Column("P_CostAdjustment_Acct")
    private Integer pCostAdjustmentAcct;

    @Column("P_Expense_Acct")
    private Integer pExpenseAcct;

    @Column("P_FloorStock_Acct")
    private Integer pFloorStockAcct;

    @Column("P_InventoryClearing_Acct")
    private Integer pInventoryClearingAcct;

    @Column("P_InvoicePriceVariance_Acct")
    private Integer pInvoicePriceVarianceAcct;

    @Column("P_Labor_Acct")
    private Integer pLaborAcct;

    @Column("P_MethodChangeVariance_Acct")
    private Integer pMethodChangeVarianceAcct;

    @Column("P_MixVariance_Acct")
    private Integer pMixVarianceAcct;

    @Column("P_OutsideProcessing_Acct")
    private Integer pOutsideProcessingAcct;

    @Column("P_Overhead_Acct")
    private Integer pOverheadAcct;

    @Column("P_PurchasePriceVariance_Acct")
    private Integer pPurchasePriceVarianceAcct;

    @Column("P_RateVariance_Acct")
    private Integer pRateVarianceAcct;

    @Column("P_Revenue_Acct")
    private Integer pRevenueAcct;

    @Column("P_Scrap_Acct")
    private Integer pScrapAcct;

    @Column("P_TradeDiscountGrant_Acct")
    private Integer pTradeDiscountGrantAcct;

    @Column("P_TradeDiscountRec_Acct")
    private Integer pTradeDiscountRecAcct;

    @Column("P_UsageVariance_Acct")
    private Integer pUsageVarianceAcct;

    @Column("P_WIP_Acct")
    private Integer pWipAcct;
}
