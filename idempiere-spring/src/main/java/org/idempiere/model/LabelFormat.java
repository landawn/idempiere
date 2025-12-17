package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Label Format entity - AD_LabelFormat table.
 * Label printing format definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_LabelFormat")
public class LabelFormat extends BaseEntity {

    @Id
    @Column("AD_LabelFormat_ID")
    private Integer adLabelFormatId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_LabelPrinter_ID")
    private Integer adLabelPrinterId;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("IsTableBased")
    private String isTableBased;

    @Column("LabelFormatType")
    private String labelFormatType;

    @Column("LabelHeight")
    private Integer labelHeight;

    @Column("LabelWidth")
    private Integer labelWidth;
}
