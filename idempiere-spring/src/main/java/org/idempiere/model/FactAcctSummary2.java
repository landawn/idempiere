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
 * Fact Acct Summary 2 entity - Fact_Acct_Summary2 table.
 * Fact account summary extended.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("Fact_Acct_Summary2")
public class FactAcctSummary2 extends BaseEntity {

    @Id
    @Column("Fact_Acct_Summary_ID")
    private Integer factAcctSummaryId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("Account_ID")
    private Integer accountId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("PA_ReportCube_ID")
    private Integer paReportCubeId;

    @Column("DateAcct")
    private LocalDateTime dateAcct;

    @Column("PostingType")
    private String postingType;

    @Column("GL_Budget_ID")
    private Integer glBudgetId;

    @Column("AmtAcctDr")
    private BigDecimal amtAcctDr;

    @Column("AmtAcctCr")
    private BigDecimal amtAcctCr;

    @Column("Qty")
    private BigDecimal qty;
}
