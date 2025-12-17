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
 * A Asset Addition entity - A_Asset_Addition table.
 * Asset Addition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Asset_Addition")
public class AAssetAddition extends BaseEntity {

    @Id
    @Column("A_Asset_Addition_ID")
    private Integer aAssetAdditionId;

    @Column("A_Asset_ID")
    private Integer aAssetId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("A_SourceType")
    private String aSourceType;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("M_InOutLine_ID")
    private Integer mInOutLineId;

    @Column("M_Product_ID")
    private Integer mProductId;

    @Column("M_AttributeSetInstance_ID")
    private Integer mAttributeSetInstanceId;

    @Column("M_Locator_ID")
    private Integer mLocatorId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("GL_Journal_ID")
    private Integer glJournalId;

    @Column("GL_JournalBatch_ID")
    private Integer glJournalBatchId;

    @Column("A_QTY_Current")
    private BigDecimal aQtyCurrent;

    @Column("A_Asset_Cost")
    private BigDecimal aAssetCost;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("PostingType")
    private String postingType;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

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
