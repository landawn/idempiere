package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Table Format entity - AD_PrintTableFormat table.
 * Table format definitions for printing.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintTableFormat")
public class PrintTableFormat extends BaseEntity {

    @Id
    @Column("AD_PrintTableFormat_ID")
    private Integer adPrintTableFormatId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsPrintFunctionSymbols")
    private String isPrintFunctionSymbols;

    @Column("IsMultiLineHeader")
    private String isMultiLineHeader;

    @Column("IsPrintPageBreak")
    private String isPrintPageBreak;

    @Column("HeaderLeft")
    private String headerLeft;

    @Column("HeaderCenter")
    private String headerCenter;

    @Column("HeaderRight")
    private String headerRight;

    @Column("FooterLeft")
    private String footerLeft;

    @Column("FooterCenter")
    private String footerCenter;

    @Column("FooterRight")
    private String footerRight;

    @Column("AD_PrintFont_ID")
    private Integer adPrintFontId;

    @Column("Hdr_PrintFont_ID")
    private Integer hdrPrintFontId;

    @Column("Funct_PrintFont_ID")
    private Integer functPrintFontId;

    @Column("FunctBG_PrintColor_ID")
    private Integer functBgPrintColorId;

    @Column("FunctFG_PrintColor_ID")
    private Integer functFgPrintColorId;

    @Column("HdrTextBG_PrintColor_ID")
    private Integer hdrTextBgPrintColorId;

    @Column("HdrTextFG_PrintColor_ID")
    private Integer hdrTextFgPrintColorId;

    @Column("HdrLine_PrintColor_ID")
    private Integer hdrLinePrintColorId;

    @Column("Line_PrintColor_ID")
    private Integer linePrintColorId;

    @Column("HeaderStroke")
    private Integer headerStroke;

    @Column("HeaderStrokeType")
    private String headerStrokeType;

    @Column("LineStroke")
    private Integer lineStroke;

    @Column("LineStrokeType")
    private String lineStrokeType;

    @Column("ImageURL")
    private String imageURL;

    @Column("ImageIsAttached")
    private String imageIsAttached;
}
