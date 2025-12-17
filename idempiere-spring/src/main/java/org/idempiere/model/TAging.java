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
 * Aging Temporary entity - T_Aging table.
 * Temporary table for aging report.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Aging")
public class TAging extends BaseEntity {

    @Id
    @Column("T_Aging_ID")
    private Integer tAgingId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("C_Activity_ID")
    private Integer cActivityId;

    @Column("C_BP_Group_ID")
    private Integer cBpGroupId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Campaign_ID")
    private Integer cCampaignId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoicePaySchedule_ID")
    private Integer cInvoicePayScheduleId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_Project_ID")
    private Integer cProjectId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("DaysDue")
    private Integer daysDue;

    @Column("Due0")
    private BigDecimal due0;

    @Column("Due0_30")
    private BigDecimal due0_30;

    @Column("Due0_7")
    private BigDecimal due0_7;

    @Column("Due1_7")
    private BigDecimal due1_7;

    @Column("Due31_60")
    private BigDecimal due31_60;

    @Column("Due31_Plus")
    private BigDecimal due31Plus;

    @Column("Due61_90")
    private BigDecimal due61_90;

    @Column("Due61_Plus")
    private BigDecimal due61Plus;

    @Column("Due8_30")
    private BigDecimal due8_30;

    @Column("Due91_Plus")
    private BigDecimal due91Plus;

    @Column("DueAmt")
    private BigDecimal dueAmt;

    @Column("DueDate")
    private LocalDateTime dueDate;

    @Column("InvoicedAmt")
    private BigDecimal invoicedAmt;

    @Column("IsListInvoices")
    private String isListInvoices;

    @Column("IsSOTrx")
    private String isSOTrx;

    @Column("OpenAmt")
    private BigDecimal openAmt;

    @Column("PastDue1_30")
    private BigDecimal pastDue1_30;

    @Column("PastDue1_7")
    private BigDecimal pastDue1_7;

    @Column("PastDue31_60")
    private BigDecimal pastDue31_60;

    @Column("PastDue31_Plus")
    private BigDecimal pastDue31Plus;

    @Column("PastDue61_90")
    private BigDecimal pastDue61_90;

    @Column("PastDue61_Plus")
    private BigDecimal pastDue61Plus;

    @Column("PastDue8_30")
    private BigDecimal pastDue8_30;

    @Column("PastDue91_Plus")
    private BigDecimal pastDue91Plus;

    @Column("PastDueAmt")
    private BigDecimal pastDueAmt;

    @Column("StatementDate")
    private LocalDateTime statementDate;
}
