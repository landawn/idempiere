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
 * Revenue Recognition Plan entity - C_RevenueRecognition_Plan table.
 * Revenue recognition plan for invoice line.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_RevenueRecognition_Plan")
public class RevenueRecognitionPlan extends BaseEntity {

    @Id
    @Column("C_RevenueRecognition_Plan_ID")
    private Integer cRevenueRecognitionPlanId;

    @Column("C_RevenueRecognition_ID")
    private Integer cRevenueRecognitionId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("C_InvoiceLine_ID")
    private Integer cInvoiceLineId;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("TotalAmt")
    private BigDecimal totalAmt;

    @Column("RecognizedAmt")
    private BigDecimal recognizedAmt;

    @Column("P_Revenue_Acct")
    private Integer pRevenueAcct;

    @Column("UnEarnedRevenue_Acct")
    private Integer unEarnedRevenueAcct;
}
