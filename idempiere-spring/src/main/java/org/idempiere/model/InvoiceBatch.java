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
 * Invoice Batch entity - C_InvoiceBatch table.
 * Invoice batch header.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_InvoiceBatch")
public class InvoiceBatch extends BaseEntity {

    @Id
    @Column("C_InvoiceBatch_ID")
    private Integer cInvoiceBatchId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("ControlAmt")
    private BigDecimal controlAmt;

    @Column("DocumentAmt")
    private BigDecimal documentAmt;

    @Column("SalesRep_ID")
    private Integer salesRepId;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("IsSOTrx")
    private String isSOTrx;
}
