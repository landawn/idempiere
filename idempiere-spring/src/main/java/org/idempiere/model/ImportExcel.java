package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Excel entity - I_Excel table.
 * Excel import template.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("I_Excel")
public class ImportExcel extends BaseEntity {

    @Id
    @Column("I_Excel_ID")
    private Integer iExcelId;

    @Column("AD_Tab_ID")
    private Integer adTabId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("SheetNo")
    private Integer sheetNo;

    @Column("RowNo")
    private Integer rowNo;

    @Column("ColumnNo")
    private Integer columnNo;

    @Column("CellValue")
    private String cellValue;

    @Column("IsError")
    private String isError;

    @Column("I_ErrorMsg")
    private String iErrorMsg;

    @Column("Processed")
    private String processed;

    @Column("I_IsImported")
    private String iIsImported;
}
