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
 * Fact Acct Balance entity - Fact_Acct_Balance table.
 * Fact account balance.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("Fact_Acct_Balance")
public class FactAcctBalance extends BaseEntity {

    @Id
    @Column("Fact_Acct_Balance_ID")
    private Integer factAcctBalanceId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("PostingType")
    private String postingType;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("AmtAcctBalance")
    private BigDecimal amtAcctBalance;

    @Column("Qty")
    private BigDecimal qty;
}
