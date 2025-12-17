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
 * Report Statement entity - T_ReportStatement table.
 * Report statement temporary table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_ReportStatement")
public class ReportStatement extends BaseEntity {

    @Id
    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Id
    @Column("Fact_Acct_ID")
    private Integer factAcctId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("AccountValue")
    private String accountValue;

    @Column("DateTrx")
    private LocalDateTime dateTrx;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("AmtAcctBalance")
    private BigDecimal amtAcctBalance;

    @Column("Description")
    private String description;
}
