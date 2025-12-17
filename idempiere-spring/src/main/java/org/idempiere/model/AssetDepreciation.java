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
 * Asset Depreciation entity - A_Depreciation_Entry table.
 * Asset depreciation entry.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Entry")
public class AssetDepreciation extends BaseEntity {

    @Id
    @Column("A_Depreciation_Entry_ID")
    private Integer aDepreciationEntryId;

    @Column("A_Entry_Type")
    private String aEntryType;

    @Column("PostingType")
    private String postingType;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("A_Accumulated_Depr")
    private BigDecimal aAccumulatedDepr;

    @Column("A_Accumulated_Depr_F")
    private BigDecimal aAccumulatedDeprF;

    @Column("A_Period_Forecast")
    private BigDecimal aPeriodForecast;

    @Column("A_Period_Posted")
    private BigDecimal aPeriodPosted;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("Posted")
    private String posted;

    @Column("DocAction")
    private String docAction;

    @Column("DocStatus")
    private String docStatus;
}
