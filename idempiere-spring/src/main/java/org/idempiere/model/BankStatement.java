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
 * Bank Statement entity - bank statement header.
 * Maps to C_BankStatement table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_BankStatement")
public class BankStatement extends BaseEntity {

    @Id
    @Column("C_BankStatement_ID")
    private Integer cBankStatementId;

    @Column("C_BankStatement_UU")
    private String cBankStatementUu;

    @Column("C_BankAccount_ID")
    private Integer cBankAccountId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("StatementDate")
    private LocalDateTime statementDate;

    @Column("BeginningBalance")
    private BigDecimal beginningBalance;

    @Column("EndingBalance")
    private BigDecimal endingBalance;

    @Column("StatementDifference")
    private BigDecimal statementDifference;

    @Column("DocStatus")
    private String docStatus;

    @Column("DocAction")
    private String docAction;

    @Column("Processed")
    private Boolean processed;

    @Column("Processing")
    private Boolean processing;

    @Column("Posted")
    private Boolean posted;

    @Column("IsApproved")
    private String isApproved;

    @Column("IsManual")
    private String isManual;

    @Column("EftStatementDate")
    private LocalDateTime eftStatementDate;

    @Column("EftStatementReference")
    private String eftStatementReference;
}
