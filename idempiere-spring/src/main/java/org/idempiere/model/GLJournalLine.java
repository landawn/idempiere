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
 * GL Journal Line entity - GL_JournalLine table.
 * General Ledger Journal Line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_JournalLine")
public class GLJournalLine extends BaseEntity {

    @Id
    @Column("GL_JournalLine_ID")
    private Integer glJournalLineId;

    @Column("GL_Journal_ID")
    private Integer glJournalId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("IsGenerated")
    private String isGenerated;

    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("CurrencyRate")
    private BigDecimal currencyRate;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

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

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

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

    @Column("AD_OrgTrx_ID")
    private Integer adOrgTrxId;

    @Column("A_Asset_ID")
    private Integer aAssetId;
}
