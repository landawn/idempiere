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
 * Accounting Fact Summary entity - Fact_Acct_Summary table.
 * Summarized accounting postings.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("Fact_Acct_Summary")
public class AcctFactSummary extends BaseEntity {

    @Id
    @Column("Fact_Acct_Summary_ID")
    private Integer factAcctSummaryId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("GL_Budget_ID")
    private Integer glBudgetId;

    @Column("PA_ReportCube_ID")
    private Integer paReportCubeId;

    @Column("PostingType")
    private String postingType;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("Qty")
    private BigDecimal qty;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("C_LocFrom_ID")
    private Integer cLocFromId;

    @Column("C_LocTo_ID")
    private Integer cLocToId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

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

    @Column("UserElement1_ID")
    private Integer userElement1Id;

    @Column("UserElement2_ID")
    private Integer userElement2Id;
}
