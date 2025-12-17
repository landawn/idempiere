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
 * Asset Split entity - A_Asset_Split table.
 * Fixed asset split.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Split")
public class AssetSplit extends BaseEntity {

    @Id
    @Column("A_Asset_Split_ID")
    private Integer aAssetSplitId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Asset_ID_To")
    private Integer aAssetIdTo;

    @Column("SplitDate")
    private LocalDate splitDate;

    @Column("SplitPercent")
    private BigDecimal splitPercent;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Qty_Current")
    private BigDecimal aQtyCurrent;

    @Column("Description")
    private String description;

    @Column("Posted")
    private String posted;

    @Column("Processed")
    private String processed;
}
