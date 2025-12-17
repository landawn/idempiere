package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Product Category Accounting entity - M_Product_Category_Acct table.
 * Product category accounting defaults.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("M_Product_Category_Acct")
public class ProductCategoryAcct extends BaseEntity {

    @Id
    @Column("M_Product_Category_ID")
    private Integer mProductCategoryId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("P_Revenue_Acct")
    private Integer pRevenueAcct;

    @Column("P_Expense_Acct")
    private Integer pExpenseAcct;

    @Column("P_Asset_Acct")
    private Integer pAssetAcct;

    @Column("P_CoGs_Acct")
    private Integer pCoGsAcct;

    @Column("P_PurchasePriceVariance_Acct")
    private Integer pPurchasePriceVarianceAcct;

    @Column("P_InvoicePriceVariance_Acct")
    private Integer pInvoicePriceVarianceAcct;

    @Column("P_TradeDiscountRec_Acct")
    private Integer pTradeDiscountRecAcct;

    @Column("P_TradeDiscountGrant_Acct")
    private Integer pTradeDiscountGrantAcct;

    @Column("P_CostAdjustment_Acct")
    private Integer pCostAdjustmentAcct;

    @Column("P_InventoryClearing_Acct")
    private Integer pInventoryClearingAcct;

    @Column("P_WIP_Acct")
    private Integer pWipAcct;

    @Column("P_FloorStock_Acct")
    private Integer pFloorStockAcct;

    @Column("P_MethodChangeVariance_Acct")
    private Integer pMethodChangeVarianceAcct;

    @Column("P_UsageVariance_Acct")
    private Integer pUsageVarianceAcct;

    @Column("P_RateVariance_Acct")
    private Integer pRateVarianceAcct;

    @Column("P_MixVariance_Acct")
    private Integer pMixVarianceAcct;

    @Column("P_LaborVariance_Acct")
    private Integer pLaborVarianceAcct;

    @Column("P_ScrapVariance_Acct")
    private Integer pScrapVarianceAcct;

    @Column("P_AverageCostVariance_Acct")
    private Integer pAverageCostVarianceAcct;

    @Column("CostingMethod")
    private String costingMethod;

    @Column("CostingLevel")
    private String costingLevel;
}
