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
 * Cash Flow Temporary entity - T_CashFlow table.
 * Temporary table for cash flow report.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_CashFlow")
public class TCashFlow extends BaseEntity {

    @Id
    @Column("T_CashFlow_ID")
    private Integer tCashFlowId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("C_BPartner_ID")
    private Integer cBPartnerId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("CashFlowType")
    private String cashFlowType;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("Description")
    private String description;

    @Column("DocumentNo")
    private String documentNo;

    @Column("DueAmt")
    private BigDecimal dueAmt;

    @Column("DueDate")
    private LocalDateTime dueDate;

    @Column("IsSOTrx")
    private String isSOTrx;
}
