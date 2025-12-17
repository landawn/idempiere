package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * Invoice Tax Detail entity - C_InvoiceTaxDetail table.
 * Invoice tax calculation detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InvoiceTaxDetail")
public class InvoiceTaxDetail extends BaseEntity {

    @Id
    @Column("C_InvoiceTaxDetail_ID")
    private Integer cInvoiceTaxDetailId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("TaxBaseAmt")
    private BigDecimal taxBaseAmt;

    @Column("TaxAmt")
    private BigDecimal taxAmt;

    @Column("TaxRate")
    private BigDecimal taxRate;

    @Column("IsTaxIncluded")
    private String isTaxIncluded;
}
