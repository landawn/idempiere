package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Export Format Line entity - EXP_FormatLine table.
 * Line item in export format definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("EXP_FormatLine")
public class EXPFormatLine extends BaseEntity {

    @Id
    @Column("EXP_FormatLine_ID")
    private Integer expFormatLineId;

    @Column("EXP_Format_ID")
    private Integer expFormatId;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("AD_Reference_ID")
    private Integer adReferenceId;

    @Column("DateFormat")
    private String dateFormat;

    @Column("Description")
    private String description;

    @Column("EXP_EmbeddedFormat_ID")
    private Integer expEmbeddedFormatId;

    @Column("IsMandatory")
    private String isMandatory;

    @Column("IsPartUniqueIndex")
    private String isPartUniqueIndex;

    @Column("Name")
    private String name;

    @Column("Position")
    private Integer position;

    @Column("Type")
    private String type;

    @Column("Value")
    private String value;
}
