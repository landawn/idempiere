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
 * GL Journal Line entity - individual lines in a journal entry.
 * Maps to GL_JournalLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_JournalLine")
public class JournalLine extends BaseEntity {

    @Id
    @Column("GL_JournalLine_ID")
    private Integer glJournalLineId;

    @Column("GL_Journal_ID")
    private Integer glJournalId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;

    @Column("AmtSourceDr")
    private BigDecimal amtSourceDr;

    @Column("AmtSourceCr")
    private BigDecimal amtSourceCr;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("CurrencyRate")
    private BigDecimal currencyRate;

    @Column("C_ConversionType_ID")
    private Integer cConversionTypeId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("C_UOM_ID")
    private Integer cUomId;

    @Column("Qty")
    private BigDecimal qty;

    @Column("IsGenerated")
    private String isGenerated;

    @Column("A_Asset_ID")
    private Integer aAssetId;

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

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;
}
