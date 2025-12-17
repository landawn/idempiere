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
 * Budget Report Line entity - GL_BudgetReportLine table.
 * Budget report line detail.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("GL_BudgetReportLine")
public class BudgetReportLine extends BaseEntity {

    @Id
    @Column("GL_BudgetReportLine_ID")
    private Integer glBudgetReportLineId;

    @Column("GL_Budget_ID")
    private Integer glBudgetId;

    @Column("C_ValidCombination_ID")
    private Integer cValidCombinationId;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("BudgetAmt")
    private BigDecimal budgetAmt;

    @Column("ActualAmt")
    private BigDecimal actualAmt;

    @Column("CommittedAmt")
    private BigDecimal committedAmt;

    @Column("Variance")
    private BigDecimal variance;
}
