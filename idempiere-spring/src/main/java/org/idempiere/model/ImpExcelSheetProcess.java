package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Excel Sheet Process entity - I_ExcelSheetProcess table.
 * Excel import sheet process configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_ExcelSheetProcess")
public class ImpExcelSheetProcess extends BaseEntity {

    @Id
    @Column("I_ExcelSheetProcess_ID")
    private Integer iExcelSheetProcessId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("SheetNo")
    private Integer sheetNo;

    @Column("StartRow")
    private Integer startRow;

    @Column("EndRow")
    private Integer endRow;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("RowCount")
    private Integer rowCount;

    @Column("ErrorCount")
    private Integer errorCount;

    @Column("Processed")
    private String processed;
}
