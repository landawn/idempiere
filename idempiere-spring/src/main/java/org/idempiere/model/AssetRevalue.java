package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Asset Revalue entity - A_Asset_Reval table.
 * Fixed asset revaluation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Reval")
public class AssetRevalue extends BaseEntity {

    @Id
    @Column("A_Asset_Reval_ID")
    private Integer aAssetRevalId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Depreciation_Workfile_ID")
    private Integer aDepreciationWorkfileId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("RevalDate")
    private LocalDate revalDate;

    @Column("RevalType")
    private String revalType;

    @Column("A_Asset_Cost_Old")
    private BigDecimal aAssetCostOld;

    @Column("A_Asset_Cost_New")
    private BigDecimal aAssetCostNew;

    @Column("A_Asset_Cost_Change")
    private BigDecimal aAssetCostChange;

    @Column("A_Accumulated_Depr_Old")
    private BigDecimal aAccumulatedDeprOld;

    @Column("A_Accumulated_Depr_New")
    private BigDecimal aAccumulatedDeprNew;

    @Column("A_Accumulated_Depr_Change")
    private BigDecimal aAccumulatedDeprChange;

    @Column("A_Asset_Remaining_Old")
    private BigDecimal aAssetRemainingOld;

    @Column("A_Asset_Remaining_New")
    private BigDecimal aAssetRemainingNew;

    @Column("A_Asset_Remaining_Change")
    private BigDecimal aAssetRemainingChange;

    @Column("Description")
    private String description;

    @Column("Posted")
    private String posted;

    @Column("Processed")
    private String processed;
}
