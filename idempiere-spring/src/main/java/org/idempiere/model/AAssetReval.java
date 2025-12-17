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
 * A Asset Reval entity - A_Asset_Reval table.
 * Asset Revaluation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Reval")
public class AAssetReval extends BaseEntity {

    @Id
    @Column("A_Asset_Reval_ID")
    private Integer aAssetRevalId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("Description")
    private String description;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

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

    @Column("A_Change_Acct")
    private Integer aChangeAcct;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("PostingType")
    private String postingType;

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
