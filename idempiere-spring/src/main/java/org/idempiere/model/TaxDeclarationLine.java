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
 * Tax Declaration Line entity - C_TaxDeclarationLine table.
 * Tax declaration line detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxDeclarationLine")
public class TaxDeclarationLine extends BaseEntity {

    @Id
    @Column("C_TaxDeclarationLine_ID")
    private Integer cTaxDeclarationLineId;

    @Column("C_TaxDeclaration_ID")
    private Integer cTaxDeclarationId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Tax_ID")
    private Integer cTaxId;

    @Column("Line")
    private Integer line;

    @Column("TaxBaseAmt")
    private BigDecimal taxBaseAmt;

    @Column("TaxAmt")
    private BigDecimal taxAmt;

    @Column("Description")
    private String description;
}
