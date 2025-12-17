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
 * Depreciation Entry entity.
 * Maps to A_Depreciation_Entry table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Depreciation_Entry")
public class DepreciationEntry extends BaseEntity {

    @Id
    @Column("A_Depreciation_Entry_ID")
    private Integer aDepreciationEntryId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("A_Entry_Type")
    private String aEntryType;

    @Column("PostingType")
    private String postingType;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Posted")
    private String posted;

    @Column("A_Depreciation_Exp")
    private BigDecimal aDepreciationExp;
}
