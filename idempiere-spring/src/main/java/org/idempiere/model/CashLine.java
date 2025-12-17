package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Cash Line entity.
 * Maps to C_CashLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CashLine")
public class CashLine extends BaseEntity {

    @Id
    @Column("C_CashLine_ID")
    private Integer cCashLineId;

    @Column("C_Cash_ID")
    private Integer cCashId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("CashType")
    private String cashType;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("Amount")
    private BigDecimal amount;

    @Column("DiscountAmt")
    private BigDecimal discountAmt;

    @Column("WriteOffAmt")
    private BigDecimal writeOffAmt;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("Processed")
    private String processed;
}
