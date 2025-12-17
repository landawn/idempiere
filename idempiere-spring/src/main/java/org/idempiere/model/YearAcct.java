package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Year Accounting entity - C_Year table.
 * Fiscal year definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_Year")
public class YearAcct extends BaseEntity {

    @Id
    @Column("C_Year_ID")
    private Integer cYearId;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("FiscalYear")
    private String fiscalYear;

    @Column("Description")
    private String description;

    @Column("Processing")
    private String processing;
}
