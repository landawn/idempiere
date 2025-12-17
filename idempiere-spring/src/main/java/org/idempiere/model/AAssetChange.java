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
 * A Asset Change entity - A_Asset_Change table.
 * Asset Change.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Change")
public class AAssetChange extends BaseEntity {

    @Id
    @Column("A_Asset_Change_ID")
    private Integer aAssetChangeId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("ChangeType")
    private String changeType;

    @Column("Description")
    private String description;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("TextMsg")
    private String textMsg;

    @Column("ChangeAmt")
    private BigDecimal changeAmt;

    @Column("AssetValueAmt")
    private BigDecimal assetValueAmt;

    @Column("A_QTY_Current")
    private BigDecimal aQtyCurrent;

    @Column("A_QTY_Original")
    private BigDecimal aQtyOriginal;

    @Column("AssetAccumDepreciationAmt")
    private BigDecimal assetAccumDepreciationAmt;

    @Column("AssetBookValueAmt")
    private BigDecimal assetBookValueAmt;

    @Column("AssetMarketValueAmt")
    private BigDecimal assetMarketValueAmt;

    @Column("PostingType")
    private String postingType;

    @Column("A_Asset_Acct_ID")
    private Integer aAssetAcctId;

    @Column("A_Depreciation_Workfile_ID")
    private Integer aDepreciationWorkfileId;
}
