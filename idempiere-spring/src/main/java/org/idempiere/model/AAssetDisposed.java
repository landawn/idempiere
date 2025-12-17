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
 * Asset Disposed entity - A_Asset_Disposed table.
 * Disposed/retired asset record.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Disposed")
public class AAssetDisposed extends BaseEntity {

    @Id
    @Column("A_Asset_Disposed_ID")
    private Integer aAssetDisposedId;

    @Column("A_Asset_Trade_ID")
    private Integer aAssetTradeId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("A_Disposed_Date")
    private LocalDateTime aDisposedDate;

    @Column("A_Disposed_Method")
    private String aDisposedMethod;

    @Column("A_Proceeds")
    private BigDecimal aProceeds;

    @Column("A_Disposed_Reason")
    private String aDisposedReason;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("Description")
    private String description;

    @Column("Expense")
    private BigDecimal expense;

    @Column("PostingType")
    private String postingType;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
