package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Format Item entity.
 * Maps to AD_PrintFormatItem table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintFormatItem")
public class PrintFormatItem extends BaseEntity {

    @Id
    @Column("AD_PrintFormatItem_ID")
    private Integer adPrintFormatItemId;

    @Column("AD_PrintFormat_ID")
    private Integer adPrintFormatId;

    @Column("Name")
    private String name;

    @Column("PrintName")
    private String printName;

    @Column("IsPrinted")
    private String isPrinted;

    @Column("PrintAreaType")
    private String printAreaType;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("PrintFormatType")
    private String printFormatType;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_PrintFormatChild_ID")
    private Integer adPrintFormatChildId;

    @Column("IsRelativePosition")
    private String isRelativePosition;

    @Column("IsNextLine")
    private String isNextLine;

    @Column("XPosition")
    private Integer xPosition;

    @Column("YPosition")
    private Integer yPosition;

    @Column("XSpace")
    private Integer xSpace;

    @Column("YSpace")
    private Integer ySpace;

    @Column("MaxWidth")
    private Integer maxWidth;

    @Column("MaxHeight")
    private Integer maxHeight;

    @Column("IsHeightOneLine")
    private String isHeightOneLine;

    @Column("FieldAlignmentType")
    private String fieldAlignmentType;

    @Column("LineAlignmentType")
    private String lineAlignmentType;

    @Column("AD_PrintColor_ID")
    private Integer adPrintColorId;

    @Column("AD_PrintFont_ID")
    private Integer adPrintFontId;

    @Column("IsOrderBy")
    private String isOrderBy;

    @Column("SortNo")
    private Integer sortNo;

    @Column("IsGroupBy")
    private String isGroupBy;

    @Column("IsPageBreak")
    private String isPageBreak;

    @Column("IsSummarized")
    private String isSummarized;

    @Column("IsCounted")
    private String isCounted;

    @Column("IsMinCalc")
    private String isMinCalc;

    @Column("IsMaxCalc")
    private String isMaxCalc;

    @Column("IsAveraged")
    private String isAveraged;

    @Column("IsVarianceCalc")
    private String isVarianceCalc;

    @Column("IsDeviationCalc")
    private String isDeviationCalc;

    @Column("IsRunningTotal")
    private String isRunningTotal;

    @Column("RunningTotalLines")
    private Integer runningTotalLines;

    @Column("IsFixedWidth")
    private String isFixedWidth;

    @Column("IsNextPage")
    private String isNextPage;

    @Column("ImageIsAttached")
    private String imageIsAttached;

    @Column("ImageURL")
    private String imageUrl;

    @Column("IsSetNLPosition")
    private String isSetNLPosition;

    @Column("IsSuppressNull")
    private String isSuppressNull;

    @Column("BelowColumn")
    private Integer belowColumn;

    @Column("IsFilledRectangle")
    private String isFilledRectangle;

    @Column("LineWidth")
    private Integer lineWidth;

    @Column("ArcDiameter")
    private Integer arcDiameter;

    @Column("ShapeType")
    private String shapeType;

    @Column("IsCentrallyMaintained")
    private String isCentrallyMaintained;

    @Column("IsImageField")
    private String isImageField;

    @Column("FormatPattern")
    private String formatPattern;

    @Column("BarcodeType")
    private String barcodeType;

    @Column("IsSuppressRepeats")
    private String isSuppressRepeats;

    @Column("IsDesc")
    private String isDesc;
}
