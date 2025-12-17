package org.idempiere.model;

import java.math.BigDecimal;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Paper entity - AD_PrintPaper table.
 * Paper definitions for printing.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintPaper")
public class PrintPaper extends BaseEntity {

    @Id
    @Column("AD_PrintPaper_ID")
    private Integer adPrintPaperId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("IsDefault")
    private String isDefault;

    @Column("IsLandscape")
    private String isLandscape;

    @Column("Code")
    private String code;

    @Column("MarginTop")
    private Integer marginTop;

    @Column("MarginBottom")
    private Integer marginBottom;

    @Column("MarginLeft")
    private Integer marginLeft;

    @Column("MarginRight")
    private Integer marginRight;

    @Column("SizeX")
    private BigDecimal sizeX;

    @Column("SizeY")
    private BigDecimal sizeY;

    @Column("DimensionUnits")
    private String dimensionUnits;
}
