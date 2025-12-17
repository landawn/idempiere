package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * Print Color entity - AD_PrintColor table.
 * Color definitions for printing.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("AD_PrintColor")
public class PrintColor extends BaseEntity {

    @Id
    @Column("AD_PrintColor_ID")
    private Integer adPrintColorId;

    @Column("Name")
    private String name;

    @Column("Code")
    private String code;

    @Column("IsDefault")
    private String isDefault;
}
