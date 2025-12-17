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
 * A Asset Split entity - A_Asset_Split table.
 * Asset Split.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Split")
public class AAssetSplit extends BaseEntity {

    @Id
    @Column("A_Asset_Split_ID")
    private Integer aAssetSplitId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Asset_ID_To")
    private Integer aAssetIdTo;

    @Column("Description")
    private String description;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("PostingType")
    private String postingType;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Asset_Cost_Delta")
    private BigDecimal aAssetCostDelta;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Accumulated_Depr_Delta")
    private BigDecimal aAccumulatedDeprDelta;

    @Column("A_Split_Type")
    private String aSplitType;

    @Column("A_Split_Percent")
    private BigDecimal aSplitPercent;

    @Column("A_QTY_Split")
    private BigDecimal aQtySplit;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("Posted")
    private String posted;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;
}
