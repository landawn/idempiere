package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Report Line entity - I_ReportLine table.
 * Report line import.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_ReportLine")
public class ImportReportLine extends BaseEntity {

    @Id
    @Column("I_ReportLine_ID")
    private Integer iReportLineId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("ReportLineSetName")
    private String reportLineSetName;

    @Column("PA_ReportLineSet_ID")
    private Integer paReportLineSetId;

    @Column("PA_ReportLine_ID")
    private Integer paReportLineId;

    @Column("LineType")
    private String lineType;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("IsSummary")
    private String isSummary;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("I_IsImported")
    private String iIsImported;

    @Column("Processed")
    private String processed;
}
