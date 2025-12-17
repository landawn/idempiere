package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report View Column entity.
 * Maps to AD_ReportView_Col table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ReportView_Col")
public class ReportViewCol extends BaseEntity {

    @Id
    @Column("AD_ReportView_Col_ID")
    private Integer adReportViewColId;

    @Column("AD_ReportView_ID")
    private Integer adReportViewId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("FunctionColumn")
    private String functionColumn;

    @Column("IsGroupFunction")
    private String isGroupFunction;
}
