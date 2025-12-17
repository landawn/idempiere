package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

/**
 * Asset Period entity - A_Period table.
 * Period for asset depreciation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Period")
public class APeriod extends BaseEntity {

    @Id
    @Column("A_Period_ID")
    private Integer aPeriodId;

    @Column("A_Fiscal_Year_ID")
    private Integer aFiscalYearId;

    @Column("EndDate")
    private LocalDateTime endDate;

    @Column("Name")
    private String name;

    @Column("PeriodNo")
    private Integer periodNo;

    @Column("PeriodType")
    private String periodType;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;

    @Column("StartDate")
    private LocalDateTime startDate;
}
