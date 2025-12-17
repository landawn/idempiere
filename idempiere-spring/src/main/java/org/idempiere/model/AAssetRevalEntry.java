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
 * A Asset Reval Entry entity - A_Asset_Reval_Entry table.
 * Asset Revaluation Entry.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Reval_Entry")
public class AAssetRevalEntry extends BaseEntity {

    @Id
    @Column("A_Asset_Reval_Entry_ID")
    private Integer aAssetRevalEntryId;

    @Column("A_Asset_Reval_ID")
    private Integer aAssetRevalId;

    @Column("A_Depreciation_Workfile_ID")
    private Integer aDepreciationWorkfileId;

    @Column("A_Rev_Code")
    private String aRevCode;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Asset_Cost_Change")
    private BigDecimal aAssetCostChange;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Accumulated_Depr_Delta")
    private BigDecimal aAccumulatedDeprDelta;

    @Column("A_Reval_Cost_Offset")
    private BigDecimal aRevalCostOffset;

    @Column("A_Reval_Cost_Offset_Prev")
    private BigDecimal aRevalCostOffsetPrev;

    @Column("A_Reval_Accumdep_Offset_Cur")
    private BigDecimal aRevalAccumdepOffsetCur;

    @Column("A_Reval_Accumdep_Offset_Prev")
    private BigDecimal aRevalAccumdepOffsetPrev;

    @Column("A_Reval_Depexp_Offset")
    private BigDecimal aRevalDepexpOffset;
}
