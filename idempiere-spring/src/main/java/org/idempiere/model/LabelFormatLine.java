package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Label Format Line entity - AD_LabelFormatLine table.
 * Label format line definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LabelFormatLine")
public class LabelFormatLine extends BaseEntity {

    @Id
    @Column("AD_LabelFormatLine_ID")
    private Integer adLabelFormatLineId;

    @Column("AD_LabelFormat_ID")
    private Integer adLabelFormatId;

    @Column("Name")
    private String name;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_LabelPrinterFunction_ID")
    private Integer adLabelPrinterFunctionId;

    @Column("XPosition")
    private Integer xPosition;

    @Column("YPosition")
    private Integer yPosition;

    @Column("LabelFormatType")
    private String labelFormatType;

    @Column("PrintName")
    private String printName;
}
