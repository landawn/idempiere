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
 * Dunning Run Line entity.
 * Maps to C_DunningRunLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DunningRunLine")
public class DunningRunLine extends BaseEntity {

    @Id
    @Column("C_DunningRunLine_ID")
    private Integer cDunningRunLineId;

    @Column("Amt")
    private BigDecimal amt;

    @Column("C_DunningRunEntry_ID")
    private Integer cDunningRunEntryId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoicePaySchedule_ID")
    private Integer cInvoicePayScheduleId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("ConvertedAmt")
    private BigDecimal convertedAmt;

    @Column("DaysDue")
    private Integer daysDue;

    @Column("FeeAmt")
    private BigDecimal feeAmt;

    @Column("InterestAmt")
    private BigDecimal interestAmt;

    @Column("InvoiceRelated_ID")
    private Integer invoiceRelatedId;

    @Column("IsInDispute")
    private String isInDispute;

    @Column("OpenAmt")
    private BigDecimal openAmt;

    @Column("Processed")
    private String processed;

    @Column("TimesDunned")
    private Integer timesDunned;

    @Column("TotalAmt")
    private BigDecimal totalAmt;
}
