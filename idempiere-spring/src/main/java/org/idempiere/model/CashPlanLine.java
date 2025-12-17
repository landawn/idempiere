package org.idempiere.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Cash Plan Line entity.
 * Maps to C_CashPlanLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_CashPlanLine")
public class CashPlanLine extends BaseEntity {

    @Id
    @Column("C_CashPlanLine_ID")
    private Integer cCashPlanLineId;

    @Column("C_CashPlan_ID")
    private Integer cCashPlanId;

    @Column("Line")
    private Integer line;

    @Column("Description")
    private String description;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("CashType")
    private String cashType;

    @Column("C_Invoice_ID")
    private Integer cInvoiceId;

    @Column("C_Order_ID")
    private Integer cOrderId;

    @Column("C_Charge_ID")
    private Integer cChargeId;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("Amount")
    private BigDecimal amount;

    @Column("Processed")
    private String processed;
}
