package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * BP Group Accounting entity - C_BP_Group_Acct table.
 * Business partner group accounting configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BP_Group_Acct")
public class BPGroupAcct extends BaseEntity {

    @Id
    @Column("C_BP_Group_ID")
    private Integer cBPGroupId;

    @Id
    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_Receivable_Acct")
    private Integer cReceivableAcct;

    @Column("C_Receivable_Services_Acct")
    private Integer cReceivableServicesAcct;

    @Column("C_PrePayment_Acct")
    private Integer cPrePaymentAcct;

    @Column("V_Liability_Acct")
    private Integer vLiabilityAcct;

    @Column("V_Liability_Services_Acct")
    private Integer vLiabilityServicesAcct;

    @Column("V_PrePayment_Acct")
    private Integer vPrePaymentAcct;

    @Column("PayDiscount_Exp_Acct")
    private Integer payDiscountExpAcct;

    @Column("PayDiscount_Rev_Acct")
    private Integer payDiscountRevAcct;

    @Column("WriteOff_Acct")
    private Integer writeOffAcct;

    @Column("NotInvoicedReceipts_Acct")
    private Integer notInvoicedReceiptsAcct;

    @Column("UnEarnedRevenue_Acct")
    private Integer unEarnedRevenueAcct;
}
