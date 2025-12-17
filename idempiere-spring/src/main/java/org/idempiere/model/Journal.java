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
 * GL Journal entity - general ledger journal entries.
 * Maps to GL_Journal table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_Journal")
public class Journal extends BaseEntity {

    @Id
    @Column("GL_Journal_ID")
    private Integer glJournalId;

    @Column("GL_JournalBatch_ID")
    private Integer glJournalBatchId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("PostingType")
    private String postingType;

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("CurrencyRate")
    private BigDecimal currencyRate;

    @Column("C_ConversionType_ID")
    private Integer cConversionTypeId;

    @Column("TotalDr")
    private BigDecimal totalDr;

    @Column("TotalCr")
    private BigDecimal totalCr;

    @Column("ControlAmt")
    private BigDecimal controlAmt;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;

    @Column("Posted")
    private String posted;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsPrinted")
    private String isPrinted;
}
