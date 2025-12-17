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
 * Report Statement Temporary entity - T_ReportStatement table.
 * Temporary table for financial statements.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("T_ReportStatement")
public class TReportStatement extends BaseEntity {

    @Id
    @Column("T_ReportStatement_ID")
    private Integer tReportStatementId;

    @Column("AD_PInstance_ID")
    private Integer adPInstanceId;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("Balance")
    private BigDecimal balance;

    @Column("DateAcct")
    private java.time.LocalDateTime dateAcct;

    @Column("Description")
    private String description;

    @Column("Fact_Acct_ID")
    private Integer factAcctId;

    @Column("IdCounter")
    private Integer idCounter;

    @Column("LevelNo")
    private Integer levelNo;

    @Column("Name")
    private String name;

    @Column("Qty")
    private BigDecimal qty;
}
