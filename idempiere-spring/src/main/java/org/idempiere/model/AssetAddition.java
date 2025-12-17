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
 * Asset Addition entity.
 * Maps to A_Asset_Addition table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Addition")
public class AssetAddition extends BaseEntity {

    @Id
    @Column("A_Asset_Addition_ID")
    private Integer aAssetAdditionId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("A_CapvsExp")
    private String aCapvsExp;

    @Column("A_SourceType")
    private String aSourceType;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("PostingType")
    private String postingType;

    @Column("A_QTY_Current")
    private BigDecimal aQtyCurrent;

    @Column("AssetValueAmt")
    private BigDecimal assetValueAmt;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("DeltaUseLifeYears")
    private Integer deltaUseLifeYears;

    @Column("DeltaUseLifeMonths")
    private Integer deltaUseLifeMonths;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_MatchInv_ID")
    private Integer mMatchInvId;

    @Column("GL_JournalBatch_ID")
    private Integer glJournalBatchId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;
}
