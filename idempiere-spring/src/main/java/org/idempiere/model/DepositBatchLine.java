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
 * Deposit Batch Line entity - individual deposit batch transactions.
 * Maps to C_DepositBatchLine table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DepositBatchLine")
public class DepositBatchLine extends BaseEntity {

    @Id
    @Column("C_DepositBatchLine_ID")
    private Integer cDepositBatchLineId;

    @Column("C_DepositBatchLine_UU")
    private String cDepositBatchLineUu;

    @Column("C_DepositBatch_ID")
    private Integer cDepositBatchId;

    @Column("Line")
    private Integer line;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("C_BankStatementLine_ID")
    private Integer cBankStatementLineId;

    @Column("C_BPartner_ID")
    private Integer cBpartnerId;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("Description")
    private String description;

    @Column("Processed")
    private String processed;
}
