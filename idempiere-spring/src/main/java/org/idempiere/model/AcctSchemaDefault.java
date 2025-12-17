package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Accounting Schema Default entity.
 * Maps to C_AcctSchema_Default table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_AcctSchema_Default")
public class AcctSchemaDefault extends BaseEntity {

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("W_Inventory_Acct")
    private Integer wInventoryAcct;

    @Column("W_Differences_Acct")
    private Integer wDifferencesAcct;

    @Column("W_Revaluation_Acct")
    private Integer wRevaluationAcct;

    @Column("W_InvActualAdjust_Acct")
    private Integer wInvActualAdjustAcct;

    @Column("P_Revenue_Acct")
    private Integer pRevenueAcct;

    @Column("P_Expense_Acct")
    private Integer pExpenseAcct;

    @Column("P_Asset_Acct")
    private Integer pAssetAcct;

    @Column("P_COGS_Acct")
    private Integer pCogsAcct;

    @Column("P_PurchasePriceVariance_Acct")
    private Integer pPurchasePriceVarianceAcct;

    @Column("P_InvoicePriceVariance_Acct")
    private Integer pInvoicePriceVarianceAcct;

    @Column("P_TradeDiscountRec_Acct")
    private Integer pTradeDiscountRecAcct;

    @Column("P_TradeDiscountGrant_Acct")
    private Integer pTradeDiscountGrantAcct;

    @Column("C_Receivable_Acct")
    private Integer cReceivableAcct;

    @Column("C_Receivable_Services_Acct")
    private Integer cReceivableServicesAcct;

    @Column("C_Prepayment_Acct")
    private Integer cPrepaymentAcct;

    @Column("V_Liability_Acct")
    private Integer vLiabilityAcct;

    @Column("V_Liability_Services_Acct")
    private Integer vLiabilityServicesAcct;

    @Column("V_Prepayment_Acct")
    private Integer vPrepaymentAcct;

    @Column("PayDiscount_Exp_Acct")
    private Integer payDiscountExpAcct;

    @Column("PayDiscount_Rev_Acct")
    private Integer payDiscountRevAcct;

    @Column("WriteOff_Acct")
    private Integer writeOffAcct;

    @Column("UnrealizedGain_Acct")
    private Integer unrealizedGainAcct;

    @Column("UnrealizedLoss_Acct")
    private Integer unrealizedLossAcct;

    @Column("RealizedGain_Acct")
    private Integer realizedGainAcct;

    @Column("RealizedLoss_Acct")
    private Integer realizedLossAcct;

    @Column("Withholding_Acct")
    private Integer withholdingAcct;

    @Column("E_Prepayment_Acct")
    private Integer ePrepaymentAcct;

    @Column("E_Expense_Acct")
    private Integer eExpenseAcct;

    @Column("PJ_Asset_Acct")
    private Integer pjAssetAcct;

    @Column("PJ_WIP_Acct")
    private Integer pjWipAcct;

    @Column("T_Expense_Acct")
    private Integer tExpenseAcct;

    @Column("T_Liability_Acct")
    private Integer tLiabilityAcct;

    @Column("T_Receivables_Acct")
    private Integer tReceivablesAcct;

    @Column("T_Due_Acct")
    private Integer tDueAcct;

    @Column("T_Credit_Acct")
    private Integer tCreditAcct;

    @Column("B_InTransit_Acct")
    private Integer bInTransitAcct;

    @Column("B_Asset_Acct")
    private Integer bAssetAcct;

    @Column("B_Expense_Acct")
    private Integer bExpenseAcct;

    @Column("B_InterestRev_Acct")
    private Integer bInterestRevAcct;

    @Column("B_InterestExp_Acct")
    private Integer bInterestExpAcct;

    @Column("B_Unidentified_Acct")
    private Integer bUnidentifiedAcct;

    @Column("B_SettlementGain_Acct")
    private Integer bSettlementGainAcct;

    @Column("B_SettlementLoss_Acct")
    private Integer bSettlementLossAcct;

    @Column("B_RevaluationGain_Acct")
    private Integer bRevaluationGainAcct;

    @Column("B_RevaluationLoss_Acct")
    private Integer bRevaluationLossAcct;

    @Column("B_PaymentSelect_Acct")
    private Integer bPaymentSelectAcct;

    @Column("B_UnallocatedCash_Acct")
    private Integer bUnallocatedCashAcct;

    @Column("Ch_Expense_Acct")
    private Integer chExpenseAcct;

    @Column("Ch_Revenue_Acct")
    private Integer chRevenueAcct;

    @Column("UnEarnedRevenue_Acct")
    private Integer unEarnedRevenueAcct;

    @Column("NotInvoicedReceipts_Acct")
    private Integer notInvoicedReceiptsAcct;

    @Column("NotInvoicedRevenue_Acct")
    private Integer notInvoicedRevenueAcct;

    @Column("NotInvoicedReceivables_Acct")
    private Integer notInvoicedReceivablesAcct;

    @Column("CB_Asset_Acct")
    private Integer cbAssetAcct;

    @Column("CB_CashTransfer_Acct")
    private Integer cbCashTransferAcct;

    @Column("CB_Differences_Acct")
    private Integer cbDifferencesAcct;

    @Column("CB_Expense_Acct")
    private Integer cbExpenseAcct;

    @Column("CB_Receipt_Acct")
    private Integer cbReceiptAcct;
}
