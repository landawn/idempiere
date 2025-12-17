package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Label Printer Function entity.
 * Maps to AD_LabelPrinterFunction table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LabelPrinterFunction")
public class LabelPrinterFunction extends BaseEntity {

    @Id
    @Column("AD_LabelPrinterFunction_ID")
    private Integer adLabelPrinterFunctionId;

    @Column("AD_LabelPrinter_ID")
    private Integer adLabelPrinterId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("FunctionPrefix")
    private String functionPrefix;

    @Column("FunctionSuffix")
    private String functionSuffix;

    @Column("IsXYPosition")
    private String isXYPosition;

    @Column("XYSeparator")
    private String xySeparator;
}
