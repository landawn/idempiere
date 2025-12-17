package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Report entity - PA_Report table.
 * Financial report definitions.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("PA_Report")
public class Report extends BaseEntity {

    @Id
    @Column("PA_Report_ID")
    private Integer paReportId;

    @Column("C_AcctSchema_ID")
    private Integer cAcctSchemaId;

    @Column("PA_ReportLineSet_ID")
    private Integer paReportLineSetId;

    @Column("PA_ReportColumnSet_ID")
    private Integer paReportColumnSetId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("ListSources")
    private String listSources;

    @Column("ListTrx")
    private String listTrx;

    @Column("Processing")
    private String processing;

    @Column("C_Calendar_ID")
    private Integer cCalendarId;

    @Column("JasperProcess_ID")
    private Integer jasperProcessId;
}
