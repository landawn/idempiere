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
 * A Asset Disposal entity - A_Asset_Disposed table.
 * Asset Disposal.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Disposed")
public class AAssetDisposal extends BaseEntity {

    @Id
    @Column("A_Asset_Disposed_ID")
    private Integer aAssetDisposedId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("Description")
    private String description;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("A_Disposal_Amt")
    private BigDecimal aDisposalAmt;

    @Column("A_Disposed_Reason")
    private String aDisposedReason;

    @Column("A_Disposed_Method")
    private String aDisposedMethod;

    @Column("A_Disposed_Date")
    private LocalDateTime aDisposedDate;

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
