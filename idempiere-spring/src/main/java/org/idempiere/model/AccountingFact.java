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
 * Accounting Fact entity - posted journal entries.
 * Maps to Fact_Acct table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("Fact_Acct")
public class AccountingFact extends BaseEntity {

    @Id
    @Column("Fact_Acct_ID")
    private Integer factAcctId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("Record_ID")
    private Integer recordId;

    @Column("Line_ID")
    private Integer lineId;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("GL_Budget_ID")
    private Integer glBudgetId;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("PostingType")
    private String postingType;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("AmtSourceDr")
    private BigDecimal amtSourceDr;

    @Column("AmtSourceCr")
    private BigDecimal amtSourceCr;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("C_UOM_ID")
    private Integer cUomId;

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

    @Column("Description")
    private String description;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("C_SubAcct_ID")
    private Integer cSubAcctId;

    @Column("UserElement1_ID")
    private Integer userElement1Id;

    @Column("UserElement2_ID")
    private Integer userElement2Id;

    @Column("GL_JournalLine_ID")
    private Integer glJournalLineId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DocumentNo")
    private String documentNo;
}
