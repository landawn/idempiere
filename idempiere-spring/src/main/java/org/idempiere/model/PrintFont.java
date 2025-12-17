package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Font entity - AD_PrintFont table.
 * Font definitions for printing.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintFont")
public class PrintFont extends BaseEntity {

    @Id
    @Column("AD_PrintFont_ID")
    private Integer adPrintFontId;

    @Column("Name")
    private String name;

    @Column("IsDefault")
    private String isDefault;

    @Column("Code")
    private String code;
}
