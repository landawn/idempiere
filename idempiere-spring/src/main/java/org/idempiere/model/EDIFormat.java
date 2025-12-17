package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * EDI Format entity - C_EDI_Format table.
 * EDI export/import format definition.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_EDI_Format")
public class EDIFormat extends BaseEntity {

    @Id
    @Column("C_EDI_Format_ID")
    private Integer cEdiFormatId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("AD_Table_ID")
    private Integer adTableId;

    @Column("FormatType")
    private String formatType;

    @Column("Version")
    private String version;
}
