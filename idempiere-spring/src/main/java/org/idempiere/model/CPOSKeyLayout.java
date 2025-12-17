package org.idempiere.model;

import com.landawn.abacus.annotation.Column;
import com.landawn.abacus.annotation.Id;
import com.landawn.abacus.annotation.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * POS Key Layout entity - C_POSKeyLayout table.
 * Point of Sale key layout.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSKeyLayout")
public class CPOSKeyLayout extends BaseEntity {

    @Id
    @Column("C_POSKeyLayout_ID")
    private Integer cPosKeyLayoutId;

    @Column("AD_PrintColor_ID")
    private Integer adPrintColorId;

    @Column("AD_PrintFont_ID")
    private Integer adPrintFontId;

    @Column("Columns")
    private Integer columns;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("Name")
    private String name;

    @Column("POSKeyLayoutType")
    private String posKeyLayoutType;
}
