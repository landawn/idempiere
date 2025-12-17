package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Format Item Translation entity - AD_PrintFormatItem_Trl table.
 * Print format item translation.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintFormatItem_Trl")
public class PrintFormatItemTrl extends BaseEntity {

    @Id
    @Column("AD_PrintFormatItem_ID")
    private Integer adPrintFormatItemId;

    @Id
    @Column("AD_Language")
    private String adLanguage;

    @Column("PrintName")
    private String printName;

    @Column("PrintNameSuffix")
    private String printNameSuffix;

    @Column("IsTranslated")
    private String isTranslated;
}
