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
 * Balance Trial Temporary entity - T_BalanceTrial table.
 * Temporary table for trial balance.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_BalanceTrial")
public class TBalanceTrial extends BaseEntity {

    @Id
    @Column("T_BalanceTrial_ID")
    private Integer tBalanceTrialId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("Balance")
    private BigDecimal balance;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Description")
    private String description;

    @Column("Name")
    private String name;

    @Column("OpenBalanceCr")
    private BigDecimal openBalanceCr;

    @Column("OpenBalanceDr")
    private BigDecimal openBalanceDr;
}
