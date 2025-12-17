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
 * Deposit Batch Line entity - C_DepositBatchLine table.
 * Deposit batch line item.
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

    @Column("C_DepositBatch_ID")
    private Integer cDepositBatchId;

    @Column("C_Payment_ID")
    private Integer cPaymentId;

    @Column("Line")
    private Integer line;

    @Column("PayAmt")
    private BigDecimal payAmt;

    @Column("Processed")
    private String processed;
}
