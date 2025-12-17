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
 * Aging entity - T_Aging table.
 * Aging temporary table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Aging")
public class Aging extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoicePaySchedule_ID")
    private Integer cInvoicePayScheduleId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("IsListInvoices")
    private String isListInvoices;

    @Column("DueDate")
    private LocalDateTime dueDate;

    @Column("StatementDate")
    private LocalDateTime statementDate;

    @Column("DaysDue")
    private Integer daysDue;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("OpenAmt")
    private BigDecimal openAmt;

    @Column("InvoicedAmt")
    private BigDecimal invoicedAmt;

    @Column("PastDue1")
    private BigDecimal pastDue1;

    @Column("PastDue1_30")
    private BigDecimal pastDue130;

    @Column("PastDue31_60")
    private BigDecimal pastDue3160;

    @Column("PastDue61_90")
    private BigDecimal pastDue6190;

    @Column("PastDueOver91")
    private BigDecimal pastDueOver91;
}
