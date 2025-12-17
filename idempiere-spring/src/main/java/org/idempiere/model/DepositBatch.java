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
 * Deposit Batch entity - C_DepositBatch table.
 * Deposit batch for grouping payments.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_DepositBatch")
public class DepositBatch extends BaseEntity {

    @Id
    @Column("C_DepositBatch_ID")
    private Integer cDepositBatchId;

    @Column("DocumentNo")
    private String documentNo;

    @Column("Description")
    private String description;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("DateDeposit")
    private LocalDateTime dateDeposit;

    @Column("DateDoc")
    private LocalDateTime dateDoc;

    @Column("C_DocType_ID")
    private Integer cDocTypeId;

    @Column("DepositAmt")
    private BigDecimal depositAmt;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
