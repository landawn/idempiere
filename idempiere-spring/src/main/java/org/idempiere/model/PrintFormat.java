package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Format entity.
 * Maps to AD_PrintFormat table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintFormat")
public class PrintFormat extends BaseEntity {

    @Id
    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("AD_ReportView_ID")
    private Integer adReportViewId;

    @Column("IsTableBased")
    private String isTableBased;

    @Column("IsForm")
    private String isForm;

    @Column("IsDefault")
    private String isDefault;

    @Column("AD_PrintPaper_ID")
    private Integer adPrintPaperId;

    @Column("AD_PrintColor_ID")
    private Integer adPrintColorId;

    @Column("AD_PrintFont_ID")
    private Integer adPrintFontId;

    @Column("IsStandardHeaderFooter")
    private String isStandardHeaderFooter;

    @Column("HeaderMargin")
    private Integer headerMargin;

    @Column("FooterMargin")
    private Integer footerMargin;

    @Column("CreateCopy")
    private String createCopy;

    @Column("PrinterName")
    private String printerName;

    @Column("AD_PrintTableFormat_ID")
    private Integer adPrintTableFormatId;

    @Column("JasperProcess_ID")
    private Integer jasperProcessId;

    @Column("IsSummaryWithNodes")
    private String isSummaryWithNodes;
}
