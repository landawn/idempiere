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
 * Asset Revaluation Entry entity.
 * Maps to A_Asset_Reval_Entry table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Reval_Entry")
public class AssetReval extends BaseEntity {

    @Id
    @Column("A_Asset_Reval_Entry_ID")
    private Integer aAssetRevalEntryId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("PostingType")
    private String postingType;

    @Column("A_Rev_Code")
    private String aRevCode;

    @Column("A_Asset_Cost_Change")
    private BigDecimal aAssetCostChange;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("A_Accumulated_Depr_Delta")
    private BigDecimal aAccumulatedDeprDelta;

    @Column("A_Change_Acct_ID")
    private Integer aChangeAcctId;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processing")
    private String processing;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;
}
