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
 * Invoice Batch Line entity - C_InvoiceBatchLine table.
 * Line item in invoice batch.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InvoiceBatchLine")
public class CInvoiceBatchLine extends BaseEntity {

    @Id
    @Column("C_InvoiceBatchLine_ID")
    private Integer cInvoiceBatchLineId;

    @Column("C_InvoiceBatch_ID")
    private Integer cInvoiceBatchId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_BPartner_Location_ID")
    private Integer cBPartnerLocationId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("DateInvoiced")
    private LocalDateTime dateInvoiced;

    @Column("Description")
    private String description;

    @Column("DocumentNo")
    private String documentNo;

    @Column("IsTaxIncluded")
    private String isTaxIncluded;

    @Column("Line")
    private Integer line;

    @Column("LineNetAmt")
    private BigDecimal lineNetAmt;

    @Column("LineTotalAmt")
    private BigDecimal lineTotalAmt;

    @Column("PriceEntered")
    private BigDecimal priceEntered;

    @Column("QtyEntered")
    private BigDecimal qtyEntered;

    @Column("TaxAmt")
    private BigDecimal taxAmt;

    @Column("User1_ID")
    private Integer user1Id;

    @Column("User2_ID")
    private Integer user2Id;
}
