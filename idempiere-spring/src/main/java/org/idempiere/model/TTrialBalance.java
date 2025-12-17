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
 * Trial Balance Temporary entity - T_TrialBalance table.
 * Temporary table for trial balance report.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_TrialBalance")
public class TTrialBalance extends BaseEntity {

    @Id
    @Column("T_TrialBalance_ID")
    private Integer tTrialBalanceId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("AmtAcctBalance")
    private BigDecimal amtAcctBalance;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctOpenBalance")
    private BigDecimal amtAcctOpenBalance;

    @Column("AmtAcctOpenCr")
    private BigDecimal amtAcctOpenCr;

    @Column("AmtAcctOpenDr")
    private BigDecimal amtAcctOpenDr;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("Description")
    private String description;

    @Column("Fact_Acct_ID")
    private Integer factAcctId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("Qty")
    private BigDecimal qty;
}
