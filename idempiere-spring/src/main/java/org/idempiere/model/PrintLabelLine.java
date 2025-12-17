package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Label Line entity - AD_PrintLabelLine table.
 * Print label line item definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintLabelLine")
public class PrintLabelLine extends BaseEntity {

    @Id
    @Column("AD_PrintLabelLine_ID")
    private Integer adPrintLabelLineId;

    @Column("AD_PrintLabel_ID")
    private Integer adPrintLabelId;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("PrintName")
    private String printName;

    @Column("LabelFormatType")
    private String labelFormatType;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_LabelPrinterFunction_ID")
    private Integer adLabelPrinterFunctionId;

    @Column("XPosition")
    private Integer xPosition;

    @Column("YPosition")
    private Integer yPosition;
}
