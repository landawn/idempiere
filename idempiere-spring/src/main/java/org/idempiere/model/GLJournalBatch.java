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
 * GL Journal Batch entity - GL_JournalBatch table.
 * General Ledger Journal Batch.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_JournalBatch")
public class GLJournalBatch extends BaseEntity {

    @Id
    @Column("GL_JournalBatch_ID")
    private Integer glJournalBatchId;

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

    @Column("GL_Category_ID")
    private Integer glCategoryId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("TotalDr")
    private BigDecimal totalDr;

    @Column("TotalCr")
    private BigDecimal totalCr;

    @Column("ControlAmt")
    private BigDecimal controlAmt;

    @Column("IsApproved")
    private String isApproved;

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
