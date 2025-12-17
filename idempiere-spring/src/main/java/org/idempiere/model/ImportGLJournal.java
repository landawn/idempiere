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
 * Import GL Journal entity.
 * Maps to I_GLJournal table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_GLJournal")
public class ImportGLJournal extends BaseEntity {

    @Id
    @Column("I_GLJournal_ID")
    private Integer iGlJournalId;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("GL_JournalBatch_ID")
    private Integer glJournalBatchId;

    @Column("GL_Journal_ID")
    private Integer glJournalId;

    @Column("GL_JournalLine_ID")
    private Integer glJournalLineId;

    @Column("BatchDocumentNo")
    private String batchDocumentNo;

    @Column("BatchDescription")
    private String batchDescription;

    @Column("JournalDocumentNo")
    private String journalDocumentNo;

    @Column("Description")
    private String description;

    @Column("PostingType")
    private String postingType;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("AcctSchemaName")
    private String acctSchemaName;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DocTypeName")
    private String docTypeName;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("CategoryName")
    private String categoryName;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("ClientValue")
    private String clientValue;

    @Column("OrgValue")
    private String orgValue;

    @Column("ISO_Code")
    private String isoCode;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("CurrencyRate")
    private BigDecimal currencyRate;

    @Column("ConversionTypeValue")
    private String conversionTypeValue;

    @Column("C_ConversionType_ID")
    private Integer cConversionTypeId;

    @Column("Line")
    private Integer line;

    @Column("AccountValue")
    private String accountValue;

    @Column("Account_ID")
    private Integer accountId;

    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;

    @Column("IsSourceBalanced")
    private String isSourceBalanced;

    @Column("AmtSourceDr")
    private BigDecimal amtSourceDr;

    @Column("AmtSourceCr")
    private BigDecimal amtSourceCr;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("Qty")
    private BigDecimal qty;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("OrgTrxValue")
    private String orgTrxValue;

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("BPartnerValue")
    private String bPartnerValue;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("ProductValue")
    private String productValue;

    @Column("ProjectValue")
    private String projectValue;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_SalesRegion_ID")
    private Integer cSalesRegionId;

    @Column("C_LocFrom_ID")
    private Integer cLocFromId;

    @Column("C_LocTo_ID")
    private Integer cLocToId;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;
}
