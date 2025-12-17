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
 * Dunning Temporary entity - T_Dunning table.
 * Temporary table for dunning process.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_Dunning")
public class TDunning extends BaseEntity {

    @Id
    @Column("T_Dunning_ID")
    private Integer tDunningId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Dunning_ID")
    private Integer cDunningId;

    @Column("C_DunningLevel_ID")
    private Integer cDunningLevelId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_InvoicePaySchedule_ID")
    private Integer cInvoicePayScheduleId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("DaysDue")
    private Integer daysDue;

    @Column("DueDate")
    private LocalDateTime dueDate;

    @Column("GrandTotal")
    private BigDecimal grandTotal;

    @Column("IsInDispute")
    private String isInDispute;

    @Column("OpenAmt")
    private BigDecimal openAmt;

    @Column("TimesDunned")
    private Integer timesDunned;
}
