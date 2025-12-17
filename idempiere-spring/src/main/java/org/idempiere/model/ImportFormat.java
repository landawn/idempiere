package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Format entity.
 * Maps to AD_ImpFormat table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ImpFormat")
public class ImportFormat extends BaseEntity {

    @Id
    @Column("AD_ImpFormat_ID")
    private Integer adImpFormatId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("FormatType")
    private String formatType;

    @Column("Processing")
    private String processing;

    @Column("SeparatorChar")
    private String separatorChar;

    @Column("DecimalPoint")
    private String decimalPoint;
}
