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
 * Invoice GL Temporary entity - T_InvoiceGL table.
 * Temporary table for invoice gain/loss.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_InvoiceGL")
public class TInvoiceGL extends BaseEntity {

    @Id
    @Column("T_InvoiceGL_ID")
    private Integer tInvoiceGlId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("AmtAcctBalance")
    private BigDecimal amtAcctBalance;

    @Column("AmtRevalCr")
    private BigDecimal amtRevalCr;

    @Column("AmtRevalCrDiff")
    private BigDecimal amtRevalCrDiff;

    @Column("AmtRevalDr")
    private BigDecimal amtRevalDr;

    @Column("AmtRevalDrDiff")
    private BigDecimal amtRevalDrDiff;

    @Column("AmtSourceBalance")
    private BigDecimal amtSourceBalance;

    @Column("APTS")
    private String apts;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_ConversionTypeReval_ID")
    private Integer cConversionTypeRevalId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_DocTypeReval_ID")
    private Integer cDocTypeRevalId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("DateReval")
    private LocalDateTime dateReval;

    @Column("Fact_Acct_ID")
    private Integer factAcctId;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("IsAllCurrencies")
    private String isAllCurrencies;

    @Column("OpenAmt")
    private BigDecimal openAmt;

    @Column("Percent")
    private BigDecimal percent;
}
