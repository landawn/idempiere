package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Import Format Row entity.
 * Maps to AD_ImpFormat_Row table.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_ImpFormat_Row")
public class ImportFormatRow extends BaseEntity {

    @Id
    @Column("AD_ImpFormat_Row_ID")
    private Integer adImpFormatRowId;

    @Column("AD_ImpFormat_ID")
    private Integer adImpFormatId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("SeqNo")
    private Integer seqNo;

    @Column("AD_Column_ID")
    private Integer adColumnId;

    @Column("DataType")
    private String dataType;

    @Column("DataFormat")
    private String dataFormat;

    @Column("DecimalPoint")
    private String decimalPoint;

    @Column("DivideBy100")
    private String divideBy100;

    @Column("ConstantValue")
    private String constantValue;

    @Column("Callout")
    private String callout;

    @Column("Script")
    private String script;

    @Column("StartNo")
    private Integer startNo;

    @Column("EndNo")
    private Integer endNo;
}
