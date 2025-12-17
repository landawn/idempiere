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
 * Asset Fiscal Year entity - A_Fiscal_Year table.
 * Fiscal year for asset depreciation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("A_Fiscal_Year")
public class AFiscalYear extends BaseEntity {

    @Id
    @Column("A_Fiscal_Year_ID")
    private Integer aFiscalYearId;

    @Column("DateEnd")
    private LocalDateTime dateEnd;

    @Column("DateStart")
    private LocalDateTime dateStart;

    @Column("Description")
    private String description;

    @Column("FiscalYear")
    private String fiscalYear;

    @Column("Processed")
    private String processed;

    @Column("Processing")
    private String processing;
}
