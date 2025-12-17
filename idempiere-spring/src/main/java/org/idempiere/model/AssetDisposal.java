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
 * Asset Disposal entity.
 * Maps to A_Asset_Disposed table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Disposed")
public class AssetDisposal extends BaseEntity {

    @Id
    @Column("A_Asset_Disposed_ID")
    private Integer aAssetDisposedId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Asset_Trade_ID")
    private Integer aAssetTradeId;

    @Column("A_Disposed_Date")
    private LocalDateTime aDisposedDate;

    @Column("A_Disposed_Method")
    private String aDisposedMethod;

    @Column("A_Disposed_Reason")
    private String aDisposedReason;

    @Column("A_Proceeds")
    private BigDecimal aProceeds;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Disposal_Amt")
    private BigDecimal aDisposalAmt;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("PostingType")
    private String postingType;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
