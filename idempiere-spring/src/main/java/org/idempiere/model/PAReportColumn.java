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
 * PA Report Column entity - PA_ReportColumn table.
 * Performance Analysis Report Column.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_ReportColumn")
public class PAReportColumn extends BaseEntity {

    @Id
    @Column("PA_ReportColumn_ID")
    private Integer paReportColumnId;

    @Column("PA_ReportColumnSet_ID")
    private Integer paReportColumnSetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("ColumnType")
    private String columnType;

    @Column("AmountType")
    private String amountType;

    @Column("CurrencyType")
    private String currencyType;

    @Column("C_Currency_ID")
    private Integer cCurrencyId;

    @Column("RelativePeriod")
    private BigDecimal relativePeriod;

    @Column("RelativePeriodTo")
    private BigDecimal relativePeriodTo;

    @Column("C_Period_ID")
    private Integer cPeriodId;

    @Column("C_ElementValue_ID")
    private Integer cElementValueId;

    @Column("PostingType")
    private String postingType;

    @Column("GL_Budget_ID")
    private Integer glBudgetId;

    @Column("PA_ReportColumn_ID_Oper_1")
    private Integer paReportColumnIdOper1;

    @Column("PA_ReportColumn_ID_Oper_2")
    private Integer paReportColumnIdOper2;

    @Column("CalculationType")
    private String calculationType;

    @Column("ElementType")
    private String elementType;
}
