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
 * Asset Revaluation entity - A_Asset_Reval table.
 * Asset revaluation record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Reval")
public class AssetRevaluation extends BaseEntity {

    @Id
    @Column("A_Asset_Reval_ID")
    private Integer aAssetRevalId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("PostingType")
    private String postingType;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("A_Depreciation_Entry_ID")
    private Integer aDepreciationEntryId;

    @Column("A_Reval_Cal_Method")
    private String aRevalCalMethod;

    @Column("A_Reval_Multiplier")
    private String aRevalMultiplier;

    @Column("A_Reval_Cost_Offset")
    private BigDecimal aRevalCostOffset;

    @Column("A_Reval_Accumdep_Offset")
    private BigDecimal aRevalAccumdepOffset;

    @Column("A_Reval_Depexp_Offset")
    private BigDecimal aRevalDepexpOffset;

    @Column("A_Asset_Cost_Change")
    private BigDecimal aAssetCostChange;

    @Column("Processed")
    private String processed;
}
