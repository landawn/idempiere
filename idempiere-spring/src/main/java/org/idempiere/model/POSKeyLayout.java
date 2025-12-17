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
 * Point of Sale key layout configuration.
 */
@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Table("C_POSKeyLayout")
public class POSKeyLayout extends BaseEntity {

    @Id
    @Column("C_POSKeyLayout_ID")
    private Integer cPosKeyLayoutId;

    @Column("Name")
    private String name;

    @Column("Description")
    private String description;

    @Column("Help")
    private String help;

    @Column("POSKeyLayoutType")
    private String posKeyLayoutType;

    @Column("Columns")
    private Integer columns;

    @Column("PrintColor_ID")
    private Integer printColorId;

    @Column("PrintFont_ID")
    private Integer printFontId;
}
