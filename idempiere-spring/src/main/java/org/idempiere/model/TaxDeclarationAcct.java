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
 * Tax Declaration Acct entity - C_TaxDeclarationAcct table.
 * Tax declaration accounting detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_TaxDeclarationAcct")
public class TaxDeclarationAcct extends BaseEntity {

    @Id
    @Column("C_TaxDeclarationAcct_ID")
    private Integer cTaxDeclarationAcctId;

    @Column("C_TaxDeclaration_ID")
    private Integer cTaxDeclarationId;

    @Column("Fact_Acct_ID")
    private Integer factAcctId;

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
